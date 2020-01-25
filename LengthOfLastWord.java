class LengthOfLastWord{
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int location=s.lastIndexOf(" ")+1;
        return s.substring(location).length();
    }
}
