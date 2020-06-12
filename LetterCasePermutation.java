class LetterCasePermutation {
    public List<String> letterCasePermutation(String S) {
        List<StringBuffer> res=new ArrayList<>();
        res.add(new StringBuffer());
        for(char x:S.toCharArray()){
            int n=res.size();
            if(Character.isLetter(x)){
                for(int i=0;i<n;i++){
                    res.add(new StringBuffer(res.get(i)));
                    res.get(i).append(Character.toLowerCase(x));
                    res.get(i+n).append(Character.toUpperCase(x));
                }
            }else{
                for(int i=0;i<n;i++){
                    res.get(i).append(x);
                }
            }
        }
        List<String> r=new ArrayList<>();
        for(StringBuffer x:res){
            r.add(x.toString());
        }
        return r;
    }
}