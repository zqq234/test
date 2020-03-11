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
        int left=0;
        int right=len-1;
        int leftsum=A[left];
        int rightsum=A[right];
        while(left+1<right){
            if(leftsum==a&&rightsum==a){
                return true;
            }
            if(leftsum!=a){
                leftsum+=A[++left];
            }
            if(rightsum!=a){
                rightsum+=A[--right];
            }
        }
        return false;
    }
}