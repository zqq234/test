class WaysToStep {
    public int waysToStep(int n) {
         int a=1;
         int b=2;
         int c=4;
         if(n==1||n==2){
             return n;
         }else if(n==3){
             return 4;
         }
         for(int i=4;i<=n;i++){
             int d=((a+b)%1000000007+c)%1000000007;
             a=b;
             b=c;
             c=d;
         }
         return c;
    }
}