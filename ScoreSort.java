import java.util.*;
class Stu implements Comparable<Stu>{
    String name;
    int score;
    static int flag;
    public Stu(String name,int score){
        this.name=name;
        this.score=score;
    }
    public int compareTo(Stu o){
        if(flag==0){
            return o.score-score;
        }
        return score-o.score;
    }
}
public class ScoreSort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            List<Stu> list=new ArrayList<>();
            int n=sc.nextInt();
            Stu.flag=sc.nextInt();
            for(int i=0;i<n;i++){
                String name=sc.next();
                int score=sc.nextInt();
                Stu student=new Stu(name,score);
                list.add(student);
            }
            Collections.sort(list);
            for(Stu s:list){
                System.out.println(s.name+" "+s.score);
            }
        }
    }
}