import java.util.*;
public class DNA{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.next();
        int n=sc.nextInt();
        String res=null;
        int max=0;
        int len=str.length();
        for(int i=0;i<len-n+1;i++){
            int count=0;
            int j=i;
            for(;j<i+n;j++){
                if(str.charAt(j)=='G'||str.charAt(j)=='C'){
                    count++;
                }  
            }
            if(count>max){
                max=count;
                res=str.substring(i,i+n);
            }  
        }
        System.out.println(res);
        } 
    }
}