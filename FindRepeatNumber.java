class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        int len=nums.length;
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[nums[i]]++;
            if(arr[nums[i]]>1){
                return nums[i];
            }
        }
        return 0;
    }
}