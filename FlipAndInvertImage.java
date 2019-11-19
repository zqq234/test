class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0;i<A.length;i++){
            for(int j=0;j<(A[i].length+1)/2;j++){
                int tmp=A[i][j]^1;
                A[i][j]=A[i][A[i].length-1-j]^1;
                A[i][A[i].length-1-j]=tmp;
            }
        }
        /*for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                if(A[i][j]==0){
                    A[i][j]=1;
                }else{
                    A[i][j]=0;
                }
            }
        }*/
        return A;
    }
}