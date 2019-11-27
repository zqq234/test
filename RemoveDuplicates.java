class RemoveDuplicates {
    public String removeDuplicates(String S) {
        Stack<Character> s=new Stack();
        for(char x:S.toCharArray()){
            if(s.isEmpty()||s.peek()!=x){
                s.push(x);
            }else{
                s.pop();
            }
        }
        StringBuffer sb=new StringBuffer();
        for(char x:s){
            sb.append(x);
        }
        return sb.toString();
    }
}
