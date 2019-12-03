/**
 * @className ReverseStr
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/12/3 18:47
 * @Version 1.0
 **/
public class ReverseStr {
    public static String func(String str){
        String[] aa=str.split(" ");
        int left=0;
        int right=aa.length-1;
        while(left<right){
            String s=aa[left];
            aa[left]=aa[right];
            aa[right]=s;
            left++;
            right--;
        }
        StringBuffer sb=new StringBuffer();
        for(String str1:aa){
            sb.append(str1);
            sb.append(" ");
        }
        String str2=sb.toString();
        str2.trim();
        return str2;
    }
    public static void main(String[] args) {
        String str="i am a student";
        System.out.println(func(str));
    }
}
