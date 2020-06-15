class Permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> tmp=new ArrayList<>();
        for(int x:nums){
            tmp.add(x);
        }
        dfs(tmp,res,0,nums.length);
        return res;
    }
    public void dfs(List<Integer> tmp,List<List<Integer>> res,int start,int len){
        if(start==len){
            res.add(new ArrayList(tmp));
            return;
        }
        for(int i=start;i<len;i++){
            Collections.swap(tmp,i,start);
            dfs(tmp,res,start+1,len);
            Collections.swap(tmp,i,start);
        }
    }
}