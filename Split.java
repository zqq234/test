class Split {
    public int balancedStringSplit(String s) {
        int count=0;
        int flag=0;
        for(int x:s.toCharArray()){
            if(x=='R'){
                flag++;
            }else{
                flag--;
            }
            if(flag==0){
                count++;
            }
        }
        return count;
    }
}