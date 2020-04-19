package lab;

import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.NlpAnalysis;

import java.util.List;

/**
 * @className 分词
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/2/12 14:52
 * @Version 1.0
 **/
public class 分词 {
    public static void main(String[] args) {
        String sentence="中华人民共和国成立了！";
        List<Term> termList=NlpAnalysis.parse(sentence).getTerms();
        for(Term term:termList){
            System.out.println(term.getNatureStr()+term.getRealName());
        }
    }
}
