class MaxProfit1 {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }else if((prices[i]-minPrice)>profit){
                profit=prices[i]-minPrice;
            }
        }
        return profit;
    }
}