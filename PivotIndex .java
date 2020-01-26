class PivotIndex {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int len=nums.length;
        for(int x:nums){
            sum+=x;
        }
        int lsum=0;
        for(int i=0;i<len;i++){
            
            if(lsum==sum-nums[i]-lsum){
                return i;
            }
            lsum+=nums[i];
        }
        return -1;
    }
}