public class VerifyPassWord {
    public static void func(String str){
        int len=str.length();
        if(len<8){
            System.out.println("Irregular password");
            return;
        }
        boolean hasNumber=false;
        boolean hasUpper=false;
        boolean hasLowwer=false;
        boolean hasOther=false;
        for(int i=0;i<len;i++){
            char x=str.charAt(i);
            if(x>='a'&&x<='z'){
                hasLowwer=true;
            }else if(x>='A'&&x<='Z'){
                hasUpper=true;
            }else if(x>='0'&&x<='9'){
                hasNumber=true;
            }else{
                hasOther=true;
            }
        }
        if(hasLowwer&&hasNumber&&hasOther&&hasUpper){
            System.out.println("Ok");
        }else{
            System.out.println("Irregular password");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.next();
            func(str);
        }
    }
}