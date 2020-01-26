package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @className DouDiZhu
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/25 13:14
 * @Version 1.0
 **/
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        //定义一个存储54张牌的ArrayList集合
        ArrayList<String> poker=new ArrayList<>();
        //定义两个数组，一个数组存储牌的花色，一个数组存储牌的序号
        String[] colors={"♠","♥","♣","♦"};
        String[] numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //先把大王和小王存储到poker集合中
        poker.add("大王");
        poker.add("小王");
        for(String number:numbers){
            for(String color:colors){
                poker.add(color+number);
            }
        }
        //2.洗牌
        //static void shuffle(List<?> list)
        Collections.shuffle(poker);
        //3.发牌
        ArrayList<String> player1=new ArrayList<>();
        ArrayList<String> player2=new ArrayList<>();
        ArrayList<String> player3=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String p=poker.get(i);
            if(i>=51){
                dipai.add(p);
            }else if(i%3==0){
                player1.add(p);
            }else if(i%3==1){
                player2.add(p);
            }else{
                player3.add(p);
            }
        }
        //4.看牌
        System.out.println("1"+player1);
        System.out.println("2"+player2);
        System.out.println("3"+player3);
        System.out.println("dipai"+dipai);

    }
}
