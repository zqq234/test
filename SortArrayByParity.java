class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int left=0;
        int right=A.length-1;
        while(left<right){
            while(left<right&&A[left]%2==0){
                left++;
            }
            while(left<right&&A[right]%2!=0){
                right--;
            }
            if(left<right){
                int tmp=A[right];
            A[right]=A[left];
            A[left]=tmp;
            }
            
        }
        return A;
    }
}
