class LargestSumAfterKNegations {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
            if(A[i]>=0||K==0){
                break;
            }else if(A[i]<0){
                A[i]=(-1)*A[i];
                K--;
            }
        }
        if(K%2==1){
            Arrays.sort(A);
            A[0]*=-1;
        }
        int total=0;
        for(int i=0;i<A.length;i++){
            total+=A[i];
        }
        return total;
    }
}