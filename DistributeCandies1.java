class DistributeCandies {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr=new int[num_people];
        int flag=0;
        int num=1;
        while(candies>0){
            if(candies-num>=0){
                arr[flag++]+=num;
            }else{
                arr[flag++]+=candies;
            }
            candies-=num++;
            if(flag==num_people){
                flag=0;
            }
        }
        return arr;
    }
}
