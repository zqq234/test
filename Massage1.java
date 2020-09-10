class Massage{
    public int massage(int[] nums) {
        int len=nums.length;
        if(nums==null||len<1){
            return 0;
        }
        if(len==1){
            return nums[0];
        }else if(len==2){
            return Math.max(nums[0],nums[1]);
        }
        int[] res=new int[len];
        res[0]=nums[0];
        res[1]=nums[1];
        for(int i=2;i<len;i++){
            res[i]=Math.max(res[i-2]+nums[i],res[i-1]);
        }
        return res[len-1];
    }
}