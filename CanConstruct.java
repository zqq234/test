class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] a=new int[26];
        for(char x:magazine.toCharArray()){
            a[x-'a']++;
        }
        for(char x:ransomNote.toCharArray()){
            if(--a[x-'a']<0){
                return false;
            }
        }
        return true;
    }
}
