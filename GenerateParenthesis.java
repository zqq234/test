class GenerateParenthesis{
    public List<String> generateParenthesis(int n) {
        List<String> res=new LinkedList<String>();
        func(new char[2*n],0,res);
        return res;
    }
    public void func(char[] one,int pos,List<String> res){
        if(pos==one.length){
            if(val(one)){
                res.add(new String(one));
            }
        }else{
            one[pos]='(';
            func(one,pos+1,res);
            one[pos]=')';
            func(one,pos+1,res);
        }
    }
    public boolean val(char[] one){
        int flag=0;
        for(char x:one){
            if(x=='('){
                flag++;
            }else{
                flag--;
            }
            if(flag<0){
                return false;
            }
        }
        return (flag==0);
    }
}