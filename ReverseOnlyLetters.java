class ReverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        char[] a=S.toCharArray();
        int left=0;
        int right=a.length-1;
        while(left<=right){
            if(!Character.isLetter(a[left])){
                left++;
            }else if(!Character.isLetter(a[right])){
                right--;
            }else{
                char x=a[left];
                a[left++]=a[right];
                a[right--]=x;
            }
        }
        return new String(a);
    }
}