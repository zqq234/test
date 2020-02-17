public int ReverseInt1(int x) {
    public int reverse(int x) {
        long temp = 0;
       
        while(x != 0){
            int pop = x % 10;
            temp = temp * 10 + pop;
            
            if(temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE){
                return 0;
            }
            x /= 10;
        }
        return (int)temp;
    }
}