class Rob {
    public int rob(int[] nums) {
        int a=0;
        int b=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            int d=Math.max(a+nums[i],b+nums[i]);
            a=b;
            b=c;
            c=d;
        }
        return Math.max(b,c);
    }
}