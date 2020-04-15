import java.util.*;
public class GetSequeOddNum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int m=sc.nextInt();
        int first=m*m-m+1;
        StringBuffer sb=new StringBuffer();
        sb.append(first);
        for(int i=1;i<m;i++){
            sb.append("+");
            sb.append(first+i*2);
        }
        System.out.println(sb.toString());
        } 
    }
}