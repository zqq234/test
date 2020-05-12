import java.util.*;
public class LittleMoney{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str1=sc.next();
            String[]arr1=str1.split("\\.");
            String str2=sc.next();
            String[] arr2=str2.split("\\.");
            int[] res=new int[3];
            int flag=0;
            for(int i=2;i>=0;i--){
                res[i]=Integer.parseInt(arr2[i])-Integer.parseInt(arr1[i])-flag;
                flag=0;
                if(res[i]<0){
                    if(i==2){
                        res[i]+=19;
                        flag=1;
                    }else if(i==1){
                        res[i]+=17;
                        flag=1;
                    }
                }
            }
            System.out.print(res[0]);
            for(int i=1;i<3;i++){
                System.out.print("."+res[i]);
            }
        }
    }
}