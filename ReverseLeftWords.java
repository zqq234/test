class ReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        StringBuffer sb=new StringBuffer();
        sb.append(s.substring(n,s.length()));
        sb.append(s.substring(0,n));
        return sb.toString();
    }
}