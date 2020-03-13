class MajorityElement3 {
    public int majorityElement(int[] nums) {
        return majority(nums,0,nums.length-1);
    }
    private int majority(int[] nums,int left,int right){
        if(left==right){
            return nums[left];
        }
        int mid=(right-left)/2+left;
        int l=majority(nums,left,mid);
        int r=majority(nums,mid+1,right);
        if(l==r){
            return l;
        }
        int countl=CountNum(nums,l,left,mid);
        int countr=CountNum(nums,r,mid+1,right);
        return countl>countr?l:r;
    }
    private int CountNum(int[] nums,int num,int left,int right){
        int count=0;
        for(int i=left;i<=right;i++){
            if(nums[i]==num){
                count++;
            }
        }
        return count;
    }
}