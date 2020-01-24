class FindUnsortedSubarray3 {
    public int findUnsortedSubarray(int[] nums) {
        Stack<Integer> s=new Stack<>();
        int len=nums.length;
        int l=len-1;
        int r=0;
        for(int i=0;i<len;i++){
            while(!s.isEmpty()&&nums[s.peek()]>nums[i]){
                l=Math.min(l,s.pop());
            }
            s.push(i);
        }
        s.clear();
        for(int i=len-1;i>=0;i--){
            while(!s.isEmpty()&&nums[s.peek()]<nums[i]){
                r=Math.max(r,s.pop());
            }
            s.push(i);
        }
        return r-l>0?r-l+1:0;
    }
}