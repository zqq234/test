public class InversePairs {
    int count=0;
    public int InversePairs(int [] array) {
        MergeSort(array,0,array.length-1);
        return count%1000000007;
    }
    public void MergeSort(int[] array,int l,int r){
        if(r>l){
            int mid=(l+r)/2;
            MergeSort(array,l,mid);
            MergeSort(array,mid+1,r);
            merge(array,l,mid,r);
        }
    }
    public void merge(int[] array,int l,int mid,int r){
        int[] tmp=new int[r-l+1];
        int left=l;
        int right=mid+1;
        int flag=0;
        while(left<=mid&&right<=r){
            if(array[left]<array[right]){
                tmp[flag++]=array[left++];
            }else{
                tmp[flag++]=array[right++];
                count=(count+mid-left+1)%1000000007;
            }
        }
        while(left<=mid){
            tmp[flag++]=array[left++];
        }
        while(right<=r){
            tmp[flag++]=array[right++];
        }
        System.arraycopy(tmp,0,array,l,tmp.length);
    }
}