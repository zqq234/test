class CanThreePartsEqualSum {
    public boolean canThreePartsEqualSum(int[] A) {
        int len=A.length;
        int sum=0;
        for(int i=0;i<len;i++){
            sum+=A[i];
        }
        if(sum%3!=0){
            return false;
        }
        int a=sum/3;
        int sum1=0;
        int count=0;
        for(int i=0;i<len;i++){
            sum1+=A[i];
            if(sum1==a){
                count++;
                sum1=0;
            }
        }
        if(count==3){
            return true;
        }else{
            return false;
        }
    }
}
