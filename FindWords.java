class FindWords{
    public String[] findWords(String[] words) {
        int[] flag={2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
        List<String> list=new ArrayList();
        for(String str:words){
            int a=0;
            String str1=str.toLowerCase();
            int tmp=flag[str1.charAt(0)-'a'];
            for(char x:str1.toCharArray()){
                if(flag[x-'a']!=tmp){
                    a=1;
                    break;
                }
            }
            if(a==0){
                list.add(str);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
