class MinPathSum {
    public int minPathSum(int[][] grid) {
        int rlen=grid.length;
        int clen=grid[0].length;
        int[][] dp=new int[rlen+1][clen+1];
        for(int i=0;i<=rlen;i++){
            dp[i][0]=Integer.MAX_VALUE;
        }
        for(int j=0;j<=clen;j++){
            dp[0][j]=Integer.MAX_VALUE;
        }
        dp[1][1]=grid[0][0];
        for(int i=1;i<=rlen;i++){
            for(int j=1;j<=clen;j++){
                int flag=Math.min(dp[i-1][j],dp[i][j-1]);
                if(flag==Integer.MAX_VALUE){
                    dp[i][j]=grid[i-1][j-1];
                }else{
                   dp[i][j]=flag+grid[i-1][j-1]; 
                } 
            }
        }
        return dp[rlen][clen];
    }
}