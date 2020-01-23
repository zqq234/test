class ReverseOnlyLetters1 {
    public String reverseOnlyLetters(String S) {
        Stack<Character> s=new Stack<>();
        for(char x:S.toCharArray()){
            if(Character.isLetter(x)){
                s.push(x);
            }
        }
        StringBuffer sb=new StringBuffer();
        for(char x:S.toCharArray()){
            if(Character.isLetter(x)){
                sb.append(s.pop());
            }else{
                sb.append(x);
            }
        }
        return sb.toString();
    }
}