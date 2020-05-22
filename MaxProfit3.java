class MaxProfit {
    public int maxProfit(int[] prices, int fee) {
        int a=0;
        int b=-prices[0];
        for(int i=1;i<prices.length;i++){
            a=Math.max(a,b+prices[i]-fee);
            b=Math.max(b,a-prices[i]);
        }
        return a;
    }
}