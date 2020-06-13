class ReadBinaryWatch{ 
    public List<String> readBinaryWatch(int num) {
        List<List<Integer>> tmp=new ArrayList<>();
        List<String> res=new ArrayList<>();
        dfs(0,num,new ArrayList<>(),tmp);
        for(List<Integer> list:tmp){
            int hour=0;
            int minute=0;
            for(int i:list){
                if(i<4){
                    hour+=(1<<i);
                }else{
                    minute+=(1<<(i-4));
                }
            }
            if(hour>11||minute>59){
                continue;
            }
            String m=minute<10?"0"+minute:""+minute;
            res.add(hour+":"+m);
        }
        return res;
    }
    private void dfs(int start,int num,List<Integer> list,List<List<Integer>> tmp){
        if(num==0){
            tmp.add(new ArrayList(list));
            return;
        }
        for(int i=start;i<=9;i++){
            list.add(i);
            dfs(i+1,num-1,list,tmp);
            list.remove(list.size()-1);
        }
    }
}