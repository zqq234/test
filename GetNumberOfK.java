public class GetNumberOfK{
    public int GetNumberOfK(int [] array , int k) {
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>k){
                break;
            }else if(array[i]==k){
                count++;
            }
        }
        return count;
    }
}