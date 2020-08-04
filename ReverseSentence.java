public class ReverseSentence {
    public String ReverseSentence(String str) {
        String[] s=str.split(" ");
        int len=s.length;
        for(int i=0;i<len/2;i++){
            String temp=s[i];
            s[i]=s[len-i-1];
            s[len-i-1]=temp;
        }
        if(len>0){
            String res=s[0];
            for(int i=1;i<len;i++){
                res+=" "+s[i];
            }
            return res;
        }else{
            return str;
        }
        
    }
}