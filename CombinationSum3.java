class CombinationSum3 { 
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        dfs(res,k,n,1,new ArrayList<>());
        return res;
    }
    public void dfs(List<List<Integer>> res,int k,int n,int start,List<Integer> tmp){
        if(tmp.size()==k){
            int sum=0;
            for(int x:tmp){
                sum+=x;
            }
            if(sum==n){
                res.add(new ArrayList<>(tmp));
            }
            return;
        }
        for(int i=start;i<10;i++){
            tmp.add(i);
            dfs(res,k,n,i+1,tmp);
            tmp.remove(tmp.size()-1);
        }
    }
}