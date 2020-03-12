class GcdOfStrings1 {
    public String gcdOfStrings(String str1, String str2) {
        boolean flag=(str1.length()>str2.length())?func(str1,str2):func(str2,str1);
        if(!flag){
            return "";
        }
        return str1.substring(0,gcd(str1.length(),str2.length()));
    }
    private int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    private boolean func(String str1,String str2){
        int len=str2.length();
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i%len)){
                return false;
            }
        }
        return true;
    }
}