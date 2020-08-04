public class LeftRotateString {
    public String LeftRotateString(String str,int n) {
        int len=str.length();
        if(len==0)
            return str;
        n%=len;
        String res=str.substring(n,len)+str.substring(0,n);
        return res;
    }
}