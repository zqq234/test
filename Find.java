public class Solution {
    public boolean Find(int target, int [][] array) {
        if(array==null||array.length==0||array[0].length==0)
            return false;
        int row=0;
        int col=array[0].length-1;
        while(true){
            if(array[row][col]<target){
                row++;
            }else if(array[row][col]>target){
                col--;
            }else{
                return true;
            }
             if(col<0||row>=array.length){
                 return false;
             }
        }
    }
}