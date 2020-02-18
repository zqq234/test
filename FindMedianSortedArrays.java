class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        if(len1==0){
            if(len2%2==0){
                return (nums2[len2/2-1]+nums2[len2/2])/2.0;
            }else{
                return nums2[len2/2];
            }
        }
        if(len2==0){
            if(len1%2==0){
                return (nums1[len1/2-1]+nums1[len1/2])/2.0;
            }else{
                return nums1[len1/2];
            }
        }
        int[] arr=new int[len1+len2];
        int count=0;
        int m=0;
        int n=0;
        while(count!=(len1+len2)){
            if(m==len1){
                while(n!=len2){
                    arr[count++]=nums2[n++];
                }
                break;
            }
            if(n==len2){
                while(m!=len1){
                    arr[count++]=nums1[m++];
                }
                break;
            }
            if(nums1[m]>nums2[n]){
                arr[count++]=nums2[n++];
            }else{
                arr[count++]=nums1[m++];
            }
        }
        int len=len1+len2;
        if((len)%2==0){
            return (arr[len/2-1]+arr[len/2])/2.0;
        }else{
            return arr[len/2];
        }
    }
}