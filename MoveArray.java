import java.util.*;
public class MoveArray{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().trim();
        int len=str.length();
        str=str.substring(1,len-1);
        String[] arr=str.split("\\,");
        int flag=0;
        int alen=arr.length;
        for(int i=0;i<alen;i++){
            int x=Integer.parseInt(arr[i]);
            flag+=x;
            if(flag<0||flag>=alen){
                System.out.println("true");
                return;
            }
            
        }
        System.out.println("false");
    }
}