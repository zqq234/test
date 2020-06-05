public class CompleteBackpack {
	private static final int N = 3;
	private static final int V = 5;
	private int weight[] = {0,3,2,2};
	private int Value[] = {0,5,10,20};	 
	private int dp[][]=new int[N+1][V+1];
	
	public int Completeknapsack(){
	       for(int i=1;i<=N;i++){
		for(int j=1;j<=V;j++){
		         int count=j/weight[i];
		         for(int z=0;z<=count;z++){
			dp[i][j]=Math.max(dp[i][j],dp[i-1][j-z*weight[i]]*z*Value[i]);
		         }
		}
	        }
	        return dp[N][V];
	}

	public static void main(String[] args) {
		System.out.println(new CompleteBackpack().Completeknapsack());
 
	}
 
}
	
	
