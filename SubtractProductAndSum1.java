class SubtractProductAndSum1 {
    public int subtractProductAndSum(int n) {
        String num = n + "";
        int sum = 0;
        int plus = 1;
        //int[] a = new int[num.length()];
        for(int i=0;i<num.length();i++){
            sum += Integer.parseInt(num.substring(i,i+1));
            plus *= Integer.parseInt(num.substring(i,i+1));
        }
        return (plus-sum);
    }
}
