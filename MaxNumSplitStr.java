public class MaxNumSplitStr {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int solution(String s) {
        int count=0;
        int len=s.length();
        int[]dp=new int[len];
        for (int i = 0; i < s.length(); i++) {
            int j=0;
            while(j<i){
                if(s.charAt(j)==s.charAt(i)){
                    break;
                }else{
                    j++;
                }
            }
            if(j<i){
                dp[i]=i-j;
            }else{
                dp[i]=0;
            }
        }
        int flag=len-1;
        while(flag>=0){
            flag-=(dp[flag]+1);
            count++;
        }
        return count;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        String _s;
        try {
            _s = in.nextLine();
        } catch (Exception e) {
            _s = null;
        }

        res = solution(_s);
        System.out.println(String.valueOf(res));

    }
}