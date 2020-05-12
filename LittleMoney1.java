import java.util.*;
public class LittleMoney1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str1=sc.next();
            String[]arr1=str1.split("\\.");
            String str2=sc.next();
            String[] arr2=str2.split("\\.");
            int[] weight={19*17,17,1};
            int a=Integer.parseInt(arr2[0])*weight[0]+Integer.parseInt(arr2[1])*weight[1]+Integer.parseInt(arr2[2]);
            int p=Integer.parseInt(arr1[0])*weight[0]+Integer.parseInt(arr1[1])*weight[1]+Integer.parseInt(arr1[2]);
            int res=a-p;
            if(res<0){
                System.out.print("-");
                res=-res;
            }
            System.out.println(res/weight[0]+"."+(res%weight[0]/weight[1])+"."+(res%weight[0]%weight[1]/weight[2]));
        }
    }
}