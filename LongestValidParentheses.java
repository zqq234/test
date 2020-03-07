class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int len=s.length();
        int l=0;
        for(int i=0;i<len;i++){   
            int ll=0;
            int flag=0; 
            for(int j=i;j<len;j++){
                if(s.charAt(j)=='('){
                    flag++;
                }else{
                    flag--;
                }
                if(flag<0){
                    break;
                }else if(flag==0){
                    ll=j-i+1;
                }
            }
            l=Math.max(l,ll);
        }
        return l;
    }
}
