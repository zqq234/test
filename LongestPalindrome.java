class LongestPalindrome {
    public String longestPalindrome(String s) {
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int len1=func(s,i,i);
            int len2=func(s,i,i+1);
            int len=Math.max(len1,len2);
            if(len>end-start){
                end=i+len/2+1;
                start=i-(len-1)/2;
            }
        }
        return s.substring(start,end);
    }
    public int func(String s,int i,int j){
        while(i>=0&&j<s.length()&&s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return j-i-1;
    }
}