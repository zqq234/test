class TitleToNumber {
    public int titleToNumber(String s) {
        int flag=0;
        for(int i=0;i<s.length();i++){
            int num=s.charAt(i)-'A'+1;
            flag=flag*26+num;
        }
        return flag;
    }
}
