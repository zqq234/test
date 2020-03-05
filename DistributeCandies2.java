class DistributeCandies2 {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans=new int[num_people];
        int i=0;
        while(candies!=0){
            ans[i%num_people]+=Math.min(candies,i+1);
            candies-=Math.min(candies,i+1);
            i++;
        }
        return ans;
    }
}