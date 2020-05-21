class CountSquares {
    public int countSquares(int[][] matrix) {
        int rlen=matrix.length;
        int clen=matrix[0].length;
        int[][]dp=new int[rlen][clen];
        int res=0;
        for(int i=0;i<rlen;i++){
            if(matrix[i][0]==1){
                dp[i][0]=1;
                res++;
            } 
        }
        for(int i=0;i<clen;i++){
            if(matrix[0][i]==1&&dp[0][i]==0){
                dp[0][i]=1;
                res++;
            }
        }
        for(int i=1;i<rlen;i++){
            for(int j=1;j<clen;j++){
                if(matrix[i][j]==0){
                    continue;
                }else{
                    dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
                    res+=dp[i][j];
                }
            }
        }
        return res;
    }
}