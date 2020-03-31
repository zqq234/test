class Add {
    public int add(int a, int b) {
        while(b!=0){
            int sum=a^b;
            b=(a&b)<<1;
            a=sum;
        }
        return a;
    }
}