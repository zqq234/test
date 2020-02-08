class FreqAlphabets {
    public String freqAlphabets(String s) {
        StringBuffer sb=new StringBuffer();
        int len=s.length();
        for(int i=0;i<len;i++){
            if((i+2)<len&&s.charAt(i+2)=='#'){
                sb.append((char)((s.charAt(i) - '0') * 10 + (s.charAt(i+1) - '1') + 'a'));
                i+=2;
            }else{
                sb.append((char)((s.charAt(i)-'1')+'a'));
            }
        }
        return sb.toString();
    }
}
