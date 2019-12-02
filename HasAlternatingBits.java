class HasAlternatingBits{
    public boolean hasAlternatingBits(int n) {
        while(n>0){
            if((n&3)==0||(n&3)==3){
                return false;
            }
            n>>=1;
        }
        return true;
    }
}
