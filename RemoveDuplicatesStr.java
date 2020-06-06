class RemoveDuplicates {
    public String removeDuplicates(String S) {
        Stack<Character> st=new Stack<>();
        for(char x:S.toCharArray()){
            if(!st.isEmpty()&&x==st.peek()){
                st.pop();
            }else{
                st.push(x);
            }
        }
        StringBuilder str = new StringBuilder();
        for (Character c : st) {
            str.append(c);
        }
        return str.toString();
    }
}