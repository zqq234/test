class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int c=0;
        for(char x:s.toCharArray()){
            c^=x;
        }
        for(char x:t.toCharArray()){
            c^=x;
        }
        return (char)c;
    }
}
