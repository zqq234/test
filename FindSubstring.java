class FindSubstring {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result=new LinkedList<>();
        if(s==null||words==null||s.length()==0||words.length==0){
            return result;
        }
        HashMap<String,Integer> map=new HashMap<>();
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        int len=words.length;
        int slen=words[0].length();
        int rlen=len*slen;
        for(int i=0;i<s.length()-rlen+1;i++){
            String str=s.substring(i,i+rlen);
             HashMap<String,Integer> tmap=new HashMap<>();
            for(int j=0;j<rlen;j+=slen){
                String res=str.substring(j,j+slen);
                tmap.put(res,tmap.getOrDefault(res,0)+1);
            }
            if(map.equals(tmap)){
                result.add(i);
            }
        }
        return result;
    }
}