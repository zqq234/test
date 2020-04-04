public class Main{
  public int drink1(int n){
         if(n==1)
               return 0;
         if(n==2)
               return 1;
         return n/3+drink(n/3+n%3);
  }
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     while(sc.hasNext){
          int n=sc.nextInt();
          System.out.println(n);
      }
  }
}