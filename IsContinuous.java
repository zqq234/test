import java.util.*;
public class IsContinuous {
    public boolean isContinuous(int [] numbers) {
        if(numbers==null||numbers.length==0){
            return false;
        }
        int max=0;
        int min=13;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]!=0){
                if(!set.contains(numbers[i])){
                    set.add(numbers[i]);
                }else{
                    return false;
                }
                if(numbers[i]<min){
                    min=numbers[i];
                }
                if(numbers[i]>max){
                    max=numbers[i];
                }
            }
            
        }
        return max-min<5;
    }
}