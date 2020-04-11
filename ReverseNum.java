import java.util.Scanner;
public class ReverseNum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String str="";
        while(num!=0){
            String s=String.valueOf(num%10);
            num/=10;
            str+=s;
        }
        System.out.println(str);
    }
}