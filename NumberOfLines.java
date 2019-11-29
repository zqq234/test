class NumberOfLines {
    public int[] numberOfLines(int[] widths, String S) {
        int h=1;
        int d=0;
        for(char x:S.toCharArray()){
            if(d+widths[x-'a']>100){
                h++;
                d=widths[x-'a'];
            }else{
                d+=widths[x-'a'];
            }
        }
        return new int[]{h,d};
    }
}
