import java.util.ArrayList;
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> res=new ArrayList<>();
        int i=0;
        int j=array.length-1;
        while(i<j){
            if(array[i]+array[j]<sum){
                i++;
            }else if(array[i]+array[j]>sum){
                j--;
            }else{
                res.add(array[i]);
                res.add(array[j]);
                return res;
            }
        }
        return res;
    }
}