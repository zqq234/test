class CountAndSay {
    public String countAndSay(int n) {
        String s="1";
        for(int i=1;i<n;i++){
            s=func(s.toCharArray());
        }
        return s;
    }
    public String func(char[] arr){
        StringBuffer sb=new StringBuffer();
        char ch=arr[0];
        int i=1;
        int count=1;
        while(i<arr.length){
            if(arr[i]==ch){
                count++;
            }else{
                sb.append(count).append(arr[i-1]);
                count=1;
                ch=arr[i];
            }
            i++;
        }
        sb.append(count).append(arr[i-1]);
        return sb.toString();
    }
}