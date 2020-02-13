class PrintNumbers {
    public int[] printNumbers(int n) {
        int len=(int)Math.pow(10,n);
        int[] arr=new int[len-1];
        for(int i=0;i<len-1;i++){
            arr[i]=i+1;
        }
        return arr;
    }
}