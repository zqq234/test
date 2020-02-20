class FindMedianSortedArrays1 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int len=len1+len2;
        int aflag=0;
        int bflag=0;
        int left=0;
        int right=0;
        for(int i=0;i<=len/2;i++){
            left=right;
            if(aflag<len1&&(bflag>=len2||nums2[bflag]>nums1[aflag])){
                right=nums1[aflag++];
            }else{
                right=nums2[bflag++];
            }
        }
        if((len&1)==0){
            return (left+right)/2.0;
        }else{
            return right;
        }
    }
}