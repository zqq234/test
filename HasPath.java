public class HasPath {
    int[][] visit;
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
        visit=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(func(matrix,i,j,rows,cols,str,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean func(char[]matrix,int i,int j,int rows,int cols,char[]str,int pos){
        if(pos>=str.length){
            return true;
        }
        if(i<0||i>=rows||j<0||j>=cols||matrix[i*cols+j]!=str[pos]||visit[i][j]==1){
            return false;
        }
        visit[i][j]=1;
        boolean flag= func(matrix,i-1,j,rows,cols,str,pos+1)||func(matrix,i+1,j,rows,cols,str,pos+1)||
            func(matrix,i,j-1,rows,cols,str,pos+1)||func(matrix,i,j+1,rows,cols,str,pos+1);
        visit[i][j]=0;
        return flag;
    }

}