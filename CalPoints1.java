class CalPoints1 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack();
        int num=0;
        for(String s : ops) {
            if (s.equals("+")) {
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
                num+=newtop;
            } else if (s.equals("C")) {
                num-=stack.pop();
            } else if (s.equals("D")) {
                stack.push(2 * stack.peek());
                num+= 2*stack.peek();
            } else {
                stack.push(Integer.valueOf(s));
                num+=Integer.valueOf(s);
            }
        
        }
        return num;
    }
}