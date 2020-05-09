import java.util.*;
public class BigIntSort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            List<String> res=new ArrayList<>();
            for(int i=0;i<n;i++){
                res.add(sc.next());
            }
            res.sort(new Comparator<String>(){
                public int compare(String s1,String s2){
                    if(s1.length()==s2.length()){
                        return s1.compareTo(s2);
                    }else{
                        return s1.length()-s2.length();
                    }
                }
            });
            for(int i=0;i<n;i++){
                System.out.println(res.get(i));
            }
                
        }
    }
}