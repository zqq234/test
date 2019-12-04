import java.util.Scanner;
public class countString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] arr=new char[26];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;
        }
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                sb.append((char)(i+'a'));
                sb.append(i);
            }
        }
        System.out.println(sb.toString());
    }
}