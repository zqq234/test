class DecompressRLElist {
    public int[] decompressRLElist(int[] nums) {
        int len=nums.length;
        int[] arr=new int[5000];
        int flag=0;
        for(int i=0;i<len;i+=2){
            int s=nums[i];
            while(s>0){
                arr[flag++]=nums[i+1];
                s--;
            }
        }
        return Arrays.copyOf(arr,flag);
    }
}