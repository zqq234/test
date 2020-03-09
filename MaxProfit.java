class MaxProfit {
    public int maxProfit(int[] prices) {
        int max=0;
        int len=prices.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int flag=prices[j]-prices[i];
                if(flag>max)
                max=flag;
            }
        }
        return max;
    }
}