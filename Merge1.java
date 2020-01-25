class Merge1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int flag1=m-1;
        int flag2=n-1;
        int flag=m+n-1;
        while(flag1>=0&&flag2>=0){
            nums1[flag--]=nums1[flag1]>nums2[flag2]?nums1[flag1--]:nums2[flag2--];
        }
        System.arraycopy(nums2,0,nums1,0,flag2+1);
    }
}