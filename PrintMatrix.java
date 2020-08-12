import java.util.ArrayList;
public class PrintMatrix{
    public ArrayList<Integer> printMatrix(int [][] matrix) {
       ArrayList<Integer>  res=new ArrayList<>();
        int left=0;
        int right=matrix[0].length;
        int low=0;
        int high=matrix.length;
        while(low<high&&left<right){
            for(int i=left;i<right;i++){
                res.add(matrix[low][i]);
            }
            for(int i=low+1;i<high;i++){
                res.add(matrix[i][right-1]);
            }
            if(high>low+1){
                for(int i=right-2;i>=left;i--){
                    res.add(matrix[high-1][i]);
                }
            }
            if(right>left+1){
                for(int i=high-2;i>low;i--){
                    res.add(matrix[i][left]);
                }
            }
            low++;
            high--;
            left++;
            right--;
        }
        return res;
    }
}