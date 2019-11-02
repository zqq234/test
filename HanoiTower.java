/**
 * @className HanoiTower
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 21:24
 * @Version 1.0
 **/
public class HanoiTower {
    public static void func(char A,char B,char C,int n){
        if(n==0){
            return;
        }
        if(n==1){
            System.out.println(A+"-->"+C);
        }
        func(A,C,B,n-1);

        func(B,A,C,n-1);
    }

    public static void main(String[] args) {
        func('A','B','C',5);
    }
}
