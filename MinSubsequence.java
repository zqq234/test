class MinSubsequence {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        List<Integer> res=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            res.add(nums[i]);
            sum+=nums[i];
            int tmp=0;
            for(int j=i-1;j>=0;j--){
                tmp+=nums[j];
            }
            if(sum>tmp){
                break;
            }
        }
        return res;
    }
}