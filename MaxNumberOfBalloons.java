class MaxNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        int[] arr=new int[26];
        for(char x:text.toCharArray()){
            arr[x-'a']++;
        }
        arr['l'-'a']/=2;
        arr['o'-'a']/=2;
        int min=Integer.MAX_VALUE;
        for(char x:"ballon".toCharArray()){
            if(arr[x-'a']<min){
                min=arr[x-'a'];
            }
        }
        return min;
    }
}