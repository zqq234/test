public class StrToInt {
    public int StrToInt(String str) {
        int flag=1;
        long res=0;
        int len=str.length();
        for(int i=0;i<len;i++){
            if(str.charAt(i)=='-'){
                flag=-1;
                continue;
            }else if(str.charAt(i)=='+'){
                continue;
            }
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                res=res*10+(str.charAt(i)-'0');
            }else{
                return 0;
            }
        }
        if(res>Integer.MAX_VALUE||res<Integer.MIN_VALUE){
            return 0;
        }else{
            if(flag==-1){
                return -1*(int)res;
            }
            return (int)res;
        }
    }
}