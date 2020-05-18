class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int slen=s.length();
        int tlen=t.length();
        boolean[][] dp=new boolean[slen+1][tlen+1];
        for(int i=0;i<=tlen;i++){
            dp[0][i]=true;
        }
        for(int i=1;i<=slen;i++){
            for(int j=1;j<=tlen;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=dp[i][j-1];
                }
            }
        }
        return dp[slen][tlen];
    }
}

