import java.util.*;
public class PrintSquare{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int lo=sc.nextInt();
        String x=sc.next();
        int row=(int)Math.round(lo/2.0);
        for(int i=0;i<row;i++){
              for(int j=0;j<lo;j++){
                  if(i==0||i==row-1){
                    System.out.print(x);
                      continue;
                  }
                  if(j==0||j==lo-1){
                      System.out.print(x);
                  }else{
                      System.out.print(" ");
                  }
               }
            if(i!=row-1){
                 System.out.println();
            }  
        }
    }
}