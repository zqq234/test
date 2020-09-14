class NthUglyNumber{
    public int nthUglyNumber(int n) {
        int[]dp=new int[n+1];
        int d2=1;
        int d3=1;
        int d5=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            int x=Math.min(2*dp[d2],Math.min(3*dp[d3],5*dp[d5]));
            dp[i]=x;
            if(x==2*dp[d2])
                d2++;
            if(x==3*dp[d3])
                d3++;
            if(x==5*dp[d5])
                d5++;
        }
        return dp[n];
    }
}