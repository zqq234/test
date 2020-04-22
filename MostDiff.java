// write your code here
import java.util.*;
public class MostDiff{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String line=sc.nextLine();
            StringBuffer sb=new StringBuffer();
            
            for(char x:line.toCharArray()){
                if(x<'A'||x>'Z'){
                    sb.append(" ");
                    continue;
                }
                if(x<'F'){
                    sb.append((char)(x-'A'+'Z'-5+1));
                }else 
                    sb.append((char)(x-5)); 
                }
            
            System.out.println(sb.toString());
        }
    }
}