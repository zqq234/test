class LengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        int len=nums.length;
        if(len==0){
            return 0;
        }
        int[] dp=new int[len];
        dp[0]=1;
        int max=1;
        for(int i=1;i<len;i++){
            int maxval=0;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    maxval=Math.max(maxval,dp[j]);
                }
            }
            dp[i]=maxval+1;
            max=Math.max(dp[i],max);
        }
        return max;
    }
}