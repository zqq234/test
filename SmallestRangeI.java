class SmallestRangeI {
    public int smallestRangeI(int[] A, int K) {
        int min=A[0];
        int max=A[0];
        for(int x:A){
            min=Math.min(x,min);
            max=Math.max(x,max);
        }
        return (Math.max(0,max-min-2*K));
    }
}
