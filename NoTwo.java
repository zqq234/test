import java.util.*;
public class NoTwo{
    public static int noTwo(int w,int h){
        int count=0;
        int[][]arr=new int[w][h];
        for(int i=0;i<w;i++){
            for(int j=0;j<h;j++){
                if(arr[i][j]!=1){
                    count++;
                    if(i+2<w){
                        arr[i+2][j]=1;
                    }
                    if(j+2<h){
                        arr[i][j+2]=1;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int h=sc.nextInt();
        System.out.println(noTwo(w,h));
    }
}