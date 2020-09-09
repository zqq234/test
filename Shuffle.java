public int[] shuffle(int[] nums, int n) {
        int [] ret = new int[2*n];
        for(int i=0;i<n;i++){
            ret[i*2]=nums[i];
            ret[i*2+1]= nums[n+i];
        }
        return ret;

}
