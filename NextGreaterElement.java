class NextGreaterElement{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    int k=j;
                    for(;k<nums2.length;k++){
                        if(nums1[i]<nums2[k]){
                            nums1[i]=nums2[k];
                            break;
                        }
                    }
                    if(k==nums2.length){
                        nums1[i]=-1;
                    }
                    break;
                }
            }
        }
        return nums1;
    }
}
