import java.util.*;
public class CourseScore{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum2=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum2+=arr[i];
        }
        double[] gpa=new double[n];
        double sum=0;
        for(int i=0;i<n;i++){
            int score=sc.nextInt();
            if(score<=100&&score>=90){
                gpa[i]=4.0;
            }else if(score>=85){
                gpa[i]=3.7;
            }else if(score>=82){
                gpa[i]=3.3;
            }else if(score>=78){
                gpa[i]=3.0;
            }else if(score>=75){
                gpa[i]=2.7;
            }else if(score>=72){
                gpa[i]=2.3;
            }else if(score>=68){
                gpa[i]=2.0;
            }else if(score>=64){
                gpa[i]=1.5;
            }else if(score>=60){
                gpa[i]=1.0;
            }else{
                gpa[i]=0;
            }
            gpa[i]=gpa[i]*arr[i];
            sum+=gpa[i];
        }
        double s=sum/sum2;
        System.out.println(String.format("%.2f",s));
    }  
}