class MaxArea1 {
    public int maxArea(int[] height) {
        int sum=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            sum=Math.max(sum,Math.min(height[l],height[r])*(r-l));
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return sum;
    }
}