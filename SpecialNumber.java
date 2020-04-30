import java.util.*;
public class SpecialNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int s=n*n;
            while(n!=0){
                if(n%10!=s%10){
                    System.out.println("No!");
                    return;
                }
                n=n/10;
                s=s/10;
            }
            System.out.println("Yes!");
        }
    }
}