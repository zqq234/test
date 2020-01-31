class SubtractProductAndSum {
    public int subtractProductAndSum(int n) {
        int add=0;
        int mul=1;
       while(n>0){
           int f=n%10;
           n/=10;
           add+=f;
           mul*=f;
       }
       return mul-add;
    }  
}