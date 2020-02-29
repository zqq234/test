class GenerateParenthesis1{
    public List<String> generateParenthesis(int n) {
        List<String> res=new LinkedList<String>();
        func(n,"",0,0,res);
        return res;
    }
    public void func(int n,String str,int left,int right,List<String> res){
        if(str.length()==2*n){
            res.add(str);
            return;
        }
        if(left<n){
            func(n,str+"(",left+1,right,res);
        }
        if(right<left){
            func(n,str+")",left,right+1,res);
        }
       
    }
}