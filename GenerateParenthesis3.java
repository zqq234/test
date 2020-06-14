class GenerateParenthesis {
    List<String> res=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs("",0,0,n);
        return res;
    }
    public void dfs(String str,int start,int end,int len){
        if(str.length()==2*len){
            res.add(str);
            return;
        }
        if(start<len){
            dfs(str+"(",start+1,end,len);
        }
        if(end<start){
            dfs(str+")",start,end+1,len);
        }
    } 
}