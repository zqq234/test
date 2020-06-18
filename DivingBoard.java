class DivingBoard {
    public int[] divingBoard(int shorter, int longer, int k) {
        if(k==0)
            return new int[0];
        if(shorter==longer){
            return new int[]{k*shorter};
        }
        int[] res=new int[k+1];
        int flag=0;
        int sum=0;
        for(int i=k;i>=0;i--){
            sum=i*shorter+(k-i)*longer;
            res[flag++]=sum;
        }
        return res;
    }
}