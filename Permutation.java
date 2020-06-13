class Permutation {
    public String[] permutation(String S) {
        List<String> res=new ArrayList<>();
        func(S.toCharArray(),0,S.length(),res);
        int len=res.size();
        String[] arr=new String[len];
        for(int i=0;i<len;i++){
            arr[i]=res.get(i);
        }
        return arr;
    }
    public void func(char[] arr,int start,int len,List<String> list){
        if(start==len){
            list.add(new String(arr));
            return;
        }
        for(int i=start;i<len;i++){
            swap(arr,i,start);
            func(arr,start+1,len,list);
            swap(arr,i,start);
        }
    }
    public void swap(char[] arr,int x,int y){
        char tmp=arr[x];
        arr[x]=arr[y];
        arr[y]=tmp;
    }
}