class ReplaceElements1 {
    public int[] replaceElements(int[] arr) {
        int len=arr.length;
        int max=arr[len-1];
        for(int i=len-2;i>=0;i--){
            int flag=max;
            if(arr[i]>max){
                max=arr[i];
            }
            arr[i]=flag;
        }
        arr[len-1]=-1;
        return arr;
    }
}