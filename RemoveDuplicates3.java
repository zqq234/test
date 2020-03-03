class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(i>0&&nums[i]==nums[i-1]){
                for(int j=i+1;j<len;j++){
                    nums[j-1]=nums[j];
                }
                len--;
                i--;
            }
        }
        return len;
    }
}