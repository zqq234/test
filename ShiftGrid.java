class ShiftGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int len=grid.length;
        int len1=grid[0].length;
        int times=k%(len*len1);
        for(int i=0;i<times;i++){
            int tmp=grid[len-1][len1-1];
            for(int j=len-1;j>=0;j--){
                for(int z=len1-1;z>=0;z--){
                    if(j==0&&z==0){
                        grid[j][z]=tmp;
                    }else{
                        if(z==0){
                            grid[j][z]=grid[j-1][len1-1];
                        }else{
                            grid[j][z]=grid[j][z-1];
                        }
                    }
                }
            }
        }
        List<List<Integer>> list=new ArrayList<>();
        for(int[] arr:grid){
            List l=new ArrayList();
            for(int a:arr){
                
                l.add(a);
            }
            list.add(l);
        }
        return list;
    }
}
