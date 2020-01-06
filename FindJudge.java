class FindJudge {
    public int findJudge(int N, int[][] trust) {
        int[] arr=new int[N+1];
        int[] arr2=new int[N+1];
        for(int[] a:trust){
            arr[a[0]]++;
            arr2[a[1]]++;
        }
        for(int i=1;i<N+1;i++){
            if(arr[i]==0&&arr2[i]==N-1){
                return i;
            }
        }
        return -1;
    }
}