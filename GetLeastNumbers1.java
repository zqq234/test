class GetLeastNumbers1 {
    public int[] getLeastNumbers(int[] arr, int k) {
        int len=arr.length;
        PriorityQueue<Integer> q=new PriorityQueue<>(len);
        for(int i=0;i<len;i++){
            q.offer(arr[i]);
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=q.poll();
        }
        return res;
    }
}