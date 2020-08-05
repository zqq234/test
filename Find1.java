public class Find {
    public boolean Find(int target, int [][] array) {
        if(array==null||array.length==0){
            return false;
        }
        int rlen=array.length;
        int clen=array[0].length;
        int j=clen-1;
        int i=0;
        while(true){
            if(i>=rlen||j<0){
                return false;
            }
            if(array[i][j]<target){
                i++;
            }else if(array[i][j]>target){
                j--;
            }else{
                return true;
            }
        }
    }
}