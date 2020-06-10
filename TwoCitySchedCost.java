class TwoCitySchedCost {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(int[] x1,int[]x2)->(x1[0]-x1[1])-(x2[0]-x2[1]));
        int len=costs.length/2;
        int total=0;
        for(int i=0;i<len;i++){
            total+=costs[i][0]+costs[i+len][1];
        }
        return total;
    }
}