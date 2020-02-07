class Maximum69Number {
    public int maximum69Number (int num) {
       String str=num+"";
       int i=0;
       int len=str.length();
       for(;i<len;i++){
           if(str.charAt(i)=='6'){
               break;
           }
       } 
       if(i==len){
           return num;
       }
       return num+3*(int)Math.pow(10,(len-i-1));
    }
}