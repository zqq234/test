import java.util.*;
public class CountStu{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            List<Integer> list=new ArrayList<>();
            
            for(int i=0;i<n;i++){
                list.add(sc.nextInt());
            }
            int m=sc.nextInt();
            int count=0;
            for(int x:list){
                if(m==x){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}