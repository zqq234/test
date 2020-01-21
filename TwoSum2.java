class TwoSum2 {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> h=new HashMap<>();
       int len=nums.length;
       for(int i=0;i<len;i++){
           int res=target-nums[i];
           if(h.containsKey(res)){
               return new int[]{i,h.get(res)};
           }
           h.put(nums[i],i);
       }
       return null;
    }
}