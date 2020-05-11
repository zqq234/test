import java.util.*;
public class ReverseStatement{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        int len=arr.length;
        for(int i=0;i<len/2;i++){
            String tmp=arr[i];
            arr[i]=arr[len-i-1];
            arr[len-i-1]=tmp;
        }
        System.out.print(arr[0]);
        for(int i=1;i<len;i++){
            System.out.print(" "+arr[i]);
        }
    }
}