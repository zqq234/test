class ThirdMax {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> tree=new TreeSet<>();
        for(int x:nums){
            tree.add(x);
            if(tree.size()>3){
                tree.remove(tree.first());
            }
        }
        return tree.size()>=3?tree.first():tree.last();
    }
}