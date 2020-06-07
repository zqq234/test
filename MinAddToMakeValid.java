class MinAddToMakeValid {
    public int minAddToMakeValid(String S) {
        Stack<Character> stack=new Stack<>();
        for(char x:S.toCharArray()){
            if(x=='('){
                stack.push(x);
            }else if(stack.isEmpty()){
                stack.push(x);
            }else if(x==')'&&stack.peek()=='('){
                stack.pop();
            }else{
                stack.push(x);
            }
        }
        return stack.size();
    }
}