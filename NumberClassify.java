import java.util.*;
public class NumberClassify{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int a1=0;
            int count1=0;
            int a2=0;
            int flag=1;
            int count2=0;
            int a3=0;
            int a4=0;
            int count4=0;
            int a5=0;
            for(int i=0;i<n;i++){
                if(arr[i]%5==0&&arr[i]%2==0){
                    a1+=arr[i];
                    count1++;
                }
                if(arr[i]%5==1){
                    a2+=(flag*arr[i]);
                    flag*=-1;
                    count2++;
                }
                if(arr[i]%5==2){
                    a3++;
                }
                if(arr[i]%5==3){
                    a4+=arr[i];
                    count4++;
                }
                if(arr[i]%5==4){
                    if(arr[i]>a5){
                        a5=arr[i];
                    }
                }
            }
            if(count1!=0){
                System.out.print(a1+" ");
            }else{
                System.out.print("N"+" ");
            }
            if(count2!=0){
                System.out.print(a2+" ");
            }else{
                System.out.print("N"+" ");
            }
            if(a3!=0){
                System.out.print(a3+" ");
            }else{
                System.out.print("N"+" ");
            }
            if(count4!=0){
                System.out.print(String.format("%.1f",(double)a4/count4)+" ");
            }else{
                System.out.print("N"+" ");
            }
            if(a5!=0){
                System.out.print(a5);
            }else{
                System.out.print("N");
            }
        }
    }
}