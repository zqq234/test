class CheckPossibility1 {
    public boolean checkPossibility(int[] nums) {
        int count1=0;
        int count2=0;
        int len=nums.length;
        int max=nums[0];
        int min=nums[len-1];
        for(int i=1;i<len;i++){
            if(nums[i]<max){
                count1++;
            }
            if(nums[len-i-1]>min){
                count2++;
            }
            max=max>nums[i]?max:nums[i];
            min=min<nums[len-1-i]?min:nums[len-1-i];
        }
        return count1<=1||count2<=1;
    }
}