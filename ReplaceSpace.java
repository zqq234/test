class ReplaceSpace {
    public String replaceSpace(String s) {
        int len=s.length();
        StringBuffer sb=new StringBuffer();
        for(char x:s.toCharArray()){
            if(x==' '){
                sb.append("%20");
            }else{
                sb.append(x);
            }
        }
        return sb.toString();
    }
}