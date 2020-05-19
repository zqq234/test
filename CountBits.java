class CountBits {

    public int[] countBits(int num) {
        if(num==0){
            return new int[]{0};
        }else if(num==1){
            return new int[]{0,1};
        }
        int[] dp=new int[num+1];
        dp[0]=0;
        dp[1]=1;
        int i=2;
        int flag=0;
        while(i<=num){
            flag=0;
            int s=i;
            while(i<=num&&flag<s){
                dp[i++]=dp[flag++]+1;
            }
        }
        return dp;
    }
}