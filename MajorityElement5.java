class MajorityElement {
    public int majorityElement(int[] nums) {
        int x=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=x){
                count--;
                if(count==0){
                    x=nums[i];
                    count=1;
                }
            }else{
                count++;
            }
        }
        return x;
    }
}