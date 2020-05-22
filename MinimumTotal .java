class MinimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        int min=Integer.MAX_VALUE;
        int row=triangle.size();
        if(row==0){
            return 0;
        }
        int col=triangle.get(row-1).size();
        int dp[][] =new int[row][col];
        dp[0][0]=triangle.get(0).get(0);
        for(int i=1;i<row;i++){
            for(int j=0;j<=i;j++){
                if(j==0){
                    dp[i][j]=dp[i-1][j]+triangle.get(i).get(j);
                }else if(i==j){
                    dp[i][j]=dp[i-1][j-1]+triangle.get(i).get(j);
                }else{
                    dp[i][j]=Math.min(dp[i-1][j],dp[i-1][j-1])+triangle.get(i).get(j);
                }
            }
        }
        for(int i=0;i<col;i++){
            min=Math.min(min,dp[row-1][i]);
        }
        
        return min;
    }
}

