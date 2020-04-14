import java.util.*;
public class MinNum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        int flag=0;
        while(sc.hasNextInt()){
            arr[flag++]=sc.nextInt();
        }
        
        StringBuffer sb=new StringBuffer();
        int j=1;
        while(true){
            if(arr[j]!=0){
                sb.append(j);
                arr[j]--;
                break;
            }else{
                j++;
            }
        }
        for(int i=0;i<10;i++){
            while(arr[i]!=0){
                sb.append(i);
                arr[i]--;
            }
        }
        System.out.println(sb.toString());
    }
}