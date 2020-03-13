class MajorityElement2 {
    public int majorityElement(int[] nums) {
        int len=nums.length;
        Random r=new Random();
        while(true){
            int count=0;
            int num=r.nextInt(len);
            for(int x:nums){
                if(x==nums[num]){
                    count++;
                }
                if(count>len/2){
                    return x;
                }
            }
        }
    }
}