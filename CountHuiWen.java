import java.util.Scanner;
public class CountHuiWen {
    public static boolean isHui(String str){
        int len=str.length();
        for(int i=0;i<len/2;i++){
            if(str.charAt(i)!=str.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
    public static int func(String a,String b){
        int sum=0;
        int len=a.length();
       for(int i=0;i<=len;i++){
           StringBuffer sb=new StringBuffer(a);
           sb.insert(i,b);
           if(isHui(sb.toString())){
               sum++;
           }
       } 
        return sum;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(a==null){
            System.out.println(0);
            return;
        }else if(b==null){
            if(isHui(b)){
                System.out.println(b.length());
                return;
            }
        }
        int res=func(a,b);
        System.out.println(res);
    }
}