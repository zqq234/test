import java.util.*;
public class CountChar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next().toLowerCase();
        String x=sc.next();
        System.out.println(str.length()-str.replace(x,"").length());
    }
}