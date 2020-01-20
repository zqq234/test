class AddBinary {
    public String addBinary(String a, String b) {
       int len1=a.length();
       int len2=b.length();
       StringBuffer sb=new StringBuffer();
       int c=0;
       for(int i=len1-1,j=len2-1;i>=0||j>=0;i--,j--){
           int num=c;
           num+=(i>=0?a.charAt(i)-'0':0);
           num+=(j>=0?b.charAt(j)-'0':0);
           sb.append(num%2);
           c=num/2;
       }
       if(c==1){
           sb.append(1);
       }
       return sb.reverse().toString();
    }
}