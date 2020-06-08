public class MovingCount {
    int count=0;
    public void func(int[][] flag,int i,int j,int threshold,int rows,int cols){
        if(i<0||i>=rows||j<0||j>=cols||flag[i][j]==1){
            return;
        }
        if(!isVaild(threshold,i,j)){
            flag[i][j]=1;
            return;
        }
        count++;
        flag[i][j]=1;
        func(flag,i-1,j,threshold,rows,cols);
        func(flag,i+1,j,threshold,rows,cols);
        func(flag,i,j-1,threshold,rows,cols);
        func(flag,i,j+1,threshold,rows,cols);
    }
    public boolean isVaild(int threshold,int rows,int cols){
        int sum=0;
        while(rows>0){
            sum+=rows%10;
            rows/=10;
        }
        while(cols>0){
            sum+=cols%10;
            cols/=10;
        }
        if(sum>threshold){
            return false;
        }else{
            return true;
        }
    }
    
    public int movingCount(int threshold, int rows, int cols)
    {
        int[][]flag=new int[rows][cols];
        func(flag,0,0,threshold,rows,cols);
        return count;
    }
}