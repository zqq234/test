package lab;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @className HtmlUnitDemo
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/2/11 21:25
 * @Version 1.0
 **/
public class HtmlUnitDemo {
    public static void main(String[] args) throws IOException {
        //无界面的浏览器（http客户端）
        WebClient webClient=new WebClient(BrowserVersion.CHROME);
        //关闭了浏览器的js执行引擎，不在执行网页中的js
        webClient.getOptions().setJavaScriptEnabled(false);
        //不在执行css布局
        webClient.getOptions().setCssEnabled(false);
        HtmlPage page=webClient.getPage("https://so.gushiwen.org/gushi/tangshi.aspx");
        System.out.println(page);
        //page.save(new File("唐诗三百首\\列表页.html"));
        //如何从html中提取我们需要的信息
        HtmlElement body=page.getBody();
        List<HtmlElement> elements=body.getElementsByAttribute("div","class","typecont");
        for(HtmlElement element:elements){
            System.out.println(element);
        }
        HtmlElement divElement=elements.get(0);
        List<HtmlElement> aElements=divElement.getElementsByAttribute("a","target","_blank");
        for(HtmlElement e:aElements){
            System.out.println(e);
        }
        System.out.println(aElements.size());
        System.out.println(aElements.get(0).getAttribute("href"));
    }
}
