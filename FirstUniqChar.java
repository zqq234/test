class FirstUniqChar {
    public char firstUniqChar(String s) {
        HashMap<Character, Integer> dic = new HashMap<>();
        char[] sc = s.toCharArray();
        for(char c : sc) {
            if(!dic.containsKey(c)) dic.put(c, 1);
            else dic.put(c, dic.get(c) + 1);
        }
        for(char c : sc) {
            if(dic.get(c) == 1) return c;
        }
        return ' ';
    }
}