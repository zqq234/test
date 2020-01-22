class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int len=nums.length;
        int i=0;
        for(;i<len;i++){
            if(nums[i]==target){
                return i;
            }else if(nums[i]>target){
                return i;
            }
        }
        return i;
    }
}