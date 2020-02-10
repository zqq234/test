class ReplaceElements {
    public int[] replaceElements(int[] arr) {
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            int max=arr[i+1];
            for(int j=i+1;j<len;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            arr[i]=max;
        }
        arr[len-1]=-1;
        return arr;
    }
}