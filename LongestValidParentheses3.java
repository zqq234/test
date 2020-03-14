class LongestValidParentheses3 {
    public int longestValidParentheses(String s) {
        int len=s.length();
        int left=0;
        int right=0;
        int max=0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='('){
                left++;
            }else{
                right++;
            }
            if(left==right){
                max=Math.max(max,2*left);
            }else if(right>left){
                left=0;
                right=0;
            }
        }
        left=0;
        right=0;
        for(int i=len-1;i>=0;i--){
            if(s.charAt(i)=='('){
                left++;
            }else{
                right++;
            }
            if(left==right){
                max=Math.max(max,2*left);
            }else if(right<left){
                left=0;
                right=0;
            }
        }
        return max;
    }
}