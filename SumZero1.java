class SumZero1 {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        int flag=0;
        for(int i=1;i<=n/2;i++){
            arr[flag++]=i;
            arr[flag++]=-i;
        }
        return arr;
    }
}