clclass OrangesRotting {
    public int orangesRotting(int[][] grid) {
        Queue<Integer> q=new LinkedList<Integer>();
        int time=0;
        int rlen=grid.length;
        int clen=grid[0].length;
        for(int i=0;i<rlen;i++){
            for(int j=0;j<clen;j++){
                if(grid[i][j]==2){
                    int flag=i*clen+j;
                    q.offer(flag);
                }
            }
        }
        while(!q.isEmpty()){
            time++;
            int size=q.size();
            while(size>0){
                int aflag=q.poll();
                int row=aflag/clen;
                int col=aflag%clen;
                if(row>0&&grid[row-1][col]==1){
                    grid[row-1][col]=2;
                    int flag=(row-1)*clen+col;
                    q.offer(flag);
                }
                if(col>0&&grid[row][col-1]==1){
                    grid[row][col-1]=2;
                    int flag=row*clen+col-1;
                    q.offer(flag);
                }
                if(row<rlen-1&&grid[row+1][col]==1){
                    grid[row+1][col]=2;
                    int flag=(row+1)*clen+col;
                    q.offer(flag);
                }
                if(col<clen-1&&grid[row][col+1]==1){
                    grid[row][col+1]=2;
                    int flag=row*clen+col+1;
                    q.offer(flag);
                }
                size--;
            }
        }
        for(int i=0;i<rlen;i++){
            for(int j=0;j<clen;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return time==0?0:time-1;
    }
}

