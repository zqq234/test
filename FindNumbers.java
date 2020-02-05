class FindNumbers {
    public int findNumbers(int[] nums) {
        int len=nums.length;
        int count=0;
        for(int i=0;i<len;i++){
            int s=0;
            while(nums[i]>0){
                nums[i]/=10;
                s++;
            }
            if(s%2==0){
                count++;
            }
        }
        return count;
    }
}