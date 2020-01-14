class StockSpanner {
    List list;
    public StockSpanner() {
        list=new ArrayList<Integer>();
    }
    
    public int next(int price) {
        int count=0;
        list.add(price);
        for(int i=list.size()-1;i>=0;i--){
            if((Integer)list.get(i)<=price){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}