class EvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack();
        for(String str:tokens){
            if(str.equals("+")){
                int a=s.pop();
                int b=s.pop();
                s.push(a+b);
            }else if(str.equals("-")){
                int a=s.pop();
                int b=s.pop();
                s.push(b-a);
            }else if(str.equals("*")){
                int a=s.pop();
                int b=s.pop();
                s.push(b*a);
            }else if(str.equals("/")){
                int a=s.pop();
                int b=s.pop();
                s.push(b/a);
            }else{
                s.push(Integer.parseInt(str));
            }
        }
        return s.pop();
    }
}