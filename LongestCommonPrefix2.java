class LongestCommonPrefix2 {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
        int len=strs[0].length();
        for(int i=1;i<strs.length;i++){
            len=Math.min(len,strs[i].length());
        }
        int left=0;
        int right=len;
        while(left<=right){
            int mid=(left+right)/2;
            if(func(strs,mid)){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return strs[0].substring(0,(left+right)/2);
    }
    public boolean func(String[] strs,int len){
        String str=strs[0].substring(0,len);
        for(int j=1;j<strs.length;j++){
            if(!strs[j].startsWith(str)){
                return false;
            }
        }
        return true;
    }
}