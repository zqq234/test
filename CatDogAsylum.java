import java.util.*;

public class CatDogAsylum {
    public ArrayList<Integer> asylum(int[][] ope) {
        ArrayList<Integer> list=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        for(int[] a:ope){
            if(a[0]==1){
                if(a[1]!=0){
                    l.add(a[1]);
                }
                
            }else{
                if(a[1]==0){
                    list.add(l.remove(0));
                }else if(a[1]==1){
                    int flag=0;
                    int len=l.size();
                    while(flag<len&&l.get(flag)<0){
                        flag++;                                        
                    }
                    if(flag<len){
                        list.add(l.remove(flag));
                    }
                    
                }else{
                    int flag=0;
                    int len=l.size();
                    while(flag<len&&l.get(flag)>0){
                        flag++;
                    }
                    if(flag<len){
                        list.add(l.remove(flag));
                    }
                   
                }
            }
        }
        return list;
    }
}
