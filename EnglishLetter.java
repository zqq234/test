/**
 * @className EnglishLetter
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 13:56
 * @Version 1.0
 **/
public class EnglishLetter {
    public static void main(String[] args) {
        int count=0;
        for (int i = 97; i <123 ; i++) {
            System.out.print(" "+(char)i);
            count++;
            if(count%5==0){
                System.out.println();
            }
        }
    }
}
