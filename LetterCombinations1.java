class LetterCombinations1 {
    public List<String> letterCombinations(String digits) {
        if(digits==null){
            return new LinkedList<>();
        }
        String[] phone={"","","abc","def","ghi","jkl","mno","pqrs", "tuv", "wxyz"};
        List<String> res=new LinkedList<>();
        res.add("");
        for(int i=0;i<digits.length();i++){
            String str=phone[digits.charAt(i)-'0'];
            for(int j=0;j<res.size();j++){
                String x=res.remove(0);
                for(int k=0;k<str.length();k++){
                    res.add(x+str.charAt(k));
                }
            }
        }
        return res;
    }
}