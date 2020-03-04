class Divide {
    public int divide(int dividend, int divisor) {
        boolean flag=(dividend>0)^(divisor>0);
        int result=0;
        if(dividend>0){
            dividend=-dividend;
        }
        if(divisor>0){
            divisor=-divisor;
        }
        while(dividend<=divisor){
            int tmp_divisor=divisor;
            int tmp_result=-1;
            while(dividend<=(tmp_divisor<<1)){
                if(tmp_divisor<=(Integer.MIN_VALUE>>1)){
                    break;
                }
                tmp_divisor=tmp_divisor<<1;
                tmp_result=tmp_result<<1;
            }
            dividend-=tmp_divisor;
            result+=tmp_result;
        }
        if(!flag){
            if(result<=Integer.MIN_VALUE){
                return Integer.MAX_VALUE;
            }
            return -result;
        }
        return result;
    }
}
