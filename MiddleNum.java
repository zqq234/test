import java.util.*;
public class MiddleNum {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(",");
        System.out.println(Arrays.toString(s));
        int len=s.length;
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            s[i]=s[i].trim();
            arr[i]=Integer.parseInt(s[i]);
        }
        Arrays.sort(arr);
        if(len%2==0){
            System.out.println((arr[len/2]+arr[(len-1)/2])/2);
        }else{
            System.out.println(arr[len/2]);
        }
}