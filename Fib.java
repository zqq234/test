class Fib {
    public int fib(int N) {
        int cur=0;
        int next=1;
        while(N-->0){
            next=next+cur;
            cur=next-cur;
        }
        return cur;
    }
}
