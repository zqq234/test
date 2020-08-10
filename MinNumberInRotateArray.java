import java.util.ArrayList;
public class MinNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        int low=0;
        int high=array.length-1;
        if(high==-1)
            return 0;
        while(low<high){
            if(array[low]<array[high]){
                return array[low];
            }
            int mid=(low+high)/2;
            if(array[low]<array[mid]){
                low=mid+1;
            }else if(array[low]>array[mid]){
                high=mid;
            }else{
                low++;
            }
        }
        return array[low];
    }
}