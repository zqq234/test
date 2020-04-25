class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        int len=s.length();
        boolean[] canbreak=new boolean[len+1];
        canbreak[0]=true;
        for(int i=1;i<=len;i++){
            for(int j=i-1;j>=0;j--){
                if(canbreak[j]&&wordDict.contains(s.substring(j,i))){
                    canbreak[i]=true;
                    break;
                }
            }
        }
        return canbreak[len];
    }
}