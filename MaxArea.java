class MaxArea {
    public int maxArea(int[] height) {
        int len=height.length;
        int sum=0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int flag=(j-i)*Math.min(height[i],height[j]);
                if(flag>sum){
                    sum=flag;
                }
            }
        }
        return sum;
    }
}