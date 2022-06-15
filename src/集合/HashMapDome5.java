package 集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMapDome5 {
    public static void main(String[] args) {
        //投票选出学生们要去那个景点游玩
        //把80个学生的数据拿出来
        String []selects={"A","B","C","D"};
        StringBuilder sb=new StringBuilder();
        Random random=new Random();
        for (int i = 0; i < 80; i++) {
            sb.append(selects[random.nextInt(selects.length)]);
        }
        System.out.println(sb);
        //定义一个Map集合记录最终的统计结果 A=30 B=20 C=20 D=10 键是景点,值是出现的数量
        Map<Character, Integer> infos = new HashMap<>();
        for (int i = 0; i <sb.length() ; i++) {
            //提取当前字符
            char ch=sb.charAt(i);
            //看在Map集合中是否存在这个键
            if (infos.containsKey(ch)){
                infos.put(ch,infos.get(ch)+1);
            }else {
                infos.put(ch,1);
            }
        }
        System.out.println(infos);
    }
}
