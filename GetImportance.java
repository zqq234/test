class GetImportance {
    Map<Integer,Employee> map;
    public int getImportance(List<Employee> employees, int id) {
        map=new HashMap();
        for(Employee e:employees){
            map.put(e.id,e);
        }
        return func(id);
    }
    public int func(int id){
        Employee e=map.get(id);
        int count=e.importance;
        for(Integer i:e.subordinates){
            count+=func(i);
        }
        return count;
    }
}
