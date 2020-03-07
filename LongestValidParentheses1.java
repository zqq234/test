class LongestValidParentheses1 {
    public int longestValidParentheses(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+2;j<=s.length();j+=2){
                if(func(s.substring(i,j))){
                    max=Math.max(max,j-i);
                }
            }
        }
        return max;
    }
    public boolean func(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                s.push('(');
            }else if(!s.isEmpty()){
                s.pop();
            }else{
                return false;
            }    
        }
        return s.isEmpty();
    }

}