class RemoveOuterParentheses {
    public String removeOuterParentheses(String S) {
        int pl=0;
        int ps=0;
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='('){
                pl++;
            }else{
                ps++;
            }
            if(pl==ps){
                sb.append(S.substring(i-pl*2+2,i));
                pl=0;
                ps=0;
            }
        }
        return sb.toString();
    }
}