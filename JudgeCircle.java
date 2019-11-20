class JudgeCircle {
    public boolean judgeCircle(String moves) {
        int flag1=0;
        int flag2=0;
        for(char x:moves.toCharArray()){
            if(x=='U')
                flag1++;
            if(x=='D')
                flag1--;
            if(x=='R')
                flag2++;
            if(x=='L')
                flag2--;
        }
        if(flag1==0&&flag2==0){
            return true;
        }else{
            return false;
        }
    }
}