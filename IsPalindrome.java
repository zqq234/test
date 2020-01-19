class IsPalindrome {
    public boolean isPalindrome(int x) {
        int reverse=0;
        int num=x;
        if(num<0){
            return false;
        }
        while(num!=0){
            reverse=reverse*10+num%10;
            num/=10;
        }
        return x==reverse;
    }
}
