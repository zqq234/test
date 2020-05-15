import java.util.*;
public class Game{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] a=new String[n];
        int flag1=0;
        String[] b=new String[n];
        int flag2=0;
        int[] a1=new int[3];
        int[] b1=new int[3];
        for(int i=0;i<n;i++){
            String jia=sc.next();
            String yi=sc.next();
            if(jia.equals("B")&&yi.equals("C")||jia.equals("J")&&yi.equals("B")||jia.equals("C")&&yi.equals("J")){
                a1[0]++;
                b1[2]++;
                a[flag1++]=jia;
            }else if(jia.equals("B")&&yi.equals("B")||jia.equals("J")&&yi.equals("J")||jia.equals("C")&&yi.equals("C")){
                a1[1]++;
                b1[1]++;
            }else{
                a1[2]++;
                b1[0]++;
                a[flag2++]=yi;
            }
        }
        System.out.println(a1[0]+" "+a1[1]+" "+a1[2]);
        System.out.println(b1[0]+" "+b1[1]+" "+b1[2]);
        int countB=0;
        int countJ=0;
        int countC=0;
        for(int i=0;i<flag1;i++){
            if(a[i].equals("B")){
                countB++;
            }else if(a[i].equals("J")){
                countJ++;
            }else{
                countC++;
            }
        }
        int max=countB;
        char res='B';
        if(countC>countB){
            max=countC;
            res='C';
        }
        if(countJ>max){
            max=countJ;
            res='J';
        }
        System.out.print(res+" ");
        countB=0;
        countJ=0;
        countC=0;
        
        for(int i=0;i<flag2;i++){
            if(b[i].equals("B")){
                countB++;
            }else if(b[i].equals("J")){
                countJ++;
            }else{
                countC++;
            }
        }
        max=countB;
        res='B';
        if(countC>countB){
            max=countC;
            res='C';
        }
        if(countJ>max){
            max=countJ;
            res='J';
        }
        System.out.print(res);
    }
}