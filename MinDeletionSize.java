class MinDeletionSize {
   public static int minDeletionSize(String[] A) {
        int count = 0;
        for(int j=0;j<A[0].length();j++){
            for(int i=0;i<A.length-1;i++){
                if(A[i].charAt(j) > A[i+1].charAt(j)){
                    count++;
                    break;
                }
            }
        }
    return count;
  }
}