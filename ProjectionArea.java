class ProjectionArea {
    public int projectionArea(int[][] grid) {
        int len=grid.length;
        int a=0;
        
        for(int i=0;i<len;i++){
            int b=0;
            int c=0;
            for(int j=0;j<len;j++){
                if(grid[i][j]>0){
                    a++;
                }
                if(grid[i][j]>b){
                    b=grid[i][j];
                }
                if(grid[j][i]>c){
                    c=grid[j][i];
                }
            }
            a+=b+c;
        }
        return a;
    }
}
