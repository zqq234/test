class Print_diamond {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 输出菱形
     * @param n int整型 行数&列数
     * @return string字符串
     */
    public String print_diamond (int n) {
        // write code here
        String[][]res=new String[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res[i][j]="*";
            }
        }
        for(int i=0;i<=n/2;i++){
            int count=i+1;
            for(int j=n/2;count>0;j--){
                res[i][j]=String.valueOf(count);
                res[i][n-j-1]=String.valueOf(count);
                res[n-i-1][j]=String.valueOf(count);
                res[n-i-1][n-j-1]=String.valueOf(count);
                count--;
            }
        }
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sb.append(res[i][j]);
            }
            if(i==n-1){
                break;
            }
            sb.append("|");
        }
        return sb.toString();
    }
}