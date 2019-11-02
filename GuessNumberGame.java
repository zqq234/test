import java.util.Random;
import java.util.Scanner;

/**
 * @className GuessNumberGame
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 11:13
 * @Version 1.0
 **/
public class GuessNumberGame {
    public static void main(String[] args) {
        int score=0;
        int sum=10;
        while(sum>0){
            Random random = new Random();
            int key = random.nextInt(100) + 1;
            System.out.println("猜测数字为："+key);
            System.out.println("游戏开始：请猜数字1-100");
            Scanner sc = new Scanner(System.in);
            int count=3;
            while(count>0){
                int number = sc.nextInt();
                if(number!=key){
                    count--;
                    System.out.println("数字错误，请重新猜，你还有"+count+"次机会！");
                }
                if(number==key){
                    System.out.println("恭喜你猜对了");
                    score+=1;
                    break;
                }
            }
            sum--;
        }
        if(score==0){
            System.out.println("您没有猜对一次");
        }else if(score<5){
            System.out.println("您还需继续努力"+score+"个");
        }else if(score<8){
            System.out.println("还不错哦，猜对了"+score+"个");
        }else{
            System.out.println("您真厉害,猜对了"+score+"个");
        }
    }
}