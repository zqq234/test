class Convert {
    public String convert(String s, int numRows) {
        int len=s.length();
        if(numRows==1){
            return s;
        }
        List<StringBuffer> res=new ArrayList<>();
        for(int i=0;i<Math.min(len,numRows);i++){
            res.add(new StringBuffer());
        }
        boolean flag=false;
        int start=0;
        for(char x:s.toCharArray()){
            res.get(start).append(x);
            if(start==0||start==numRows-1){
                flag=!flag;
            }
            start+=flag?1:-1;
            
        }
        StringBuffer ret=new StringBuffer();
        for(StringBuffer sb:res){
            ret.append(sb);
        }
        return ret.toString();
    }
}
