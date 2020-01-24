class Compress {
    public int compress(char[] chars) {
        int flag1=0;
        int len=chars.length;
        int flag=0;
        while(flag1<len){           
            int flag2=flag1;
            while(flag2<len-1&&chars[flag2+1]==chars[flag1]){
                flag2++;
            }
            chars[flag++]=chars[flag1];
            if(flag2>flag1){
                for(char x:(""+(flag2-flag1+1)).toCharArray()){
                    chars[flag++]=x;
                }
            }
            flag1=flag2+1;
        }
        return flag;
    }
}