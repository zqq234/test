class CountNegatives {
    public int countNegatives(int[][] grid) {
        int len1=grid.length;
        int len2=grid[0].length;
        int count=0;
        int i=0;
        int j=len2-1;
        while(i<len1&&j>=0){
            if(grid[i][j]<0){
                count+=len1-i;
                j--;
            }else if(grid[i][j]>=0){
                i++;
            }
        }
        return count;
    }
}