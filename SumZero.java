class SumZero {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        if(n%2==1){
            arr[n-1]=0;
            n--;
        }
        int flag=1;
        for(int i=0;i<n;i+=2){
            arr[i]=flag;
            arr[i+1]=-1*flag++;
        }
        return arr;
    }
}