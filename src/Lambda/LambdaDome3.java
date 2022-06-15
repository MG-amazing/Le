package Lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;

import java.util.Arrays;


public class LambdaDome3 {
    public static void main(String[] args) {
        Integer[] ages1 = {34, 12, 42, 23};
        /**
         参数一：被排序的数组，必须是引用类型的元素
         参数二：匿名内部类对象，代表了一个比较器对象
         */
//        Arrays.sort(ages1, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
//            }
//        });

//        Arrays.sort(ages1,(Integer o1, Integer o2) ->{
//                return o2-o1;//降序排序
//        });
        Arrays.sort(ages1,(Integer o1, Integer o2) -> o2-o1);

        System.out.println(Arrays.toString(ages1));
        System.out.println("-----------------");
        JFrame frame=new JFrame("登录界面");
        JButton btn=new JButton("很大的按钮");
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("你点到我了");
//            }
//        });
        btn.addActionListener((ActionEvent e)-> {
                System.out.println("你点到我了");
        });
        frame.add(btn);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
//省略参数类型