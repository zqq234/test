class IsPalindrome1 {
   public boolean isPalindrome(int x) {
        String str=new StringBuffer(x+" ").reverse().toString();
        return (" "+x).equals(str);
    }
}
