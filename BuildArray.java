class BuildArray {
    public List<String> buildArray(int[] target, int n) {
        List<String> res=new ArrayList<>();
        int flag=0;
        for(int i=1;i<=n;i++){
            if(flag>=target.length){
                break;
            }else if(target[flag]!=i){
                res.add("Push");
                res.add("Pop");
            }else{
                res.add("Push");
                flag++;
            }
        }
        return res;
    }
}