class IsPalindrome4{ 
    public boolean isPalindrome(String s) {
        int len=s.length();
        char[] a=s.toCharArray();
        int left=0;
        int right=len-1;
        while(left<right){
            if(!judge(a[left])){
                left++;
                continue;
            }
            if(!judge(a[right])){
                right--;
                continue;
            }
            if(Character.toUpperCase(a[left])!=Character.toUpperCase(a[right])){
                return false;
            }
                left++;
                right--;
            
        }
        return true;
    }
    public boolean judge(char x){
        if(x<='9'&&x>='0'||x>='a'&&x<='z'||x>='A'&&x<='Z'){
            return true;
        }
        return false;
    }
}