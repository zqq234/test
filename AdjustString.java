import java.util.Scanner;
public class adjustString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.replaceAll(" ","%20");
        System.out.println(str);
    }
}
