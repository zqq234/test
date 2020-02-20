class LongestPalindrome4 {
    public String longestPalindrome(String s) {
        if(s==null||s.length()==0){
            return "";
        }
        String r=new StringBuffer(s).reverse().toString();
        int len=s.length();
        int[][]arr=new int[len][len];
        int max=0;
        int end=0;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(r.charAt(j)==s.charAt(i)){
                    if(i==0||j==0){
                        arr[i][j]=1;
                    }else{
                        arr[i][j]=arr[i-1][j-1]+1;
                    }
                }
                if(arr[i][j]>max){
                   int before=len-j-1;
                    if(before+arr[i][j]-1==i){
                         max=arr[i][j];
                        end=i;
                    }
                }
            }
        }
        return s.substring(end-max+1,end+1);
    }
}