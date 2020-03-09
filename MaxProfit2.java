class MaxProfit2 {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        if(len==0){
            return 0;
        }
        int[][] dp=new int[len][2];
        for(int i=0;i<len;i++){
            if(i==0){
                dp[i][0]=0;
                dp[i][1]=-prices[i];
                continue;
            }
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(-prices[i],dp[i-1][1]);
        }
        return dp[len-1][0];
    }
}