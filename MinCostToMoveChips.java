class MinCostToMoveChips {
    public int minCostToMoveChips(int[] chips) {
        int even=0;
        int odd=0;
        for(int x:chips){
            if(x%2==0){
                even++;
            }else{
                odd++;
            }
        }
        return Math.min(even,odd);
    }
}
