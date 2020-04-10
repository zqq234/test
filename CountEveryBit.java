import java.util.*;
public class CountEveryBit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String str=sc.nextLine();
            int[] arr=new int[10];
            for(char x:str.toCharArray()){
                arr[Integer.parseInt(x+"")]++;
            }
            for(int i=0;i<10;i++){
                if(arr[i]>0){
                    System.out.println(i+":"+arr[i]);
                }
            }
        }   
    }
}