class Permutation {
    public String[] permutation(String s) {
        Set<String> res=new HashSet<>();
        dfs(res,s.toCharArray(),s.length(),0);
        int len=res.size();
        String[] str=new String[len];
        int flag=0;
        for(String x:res){
            str[flag++]=x;
        }
        return str;
    }
    public void dfs(Set<String> res,char[] arr,int len,int start){
        if(start==len){
            res.add(new String(arr));
            return;
        }
        for(int i=start;i<len;i++){
            swap(arr,i,start);
            dfs(res,arr,len,start+1);
            swap(arr,i,start);
        }
    }
    public void swap(char[] arr,int x,int y){
        char tmp=arr[x];
        arr[x]=arr[y];
        arr[y]=tmp;
    }
}