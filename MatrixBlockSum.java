class MatrixBlockSum {
    public int[][] matrixBlockSum(int[][] mat, int K) {
        int rlen=mat.length;
        int clen=mat[0].length;
        int[][]dp=new int[rlen+1][clen+1];
        int[][]res=new int[rlen][clen];
        for(int i=1;i<=rlen;i++){
            for(int j=1;j<=clen;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1]+mat[i-1][j-1];
            }
        }
        for(int i=1;i<=rlen;i++){
            for(int j=1;j<=clen;j++){
                int x0=Math.max(0,i-K-1);
                int y0=Math.max(0,j-K-1);
                int x1=Math.min(rlen,i+K);
                int y1=Math.min(clen,j+K);
                res[i-1][j-1]=dp[x0][y0]+dp[x1][y1]-dp[x0][y1]-dp[x1][y0];
            }
        }
        return res;
    }
}