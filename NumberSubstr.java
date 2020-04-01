import java.util.*;
public class NumberSubstr{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        int length=0;
        int end=0;
        for(int i=0;i<str.length();i++){
            char x=str.charAt(i);
            if(x>='0'&&x<='9'){
                count++;
                if(length<count){
                    length=count;
                    end=i;
                }
            }else{
                count=0;
            }
        }
        System.out.println(str.substring(end-length+1,end+1));
    }
}