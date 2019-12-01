class MatrixReshape {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row=nums.length;
        int col=nums[0].length;
        int[][] arr=new int[r][c];
        if((r*c)!=(row*col)){
            return nums;
        }
        int x=0;
        int y=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[x][y++]=nums[i][j];
                if(y==c){
                    x++;
                    y=0;
                }
            }
        }
        
        return arr;
    }
}
