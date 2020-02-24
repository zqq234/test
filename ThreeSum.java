class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList();
        if(nums==null||nums.length<3){
            return res;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                break;
            }
            int left=i+1;
            int right=nums.length-1;
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            while(left<right){
                int sum=nums[left]+nums[i]+nums[right];
                if(sum==0){
                    res.add(Arrays.asList(nums[left],nums[i],nums[right]));
                    while(right>left&&nums[left]==nums[left+1]){
                        left++;
                    }
                    while(right>left&&nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else if (sum > 0) {
                    right--;
                }
            }
        }
        return res;
    }
}