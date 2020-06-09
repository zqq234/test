class EvalRPN {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack=new Stack<>();
        for(String str:tokens){
            if("+".equals(str)){
                int x=stack.pop();
                int y=stack.pop();
                stack.push(x+y);
            }else if("*".equals(str)){
                int x=stack.pop();
                int y=stack.pop();
                stack.push(y*x);
            }else if("-".equals(str)){
                int x=stack.pop();
                int y=stack.pop();
                stack.push(y-x);
            }else if("/".equals(str)){
                int x=stack.pop();
                int y=stack.pop();
                stack.push(y/x);
            }else{
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }
}