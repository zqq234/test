class FourSum1 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new LinkedList();
        int len=nums.length;
        if(len<4){
            return res;
        }
        Arrays.sort(nums);
        for(int i=0;i<len-3;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int min=nums[i]+nums[i+1]+nums[i+2]+nums[i+3];
            if(target<min){
                break;
            }
            int max=nums[i]+nums[len-3]+nums[len-2]+nums[len-1];
            if(max<target){
                continue;
            }
            for(int j=i+1;j<len-2;j++){
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                int left=j+1;
                int right=len-1;
                int max1=nums[i]+nums[j]+nums[right]+nums[right-1];
                while(left<right){
                    int result=nums[i]+nums[j]+nums[left]+nums[right];
                    if(target==result){
                        res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                        while(left<right&&nums[left]==nums[left-1]){
                            left++;
                        }
                        while(left<right&&nums[right]==nums[right+1]){
                            right--;
                        }
                    }else if(target>result){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return res;
    }
}