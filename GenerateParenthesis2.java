class GenerateParenthesis {
    List<String> res=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs(new char[2*n],0,2*n);
        return res;
    }
    public void dfs(char[] arr,int start,int len){
        if(start==len){
            if(isVaild(arr)){
                res.add(new String(arr));
            }
            return;
        }
        arr[start]='(';
        dfs(arr,start+1,len);
        arr[start]=')';
        dfs(arr,start+1,len);
    }
    public void swap(char[]arr,int x,int y){
        char tmp=arr[x];
        arr[x]=arr[y];
        arr[y]=tmp;
    }
    public boolean isVaild(char[] arr){
        int flag=0;
        for(char x:arr){
            if(x=='('){
                flag++;
            }else{
                flag--;
            }
            if(flag<0)
                return false;
        }
        if(flag==0)
            return true;
        else   
            return false;
    }
}