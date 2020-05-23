class LengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        int len=nums.length;
        if(len<2){
            return len;
        }
        int[] dp=new int[len+1];
        dp[1]=1;
        int max=1;
        for(int i=2;i<=len;i++){
            for(int j=i-1;j>=1;j--){
                if(nums[j-1]<nums[i-1]){
                    dp[i]=Math.max(dp[i],dp[j]+1); 
                }
            }
            if(dp[i]==0){
                dp[i]=1;
            }
            if(dp[i]>max){
                max=dp[i];
            }
        }
        return max;
    }
}

