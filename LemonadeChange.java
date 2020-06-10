class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        for(int x:bills){
            if(x==5){
                five++;
            }else if(x==10){
                if(five==0)
                    return false;
                five--;
                ten++;
            }else{
                if(ten>0&&five>0){
                    five--;
                    ten--;
                }else if(five>2){
                    five-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}