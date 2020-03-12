class GcdOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        return str1.substring(0,func(str1.length(),str2.length()));
    }
    private int func(int a,int b){
        return b==0?a:func(b,a%b);
    }
}

