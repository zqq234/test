class defangIPaddr1 {
    public String defangIPaddr(String address) {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<address.length();i++){
            char x=address.charAt(i);
            if(x=='.'){
                sb.append('[');
                sb.append('.');
                sb.append(']');
            }else{
                sb.append(x);
            }
        }
        return sb.toString();
    }
}