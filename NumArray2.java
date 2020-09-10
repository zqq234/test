class NumArray {
    int[] res;

    public NumArray(int[] nums) {
        int len=nums.length;
        if(len!=0){
            res=new int[len];
            res[0]=nums[0];
            for(int i=1;i<len;i++){
                res[i]=res[i-1]+nums[i];
            }
        }
        
    }
    
    public int sumRange(int i, int j) {
        if(i>0)
            return res[j]-res[i-1];
        else
            return res[j];
    }
}