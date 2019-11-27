class Generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> tmp=new ArrayList<Integer>();
        for(int i=0;i<numRows;i++){
            tmp.add(0,1);
            for(int j=1;j<tmp.size()-1;j++){
                tmp.set(j,tmp.get(j)+tmp.get(j+1));
            }
            result.add(new ArrayList<Integer>(tmp));
        }
        return result;
    }
}
