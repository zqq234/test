class ReverseString {
    public void reverseString(char[] s) {
        int left=-1;
        int right=s.length;
        while(++left<--right){
            char x=s[left];
            s[left]=s[right];
            s[right]=x;
        }
    }
}