import java.util.*;
public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char x:str.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}