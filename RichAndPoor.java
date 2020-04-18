public class RichAndPoor{
    public static void main(String[]args){
        int m=1;
        int n=0;
        for(int i=1;i<30;i++){
            m=m+(int)Math.pow(2,i);   
        }
        n=30*10;;
        System.out.println(n+" "+m);
    }
}