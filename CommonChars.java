class CommonChars {
    public List<String> commonChars(String[] A) {
        List<String> list=new ArrayList<String>();
        int[] arr=new int[26];
        for(int i=0;i<26;i++){
            arr[i]=Integer.MAX_VALUE;
        }
        int len=A.length;
        for(int i=0;i<len;i++){
            int[] tmp=new int[26];
            for(char x:A[i].toCharArray()){
                tmp[x-'a']++;
            }
            for(int j=0;j<26;j++){
                arr[j]=Math.min(tmp[j],arr[j]);
            }
        }
        for(int i=0;i<arr.length;i++){
            while(arr[i]>0){
                list.add(""+(char)(i+'a'));
                arr[i]--;
            }
        }
        return list;
    }
}
