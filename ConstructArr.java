class ConstructArr {
    public int[] constructArr(int[] a) {
        int len=a.length;
        if(a==null||len==0){
            return a;
        }
        int[] b=new int[len];
        int[] c=new int[len];
        b[0]=1;
        for(int i=1;i<len;i++){
            b[i]=a[i-1]*b[i-1];
        }
        c[len-1]=1;
        for(int j=len-2;j>=0;j--){
            c[j]=a[j+1]*c[j+1];
            b[j]=b[j]*c[j];
        }
        return b;
    }
}