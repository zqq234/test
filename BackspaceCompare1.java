class BackspaceCompare1 {
    public boolean backspaceCompare(String S, String T) {
        int len1=S.length()-1;
        int len2=T.length()-1;
        int i=0;
        int j=0;
        while(len1>=0||len2>=0){
            while(len1>=0){
                if(S.charAt(len1)=='#'){
                    i++;
                    len1--;
                }else if(i>0){
                    i--;
                    len1--;
                }else{
                    break;
                }
            }
            while(len2>=0){
                if(T.charAt(len2)=='#'){
                    j++;
                    len2--;
                }else if(j>0){
                    j--;
                    len2--;
                }else{
                    break;
                }
            }
            if(len1>=0&&len2>=0&&S.charAt(len1)!=T.charAt(len2)){
                return false;
            }
            if((len1>=0)!=(len2>=0)){
                return false;
            }
            len1--;
            len2--;
        }
        return true;    
    }
}