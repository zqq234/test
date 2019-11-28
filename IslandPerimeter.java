class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int row=grid.length-1;
        int col=grid[0].length-1;
        int res=0;
        int num=0;
        for(int i=0;i<=row;i++){
            for(int j=0;j<=col;j++){
                num=0;
                if(grid[i][j]==1){
                    num=4;
                    if(i>0&&grid[i-1][j]==1){
                        num--;
                    }
                    if(i<row&&grid[i+1][j]==1){
                        num--;
                    }
                    if(j>0&&grid[i][j-1]==1){
                        num--;
                    }
                    if(j<col&&grid[i][j+1]==1){
                        num--;
                    }
                }
                res+=num;
            }
        }
        return res;
    }
    
}
