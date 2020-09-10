class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int len=nums.length;
        int[]res=new int[len];
        res[0]=nums[0];
        for(int i=1;i<len;i++){
            res[i]=Math.max(nums[i],res[i-1]+nums[i]);
            max=Math.max(max,res[i]);
        }
        return max;
    }
}