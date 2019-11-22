class RepeatedNTimes {
    public int repeatedNTimes(int[] A) {
        List list=new ArrayList();
        for(int x:A){
            if(list.contains(x)){
                return x;
            }else{
                list.add(x);
            }
        }
        return -1;
    }
}
