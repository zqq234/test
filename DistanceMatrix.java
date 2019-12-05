class DistanceMatrix {
  public static int[][] distanceMatrix(int R, int C, int r0, int c0) {
        int[][]arr=new int[R*C][2];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                arr[i*C+j][0]=Math.abs(i-r0);
                arr[i*C+j][1]=Math.abs(j-c0);
            }
        }
        
        return arr;
    }
}