class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> s=new Stack<>();
        int len=T.length;
        int[]res=new int[len];
        for(int i=0;i<len;i++){
            while(!s.isEmpty()&&T[i]>T[s.peek()]){
                res[s.peek()]=i-s.pop();
            }
            s.push(i);
        }
        return res;
    }
}