import java.util.*;
public class SimplyRecord{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> map=new LinkedHashMap<>();
        while(sc.hasNextLine()){
            String str=sc.nextLine();
            String[] arr=str.split(" ");
            String key=arr[0].substring(arr[0].lastIndexOf("\\")+1)+" "+arr[1];
            map.put(key,map.getOrDefault(key,0)+1);
        }
        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
       Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){
           public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2){
               return o2.getValue()-o1.getValue();
           }
       });
        for(int i=0;i<8;i++){
            Map.Entry<String,Integer> entry=list.get(i);
            String[] split=entry.getKey().split(" ");
            int len=split[0].length();
            if(len>16){
                split[0]=split[0].substring(len-16);
            }
            System.out.println(split[0]+" "+split[1]+" "+entry.getValue());
        }
    }
}