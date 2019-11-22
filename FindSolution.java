class FindSolution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
      int left=1;
      int right=1000;
      List<List<Integer>> res=new ArrayList();
      while(left>0&&left<=1000&&right>0&&right<=1000){
          if(customfunction.f(left,right)==z){
              List list=new ArrayList();
              list.add(left);
              list.add(right);
              res.add(list);
              left++;
          }else if(customfunction.f(left,right)>z){
              right--;
          }else{
              left++;
                }
        }
    return res;
    }
}
