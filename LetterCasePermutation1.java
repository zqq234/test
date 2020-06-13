class LetterCasePermutation {
    List<String> res=new ArrayList<>();
    public List<String> letterCasePermutation(String S) {
        dfs(S.toCharArray(),0,S.length());
        return res;
    }
    public void dfs(char[] s,int index,int len){
        if(index==len){
            res.add(new String(s));
            return;
        }
        dfs(s,index+1,len);
        if(s[index]>='A'){
            s[index]=s[index]<'a'?(char)(s[index]+32):(char)(s[index]-32);
            dfs(s,index+1,len);
        }
    }
}