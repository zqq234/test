public static int ZeroOnePack(int V,int N,int[] weight,int[] value){
      int[][]dp=new int[V+1][N+1];
      for(int i=1;i<V+1;i++){
           for(int j=1;j<N+1;j++){
 	if(i<weight[j-1]){
	      dp[i][j]=dp[i][j-1];
	}else{
	      dp[i][j]=Math.max(dp[i][j-1],dp[i-weight[i-1]][j-1]+value[j-1]);
	}
          }
     }
     return dp[V][N];
}