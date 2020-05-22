class NthPersonGetsNthSeat {
    public double nthPersonGetsNthSeat(int n) {
        if(n==1)
            return 1;
        double[] dp=new double[n+1];
        dp[1]=1;
        dp[2]=0.5;
        for(int i=3;i<=n;i++){
            dp[i]=1.0/i+(i-2)*(1.0/i)*dp[i-1];
        }
        return dp[n];
    }
}

