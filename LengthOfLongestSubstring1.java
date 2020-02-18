public class LengthOfLongestSubstring1 {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int max=0;
        int len=s.length();
        Set<Character> set=new HashSet<>();
        while(i<len&&j<len){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                max=Math.max(max,j-i);
            }else{
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
}