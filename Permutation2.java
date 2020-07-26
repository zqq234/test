class Permutation{有重复字符串的排列组合
    public String[] permutation(String S) {
        Set<String> res=new HashSet<>();
        dfs(res,S.toCharArray(),0,S.length());
        String[] str=new String[res.size()];
        int flag=0;
        for(String ss:res){
            str[flag++]=ss;
        } 
        return str;
    }
    public void dfs(Set<String> res,char[] arr,int start,int len){
        if(start==len){
            res.add(new String(arr));
            return;
        }
        for(int i=start;i<len;i++){
            swap(arr,i,start);
            dfs(res,arr,start+1,len);
            swap(arr,i,start);
        }
        
    }
    public void swap(char[] arr,int x,int y){
        char tmp=arr[x];
        arr[x]=arr[y];
        arr[y]=tmp;
    }
}