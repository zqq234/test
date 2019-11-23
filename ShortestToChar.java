class ShortestToChar{
    public int[] shortestToChar(String S, char C) {
        int len=S.length();
        int[]res=new int[len];
        int flag=Integer.MIN_VALUE/2;
        for(int i=0;i<len;i++){
            if(S.charAt(i)==C)
                flag=i;
            res[i]=i-flag;
        } 
        flag=Integer.MAX_VALUE/2;
        for(int i=len-1;i>=0;i--){
            if(S.charAt(i)==C){
                flag=i;
            }
            res[i]=Math.min(res[i],flag-i);
        }
        return res;
    }
}
