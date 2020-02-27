class LetterCombinations {
    private String[] phone={"","","abc","def","ghi","jkl","mno","pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> res=new LinkedList<>();
        if(!"".equals(digits)){
            func(0,new StringBuffer(),digits,res);
        }
        return res;
    }
    public void func(int i,StringBuffer sb,String digits,List<String> res){
        if(sb.length()==digits.length()){
            res.add(sb.toString());
            return;
        }
        char x=digits.charAt(i);
        String str=phone[x-'0'];
        for(int j=0;j<str.length();j++){
            sb.append(str.charAt(j));
            func(i+1,sb,digits,res);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}