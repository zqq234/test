class DistributeCandies {
    public int distributeCandies(int[] candies) {
        Set<Integer> set=new HashSet();
        for(int x:candies){
            set.add(x);
        }
        return set.size()>candies.length/2?candies.length/2:set.size();
    }
}
