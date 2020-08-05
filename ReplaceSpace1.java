public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
    	StringBuffer sb=new StringBuffer();
        for(int i=0;i<str.length();i++){
            char x=str.charAt(i);
            if(x==' '){
                sb.append("%20");
            }else{
                sb.append(x);
            }
        }
        return sb.toString();
    }
}