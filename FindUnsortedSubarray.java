class FindUnsortedSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int len=nums.length;
        int min=nums[len-1];
        int max=nums[0];
        int l=0;
        int r=-1;
        for(int i=0;i<len;i++){
            if(nums[i]<max){
                r=i;
            }else{
                max=nums[i];
            }
            if(nums[len-i-1]>min){
                l=len-i-1;
            }else{
                min=nums[len-1-i];
            }
        }
        return r-l+1;
    }
}