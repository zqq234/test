class ThirdMax1 {
    public int thirdMax(int[] nums) {
        long Min=Long.MIN_VALUE;
        int first=nums[0];
        long second=Min;
        long third=Min;
        for(int x:nums){
            if(x==first||x==second||x==third){
                continue;
            }
            if(x>first){
                third=second;
                second=first;
                first=x;
            }else if(x>second){
                third=second;
                second=x;
            }else if(x>third){
                third=x;
            }
        }
        if(third!=Min){
            return (int)third;
        }
        return first;
    }
}