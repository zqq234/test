import java.util.*;
public class Ball{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int x0=sc.nextInt();
            int y0=sc.nextInt();
            int z0=sc.nextInt();
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int z1=sc.nextInt();
            double r=Math.sqrt((x1-x0)*(x1-x0)+(y1-y0)*(y1-y0)+(z1-z0)*(z1-z0));
            double t=(Math.acos(-1)*4/3*r*r*r);
            System.out.print(String.format("%.3f",r)+" "+String.format("%.3f",t)); 
        }
    }
}