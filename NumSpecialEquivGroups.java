class NumSpecialEquivGroups {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> set=new HashSet();
        
        for(int i=0;i<A.length;i++){
            String even="";
            String odd="";
            for(int j=0;j<A[i].length();j++){
                if(j%2==0){
                    even+=A[i].charAt(j);
                }else{
                    odd+=A[i].charAt(j);
                }
            }
            char[] a=even.toCharArray();
            Arrays.sort(a);
            char[] b=odd.toCharArray();
            Arrays.sort(b);
            set.add(new String(a)+new String(b));
        }
        return set.size();
    }
}
