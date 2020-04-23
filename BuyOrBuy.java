import java.util.*;
public class BuyOrBuy{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            int[] count=new int[300];
            for(char x:str1.toCharArray()){
                count[x]++;
            }
            boolean flag=true;
            int sum=0;
            for(char x:str2.toCharArray()){
                if(count[x]>0){
                    count[x]--;
                }else{
                    flag=false;
                    sum++;
                }
            }
            if(flag){
                System.out.println("Yes "+(str1.length()-str2.length()));
            }else{
                System.out.println("No "+sum);
            }
        }      
    }
}