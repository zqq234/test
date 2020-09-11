class MinCost{
    public int minCostClimbingStairs(int[] cost) {
        int a=0;
        int b=0;
        for(int i=0;i<cost.length;i++){
            int c=Math.min(cost[i]+a,cost[i]+b);
            a=b;
            b=c;
        }
        return Math.min(a,b);
    }
}