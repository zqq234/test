import java.util.*;
public class MaxScore{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] arr=new int[n+1];
            for(int i=1;i<n+1;i++){
                arr[i]=sc.nextInt();
            }
            for(int j=0;j<m;j++){
                if("Q".equals(sc.next())){
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    if(a>b){
                        int temp=a;
                        a=b;
                        b=temp;
                    }
                    int max=0;
                    for(int z=a;z<=b;z++){
                        if(arr[z]>max)
                            max=arr[z];
                    }
                    System.out.println(max);
                }else{
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    arr[a]=b;
                }
            }
        }
        
        
    }
}