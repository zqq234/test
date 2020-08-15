import java.util.*;
public class Permutation{
    public ArrayList<String> Permutation(String str) {
       ArrayList<String> res=new ArrayList<>();
        Set<String> set=new HashSet<>();
        if(str.length()==0)
            return res;
        func(res,set,str.toCharArray(),0,str.length());
        Collections.sort(res);
        return res;
    }
    public void swap(char[] array,int x,int y){
        char temp=array[x];
        array[x]=array[y];
        array[y]=temp;
    }
    public void func(ArrayList<String> res,Set<String> set,char[] array,int start,int len){
        if(start==len){
            String x=new String(array);
            if(!set.contains(x)){
                res.add(x);
            }
            set.add(x);
            return;
        }
        for(int i=start;i<len;i++){
            swap(array,i,start);
            func(res,set,array,start+1,len);
            swap(array,i,start);
        }
    }
}