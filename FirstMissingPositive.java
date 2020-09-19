class FirstMissingPositive{
    public int firstMissingPositive(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len;i++){
            while(nums[i]>0&&nums[i]<=len&&nums[nums[i]-1]!=nums[i]){
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }
        for(int i=0;i<len;i++){
            if((i+1)!=nums[i]){
                return i+1;
            }
        }
        return len+1;
    }
}