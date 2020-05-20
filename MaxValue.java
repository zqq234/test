class MaxValue {
    public int maxValue(int[][] grid) {
        int rlen=grid.length;
        int clen=grid[0].length;
        int[][] dp=new int[rlen+1][clen+1];
        for(int i=1;i<=rlen;i++){
            for(int j=1;j<=clen;j++){
                dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j])+grid[i-1][j-1];
            }
        }
        return dp[rlen][clen];
    }
}