class FindUnsortedSubarray1 {
    public int findUnsortedSubarray(int[] nums) {
        int len=nums.length;
        int l=len-1;
        int r=0; 
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(nums[i]>nums[j]){
                    l=Math.min(l,i);
                    r=Math.max(r,j);
                }
            }
        }
        return (r-l<=0?0:r-l+1);
    }
}