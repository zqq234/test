import java.util.*;

/**
 * @className DouDiZhu
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/25 14:39
 * @Version 1.0
 **/
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        //创建一个Map集合，存储牌的索引和组装好的牌
        HashMap<Integer,String> poker=new HashMap<>();
        ArrayList<Integer> pokerIndex=new ArrayList<>();
        String[] colors={"♠","♥","♣","♦"};
        String[] numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        int index=0;
        poker.put(index,"大王");
        pokerIndex.add(index++);
        poker.put(index,"小王");
        pokerIndex.add(index++);
        for(String number:numbers){
            for(String color:colors){
                poker.put(index,color+number);
                pokerIndex.add(index++);
            }
        }
        //2.洗牌
        Collections.shuffle(pokerIndex);
        //3.发牌
        ArrayList<Integer> player1=new ArrayList<>();
        ArrayList<Integer> player2=new ArrayList<>();
        ArrayList<Integer> player3=new ArrayList<>();
        ArrayList<Integer> dipai=new ArrayList<>();
        for(int i=0;i<pokerIndex.size();i++){
            Integer in=pokerIndex.get(i);
            if(i>=51){
                dipai.add(in);
            }else if(i%3==0){
                player1.add(in);
            }else if(i%3==1){
                player2.add(in);
            }else {
                player3.add(in);
            }

        }
        //4.排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(dipai);

        lookpoker("玩家一",poker,player1);
    }
    //5.看牌
    public static void lookpoker(String name,HashMap<Integer,String> poker,ArrayList<Integer> list){
        System.out.print(name+":");
        for(Integer key:list){
            String value=poker.get(key);
            System.out.print(value+" ");
        }
        System.out.println();
    }
}
