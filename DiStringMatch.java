class DiStringMatch {
    public int[] diStringMatch(String S) {
	int[]arr=new int[S.length()+1];
        int max=S.length();
        int min=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='D'){
                arr[i]=max--;
            }else{
                arr[i]=min++;
            }
        }
        arr[S.length()]=max;
        return arr;
      /*List<Integer> list=new ArrayList();
        for(int i=0;i<=S.length();i++){
            list.add(i);
        }
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='D'){
                int data=list.get(S.length());
                list.add(i,data);
                list.remove(S.length()+1);
            }
        }
        int[]a=new int[S.length()+1];
        for(int i=0;i<=S.length();i++){
            a[i]=list.get(i);
        }
        return a;*/

    }
}