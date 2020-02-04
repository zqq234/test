class DecompressRLElist 1{
    public int[] decompressRLElist(int[] nums) {
        int len=nums.length;
        int trueLen=0;
        for(int i=0;i<len;i+=2){
            trueLen+=nums[i];
        }
        int[] arr=new int[trueLen];
        int flag=0;
        for(int i=0;i<len;i+=2){
            int s=nums[i];
            while(s>0){
                arr[flag++]=nums[i+1];
                s--;
            }
        }
        return arr;
    }
}