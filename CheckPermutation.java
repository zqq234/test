class CheckPermutation {
    public boolean checkPermutation(String s1, String s2) {
        int len1=s1.length();
        int len2=s2.length();
        if(len1!=len2){
            return false;
        }
        char[] str1=new char[26];
        char[] str2=new char[26];
        for(char x:s1.toCharArray()){
            str1[x-'a']++;
        }
        for(char x:s2.toCharArray()){
            str2[x-'a']++;
        }
        for(int i=0;i<26;i++){
            if(str1[i]!=str2[i]){
                return false;
            }
        }
        return true;
    }
}
