class FindNumbers1 {
    public int findNumbers(int[] nums) {
        int len=nums.length;
        int count=0;
        for(int i=0;i<len;i++){
            String s=nums[i]+"";
            if(s.length()%2==0){
                count++;
            }
        }
        return count;
    }
}