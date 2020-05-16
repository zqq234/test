import java.util.*;
public class BrokenKeyboard{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            Set<Character> set=new HashSet<>();
            String str=sc.nextLine().toUpperCase();
            String s=sc.nextLine().toUpperCase();
            for(int i=0;i<s.length();i++){
                set.add(s.charAt(i));
            }
            Set<Character> set1=new HashSet<>();
            for(int i=0;i<str.length();i++){
                char x=str.charAt(i);
                if(!set.contains(x)&&!set1.contains(x)){
                    set1.add(x);
                    System.out.print(x);
                }
            }
        }
    }
}