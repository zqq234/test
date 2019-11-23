class CountPrimeSetBits {
    public int countPrimeSetBits(int L, int R) {
        int count=0;
        int[] primes = {0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1};
        for(int i=L;i<=R;i++){
            int num=Integer.bitCount(i);
            count+=primes[num];
        }
        return count;
    }
}
