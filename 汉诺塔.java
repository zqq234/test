package EveryDayTitle;

public class 汉诺塔 {
    public static void func(char x,char y,char z,int n){
        if(n==1){
            System.out.println(x+"-->"+z);
        }else{
            func(x,z,y,n-1);
            func(x,y,z,n-1);
        }
    }
}
