public class JumpFloorII {
    public int JumpFloorII(int target) {
        if(target==1)
            return 1;
        int[] res=new int[target+1];
        res[0]=1;
        res[1]=1;
        res[2]=2;
        for(int i=3;i<target+1;i++){
            int sum=0;
            for(int j=0;j<i;j++){
                sum+=res[j];
            }
            res[i]=sum;
        }
        return res[target];
    }
}