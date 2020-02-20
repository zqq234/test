class LongestPalindrome5 {
    public String longestPalindrome(String s) {
        if(s==null||s.length()==0){
            return "";
        }
        String r=new StringBuffer(s).reverse().toString();
        int len=s.length();
        int[]arr=new int[len];
        int max=0;
        int end=0;
        for(int i=0;i<len;i++){
            for(int j=len-1;j>=0;j--){
                if(r.charAt(j)==s.charAt(i)){
                    if(i==0||j==0){
                        arr[j]=1;
                    }else{
                        arr[j]=arr[j-1]+1;
                    }
                }else{
                    arr[j]=0;
                }
                if(arr[j]>max){
                   int before=len-j-1;
                    if(before+arr[j]-1==i){
                         max=arr[j];
                        end=i;
                    }
                }
            }
        }
        return s.substring(end-max+1,end+1);
    }
}