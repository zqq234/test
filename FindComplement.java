class FindComplement {
    public int findComplement(int num) {
        long x=1;
        while(x<=num){
            x<<=1;
        }
        x-=1;
        return (int)x^num;
    }
}