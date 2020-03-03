class StrStr {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length(), nLen = needle.length();
        for (int i = 0; i <= hLen - nLen; i++){ 
            int j = 0;
            for (;j < nLen; j++){
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == nLen){
                return i;
            }
        }
        return -1;
    }
}