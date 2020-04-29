import java.util.*;
public class CountVote{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
        int n=sc.nextInt();
        Map<String,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            map.put(sc.next(),0);
        }
        int m=sc.nextInt();
        int count=0;
        for(int i=0;i<m;i++){
            String name=sc.next();
            if(map.containsKey(name)){
                map.put(name,map.get(name)+1);
            }else{
                count++;
            }
        }
        for(String str:map.keySet()){
            System.out.println(str+" : "+map.get(str));
        }
        System.out.println("Invalid : "+count);
        }
    }
}