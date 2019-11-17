class ToLowerCase {
    public String toLowerCase(String str) {
        StringBuffer sb=new StringBuffer();
        for(char x:str.toCharArray()){
            if(x<=90&&x>=65){
                x=(char)(x+32);
            }
            sb.append(x);
        }
        return sb.toString();
    }
}