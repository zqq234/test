class MajorityElement4 {
    public int majorityElement(int[] nums) {
        int count=0;
        int cadidate=0;
        for(int num:nums){
            if(count==0){
                cadidate=num;
            }
            count+=(num==cadidate)?1:-1;
        }
        return cadidate;
    }
}