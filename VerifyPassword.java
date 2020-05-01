import java.util.*;
public class VerifyPassword{
    public static boolean func1(String str){
        int number=0;
        int upper=0;
        int lower=0;
        int other=0;
        for(char x:str.toCharArray()){
            if(Character.isDigit(x)){
                number=1;
            }else if(Character.isLowerCase(x)){
                lower=1;
            }else if(Character.isUpperCase(x)){
                upper=1;
            }else{
                other=1;
            }
            if((number+lower+upper+other)>=3)
                return true;
        }
        return false;
    }
    public static boolean func2(String str,int len){
        for (int i=0;i<len-3;i++) {
            String s =str.substring(i, i + 3);
            String tempStr = str.substring(i + 3, len);
            if (tempStr.contains(s)) {
                return false;
            }
        }
        return true;
    }
    public static boolean func(String str,int len){
        if(str==null||str.length()<=8){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String str=sc.nextLine();
            int len=str.length();
            if(func1(str)&&func2(str,len)&&func(str,len)){
                System.out.println("OK");
            }else{
                System.out.println("NG");
            }
        }
        sc.close();
    }
}
