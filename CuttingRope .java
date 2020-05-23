class CuttingRope {
    public int cuttingRope(int n) {
        if(n<3){
            return n-1;
        }
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=1;
        for(int i=3;i<=n;i++){
            for(int j=1;j<i;j++){
                dp[i]=Math.max(Math.max(dp[i],j*(i-j)),j*dp[i-j]);
            }
        }
        return dp[n];
    }
}

