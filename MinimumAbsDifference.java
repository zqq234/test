class MinimumAbsDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res=new ArrayList();
        Arrays.sort(arr);
        int s=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if((arr[i+1]-arr[i])==s){
                res.add(Arrays.asList(arr[i],arr[i+1]));
            }else if((arr[i+1]-arr[i])<s){
                s=arr[i+1]-arr[i];
                res.clear();
                res.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return res;
    }
}
