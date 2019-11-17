class UniqueMorse {
    public int uniqueMorseRepresentations(String[] words) {
      String[] str = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                         "....","..",".---","-.-",".-..","--","-.",
                         "---",".--.","--.-",".-.","...","-","..-",
                         "...-",".--","-..-","-.--","--.."};
        Set<String> set=new HashSet();
        for(String s:words){
            StringBuffer sb=new StringBuffer();
            for(char x:s.toCharArray()){
                sb.append(str[x-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}