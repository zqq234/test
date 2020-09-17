public class Craw{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        int m=sc.nextInt();
        n=n/100;
        if(n>m){
            System.out.println(1);
            return;
        }
        double height=0;
        for(int i=1;;i++){
            height+=n;
            if(height>m){
                System.out.println(i);
                break;
            }
            for(int j=1;j<=i;j++){
                height-=n/(Math.pow(2,j));
            }
        }
    }
}