class BackspaceCompare {
    public boolean backspaceCompare(String S, String T) {
        Stack st1=new Stack();
        Stack st2=new Stack();
        for(char x:S.toCharArray()){
            if(x!='#'){
                st1.push(x);
            }else{
                if(!st1.empty()){
                    st1.pop();
                }
            }
        }
        for(char x:T.toCharArray()){
            if(x!='#'){
                st2.push(x);
            }else{
                if(!st2.empty()){
                    st2.pop();
                }
            }
        }
       String str1=String.valueOf(st1);
       String str2=String.valueOf(st2);
       if(str1.equals(str2)){
           return true;
       }else{
           return false;
       }
    }
}
