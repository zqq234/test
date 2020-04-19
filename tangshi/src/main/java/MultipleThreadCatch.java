import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomText;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.NlpAnalysis;

import javax.sql.DataSource;
import java.io.IOException;
import java.net.MalformedURLException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @className MultipleThreadCatch
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/2/12 17:47
 * @Version 1.0
 **/
public class MultipleThreadCatch {
    private static AtomicInteger successCount=new AtomicInteger(0);
    private static AtomicInteger failureCoutn=new AtomicInteger(0);
    private static class Job implements Runnable{

        private String url;
        private DataSource dataSource;
        //private CountDownLatch countDownLatch;


        public Job(String url,DataSource dataSource){
            this.url=url;
            //this.messageDigest=messageDigest;
            this.dataSource=dataSource;
            //this.countDownLatch=countDownLatch;
        }
        public void run(){

            WebClient client=new WebClient(BrowserVersion.CHROME);
            client.getOptions().setJavaScriptEnabled(false);
            client.getOptions().setCssEnabled(false);
            try{
                MessageDigest messageDigest=MessageDigest.getInstance("SHA-256");
                HtmlPage page=client.getPage(url);
                String xpath;
                DomText domText;
                xpath="//div[@class='cont']/h1/text()";
                domText=(DomText)page.getBody().getByXPath(xpath).get(0);
                String title=domText.asText();

                xpath="//div[@class='cont']/p[@class='source']/a[1]/text()";
                domText=(DomText)page.getBody().getByXPath(xpath).get(0);
                String dynasty=domText.asText();

                xpath="//div[@class='cont']/p[@class='source']/a[2]/text()";
                domText=(DomText)page.getBody().getByXPath(xpath).get(0);
                String author=domText.asText();

                xpath="//div[@class='cont']/div[@class='contson']";
                HtmlElement element=(HtmlElement)page.getBody().getByXPath(xpath).get(0);
                String content=element.getTextContent().trim();
                //1.计算sha-256
                String s=title+content;
                messageDigest.update(s.getBytes("utf8"));
                byte[] result=messageDigest.digest();
                StringBuilder sha256=new StringBuilder();
                for(byte b:result){
                    sha256.append(String.format("%02x",b));
                }
                //2.计算分词
                List<Term> termList=new ArrayList<>();
                termList.addAll(NlpAnalysis.parse(title).getTerms());
                termList.addAll(NlpAnalysis.parse(content).getTerms());
                List<String> words=new ArrayList<>();
                for(Term term:termList) {
                    if (term.getNatureStr().equals("w")) {
                        continue;
                    }
                    if (term.getNatureStr().equals("null")) {
                        continue;
                    }
                    if (term.getRealName().length() < 2) {
                        continue;
                    }
                    words.add(term.getRealName());
                }
                String insertWords=String.join(",",words);
                try(Connection connection=dataSource.getConnection()) {
                    String sql = "insert into tangshi(sha256,dynasty,title,author,content,words) values (?,?,?,?,?,?)";
                    PreparedStatement statement = connection.prepareStatement(sql);
                    statement.setString(1, sha256.toString());
                    statement.setString(2, dynasty);
                    statement.setString(3, title);
                    statement.setString(4, author);
                    statement.setString(5, content);
                    statement.setString(6, insertWords);
                    com.mysql.jdbc.PreparedStatement mysqlStatement = (com.mysql.jdbc.PreparedStatement) statement;
                    System.out.println(mysqlStatement.asSql());
                    statement.executeUpdate();
                    successCount.getAndIncrement();
                    //System.out.println(title+"插入成功");
                } catch (SQLException e) {
                    if (!e.getMessage().contains("Duplicate entry")) {
                        e.printStackTrace();
                        failureCoutn.getAndIncrement();
                    } else {
                        successCount.getAndIncrement();
                    }
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
                failureCoutn.getAndIncrement();
            } catch (IOException e) {
                e.printStackTrace();
                failureCoutn.getAndIncrement();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                failureCoutn.getAndIncrement();
            }
        }

    }
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, InterruptedException {
        ExecutorService pool= Executors.newFixedThreadPool(40);
        WebClient client=new WebClient(BrowserVersion.CHROME);
        client.getOptions().setJavaScriptEnabled(false);
        //不在执行css布局
        client.getOptions().setCssEnabled(false);
        String baseUrl="https://so.gushiwen.org";
        String pathUrl="/gushi/tangshi.aspx";
        List<String> detailUrlLsit=new ArrayList<>();
        {
            String url=baseUrl+pathUrl;
            HtmlPage page= client.getPage(url);
            List<HtmlElement> divs=page.getBody().getElementsByAttribute("div","class","typecont");
            for(HtmlElement div:divs){
                List<HtmlElement> as=div.getElementsByTagName("a");
                for(HtmlElement a:as){
                    String detailUrl=a.getAttribute("href");
                    detailUrlLsit.add(baseUrl+detailUrl);
                }
            }
        }
        DataSource dataSource=new MysqlConnectionPoolDataSource();
        ((MysqlConnectionPoolDataSource) dataSource).setServerName("127.0.0.1");
        ((MysqlConnectionPoolDataSource) dataSource).setPort(3306);
        ((MysqlConnectionPoolDataSource) dataSource).setUser("root");
        ((MysqlConnectionPoolDataSource) dataSource).setPassword("12345");
        ((MysqlConnectionPoolDataSource) dataSource).setDatabaseName("q");
        ((MysqlConnectionPoolDataSource) dataSource).setUseSSL(false);
        ((MysqlConnectionPoolDataSource) dataSource).setCharacterEncoding("utf8");



        //CountDownLatch countDownLatch=new CountDownLatch(detailUrlLsit.size());

        //详情页的请求和解析
        for(String url:detailUrlLsit){
            pool.execute(new Job(url,dataSource));
            //Thread thread=new Thread(new Job(url,messageDigest,dataSource));
           // thread.start();
        }
        //countDownLatch.wait();
        while(successCount.get()+failureCoutn.get()<detailUrlLsit.size()){
            System.out.printf("一共%d首诗，成功%d,失败%d\n",detailUrlLsit.size(),successCount.get(),failureCoutn.get());
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("全部下载成功");
        pool.shutdown();
    }
}
