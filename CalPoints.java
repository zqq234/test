class CalPoints {
    public int calPoints(String[] ops) {
        int[]arr=new int[ops.length];
        int flag=0;
        for(String x:ops){
            if(x.equals("C")){
                flag-=1;
            }else if(x.equals("D")){
                arr[flag]=arr[flag-1]*2;
                flag++;
            }else if(x.equals("+")){
                arr[flag]=arr[flag-1]+arr[flag-2];
                flag++;
            }else{
                arr[flag]=Integer.valueOf(x);
                flag++;
            }
        }
        int sum=0;
        for(int i=0;i<flag;i++){
            sum+=arr[i];
        }
        return sum;
    }
}

