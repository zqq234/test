import java.util.*;
public class CountLetter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String str=sc.nextLine();
            int[] arr=new int[26];
            for(int i=0;i<str.length();i++){
                char x=str.charAt(i);
                if(x>='A'&&x<='Z'){
                    arr[x-'A']++;
                }
            }
            for(int i=0;i<26;i++){
                System.out.println((char)(i+'A')+":"+arr[i]);
            }
        }
    }
}