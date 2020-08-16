import java.util.Arrays;
public class VerifySquenceOfBST{
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence==null||sequence.length==0)
            return false;
        return Verify(sequence,0,sequence.length-1);
    }
    public boolean Verify(int[] sequence,int start,int end){
        if(start>=end)
            return true;
        int key=sequence[end];
        int i;
        for(i=start;i<end;i++){
            if(sequence[i]>key){
                break;
            }
        }
        for(int j=i;j<end;j++){
            if(sequence[j]<key){
                return false;
            }
        }
        return Verify(sequence,start,i-1)&&Verify(sequence,i,end-1);
    }
}