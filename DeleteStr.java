import java.util.*;
public class DeleteStr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        for(int i=0;i<str1.length();i++){
            char x=str1.charAt(i);
            if(!str2.contains(String.valueOf(x))){
                System.out.print(x);
            }
        }
    }
}