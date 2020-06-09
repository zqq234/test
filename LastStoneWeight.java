class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q=new PriorityQueue<>((x1,x2)->(x2-x1));
        for(int x:stones){
            q.offer(x);
        }
        while(q.size()>1){
            int x=q.poll();
            int y=q.poll();
            if(x!=y){
                q.offer(Math.abs(x-y));
            }else{
                q.offer(0);
            }
        }
        return q.poll();
    }
}