class NumUniqueEmails {
    public int numUniqueEmails(String[] emails) {
        Set<String> set=new HashSet();
        for(String str:emails){
            int i=str.indexOf('@');
            String str1=str.substring(0,i);
            String str2=str.substring(i);
            if(str.contains("+")){
                str1=str1.substring(0,str1.indexOf('+'));
            }
            str1=str1.replace(".","");
            set.add(str1+str2);
        }
        return set.size();
    }

}
