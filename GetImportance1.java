class GetImportance1 {
    Map map;
    public int getImportance(List<Employee> employees, int id) {
       map=new HashMap();
       for(Employee m:employees){
           map.put(m.id,m);
       }
       Queue<Integer> q=new LinkedList<>();
       int count=0;
       q.offer(id);
       while(!q.isEmpty()){
           
           Employee m=(Employee)map.get(q.poll());
           count+=m.importance;
           for(int x:m.subordinates){
               q.offer(x);
           }
       }
       return count;
    }
}