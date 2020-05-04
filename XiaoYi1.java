import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int ability = 0;
        while (scan.hasNext()) {
            num = scan.nextInt(); //怪物的数量
            ability = scan.nextInt();//小易初始化技能值
            for (int i = 0; i < num; ++i) {
                int monster = scan.nextInt();
                if (monster <= ability) {//怪兽防御小于等于技能，技能加怪兽的防御值
                      bility += monster;
                 } else {//怪兽防御大于技能，技能加两者的最大公约数
                      ability += GCD(ability, monster);
                 }
          }
     System.out.println(ability);
   }
   scan.close();
}
