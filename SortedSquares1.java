class SortedSquares1 {
    public int[] sortedSquares(int[] A) {
        int len=A.length;
        int[] a=new int[len];
        int flag=len-1;
        int left=0;
        int right=len-1;
        while(left<=right){
            if(A[left]*A[left]>A[right]*A[right]){
                a[flag--]=A[left]*A[left];
                left++;
            }else{
                a[flag--]=A[right]*A[right];
                right--;
            }
        }
        return a;
    }
}