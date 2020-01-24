class FindUnsortedSubarray2 {
    public int findUnsortedSubarray(int[] nums) {
        int[] a=nums.clone();
        int len=nums.length;
        int l=len-1;
        int r=0;
        Arrays.sort(a);
        for(int i=0;i<len;i++){
            if(nums[i]!=a[i]){
                l=Math.min(l,i);
                r=Math.max(r,i);
            }
        }
        return r-l>0?r-l+1:0;
    }
}