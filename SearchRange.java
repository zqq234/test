class SearchRange { 
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        res[0]=first(nums,target);
        res[1]=last(nums,target);
        return res;
    }
    public int first(int[] nums,int target){
        int left=0;
        int right=nums.length-1;      
        while(left<=right){
            int mid=(right+left)>>1;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                if(mid==0||nums[mid-1]!=target){
                    return mid;
                }else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
    public int last(int[] nums,int target){
        int left=0;
        int right=nums.length-1;  
        while(left<=right){
            int mid=(right+left)>>1;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                if(mid==nums.length-1||nums[mid+1]!=target){
                    return mid;
                }else{
                    left=mid+1;
                }
            }
        }
        return -1;
    }
}