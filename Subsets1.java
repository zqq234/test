class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        dfs(nums,0,res,new ArrayList<>());
        return res;
    }
    public void dfs(int[] nums,int start,List<List<Integer>> res,List<Integer> tmp){
        res.add(new ArrayList<>(tmp));
        for(int i=start;i<nums.length;i++){
            tmp.add(nums[i]);
            dfs(nums,i+1,res,tmp);
            tmp.remove(tmp.size()-1);
        }
    }
}