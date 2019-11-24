class SubdomainVisits {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> list=new ArrayList<String>();
        Map<String,Integer> map=new HashMap();
        for(String str:cpdomains){
            String[]str1=str.split("\\s+");
            int count=Integer.valueOf(str1[0]);
            String[]str2=str1[1].split("\\.");
            String ch="";
            for(int i=str2.length-1;i>=0;i--){
                ch=str2[i]+(i<str2.length-1?".":"")+ch;
                map.put(ch,map.getOrDefault(ch,0)+count);
            }
        }
        for(String r:map.keySet()){
            list.add(map.get(r)+" "+r);
        }
        return list;
    }
}
