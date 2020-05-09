import java.util.*;
public class Verify{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String str=sc.nextLine();
            for(char x:str.toCharArray()){
                int ch=(int)x;
                int count=number(ch);
                verify(count,ch);
            }
        }
    }
    public static int number(int ch){
        int count=0;
        while(ch!=0){
            ch=ch&(ch-1);
            count++;
        }
        return count;
    }
    public static void verify(int count,int ch){
        StringBuffer sb=new StringBuffer();
        while(ch>0){
            sb.append(ch&1);
            ch=ch>>1;
        }
        if(sb.length()<7){
            sb.append("0");
        }
        if(count%2==0){
            sb.append("1");
        }else{
            sb.append("0");
        }
        System.out.println(sb.reverse());
    }
}