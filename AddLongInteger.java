import java.util.*;
public class AddLongInteger{
    public static String AddLongInteger(String addend,String augend){
        StringBuffer sb=new StringBuffer();
        int len1=addend.length()-1;
        int len2=augend.length()-1;
        int flag=0;
        while(len1>=0&&len2>=0){
            int sum=addend.charAt(len1--)-'0'+augend.charAt(len2--)-'0'+flag;
            flag=sum/10;
            sb.append(sum%10);
      
        }
        while(len1>=0){
            int sum=addend.charAt(len1--)-'0'+flag;
            flag=sum/10;
            sb.append(sum%10);
        }
        while(len2>=0){
            int sum=augend.charAt(len2--)-'0'+flag;
            flag=sum/10;
            sb.append(sum%10);
        }
        if(flag==1){
            sb.append(1);
        }
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String addend=sc.next();
            String augend=sc.next();
            System.out.println(AddLongInteger(addend,augend));  
        }
    }
}