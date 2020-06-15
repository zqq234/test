class Combine {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        dfs(res,n,k,1,new ArrayList<>());
        return res;
    }
    public void dfs(List<List<Integer>> res,int n,int k,int start,List<Integer> tmp){
        if(tmp.size()==k){
            res.add(new ArrayList(tmp));
            return;
        }
        for(int i=start;i<=n;i++){
            tmp.add(i);
            dfs(res,n,k,i+1,tmp);
            tmp.remove(tmp.size()-1);
        }
    }
}