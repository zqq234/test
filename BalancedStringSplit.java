class BalancedStringSplit {
    public int balancedStringSplit(String s) {
        if(s==null){
            return 0;
        }
        int count=0;
        int flag=0;
        for(char x:s.toCharArray()){
            if(x=='R')
                flag++;
            else
                flag--;
            if(flag==0)
                count++;
        }
        return count;
    }
}