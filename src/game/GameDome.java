package game;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GameDome {
    /*
    1.定义一个静态的集合存储54张牌对象
     */
    public static List<Card> allCards=new ArrayList<>();
    /*
    2. 做牌，定义静态代码块出事化数据
     */
    static {
        //点数确定，个数确定，类型也确定，使用数组
        String []sizes={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //定义花色
        String []colors={"\uD83E\uDDE1","\uD83D\uDDA4","♣","◆"};
        //组合花色和点数
        int index=0;
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                //封装成一个牌对象
                Card c=new Card(size,color,index);
                //存入到集合容器中去
                allCards.add(c);
            }
        }
        //存入大小王??
        Card c1=new Card("","?",++index);
        Card c2=new Card("","\uD83C\uDF1C",++index);
        Collections.addAll(allCards,c1,c2);
        System.out.println("新牌"+allCards);

    }

    public static void main(String[] args) {
        //洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后"+allCards);
        //发牌
        List <Card>player1=new ArrayList<>();
        List <Card>player2=new ArrayList<>();
        List <Card>player3=new ArrayList<>();
        //开始发牌，从集合中发出51张牌给三个玩家,剩余三张牌为底牌
        for (int i = 0; i < allCards.size()-3; i++) {
            //先拿到当前牌对象
            Card c=allCards.get(i);
            if (i%3==0){
                //给player1
                player1.add(c);
            }else if (i%3==1){
                //给player2
                player2.add(c);
            } else if (i%3==2) {
                player3.add(c);
            }
        }
        //拿到最后三张牌
        List<Card>lastThreeCards=allCards.subList(allCards.size()-3,allCards.size());
        //给玩家的牌排序(可以从大到小)
        sortCards(player1);
        sortCards(player2);
        sortCards(player3);
        //输出玩家的牌
        System.out.println("玩家1"+player1);
        System.out.println("玩家2"+player2);
        System.out.println("玩家3"+player3);
        System.out.println("底牌"+lastThreeCards);
    }

    private static void sortCards(List<Card> cards) {

        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getIndex()-o2.getIndex();
            }
        });
    }
}
