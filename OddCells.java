class OddCells {
    public int oddCells(int n, int m, int[][] indices) {
        int[] ri=new int[n];
        int[] ci=new int[m];
        for(int i=0;i<indices.length;i++){
            ri[indices[i][0]]++;
            ci[indices[i][1]]++;
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((ri[i]+ci[j])%2>0){
                    count++;
                }
            }
        }
        return count;
    }
}