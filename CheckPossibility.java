class CheckPossibility {
    public boolean checkPossibility(int[] nums) {
        int len=nums.length;
        if(len<3){
            return true;
        }
        int count=0;
        for(int i=0;i<len-1;i++){
            if(nums[i+1]<nums[i]){
                count++;
                if(count>1){
                    return false;
                }
                if(i>0&&nums[i-1]>nums[i+1]){
                    nums[i+1]=nums[i];
                }
            }
        }
        return true;
    }
}