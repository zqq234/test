class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int len=nums.length;
        double n=Math.pow(2,len);
        for(int i=0;i<n;i++){
            List<Integer> tmp=new ArrayList();
            for(int j=0;j<len;j++){
                if((i>>j&1)==1){
                    tmp.add(nums[j]);
                }
            }
            res.add(tmp);
        }
        return res;
    }
}