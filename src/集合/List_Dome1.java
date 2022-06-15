package 集合;

import java.util.ArrayList;

public class List_Dome1 {
    public static ArrayList list=new ArrayList();
    //ArrayList属于List集合的父类List集合属于Collection集合的父类
    //学会使用ArrayList,及常见的几个方法
    //ArrayList支持泛型,底层是由数组构成的,数组可以扩容
    //ArrayList在内存中初次调用时会生成一个长度为10的数组.
    //当元素数大于ArrayList底层数组长度时底层数组会产生一个新的数组(该数组的长度是ArrayList数组长度的1.5倍)新数组会拷贝旧数组中的元素
    //ArrayList集合的特性 **->有序,有索引
    //当数据量很大时可以用trimToSize()方法给底层数组调整长度
    //查询较快,增删慢
    public static void main(String[] args) {
        list.add("java");
        list.add("mysql");
        list.add("jdbc");
        list.add("html");
        System.out.println(list);
        list.remove("html");
        System.out.println("----------------");
        System.out.println(list.get(2));
        System.out.println("-----------");
        System.out.println(list);
//        System.out.println("-----clear方法被调用---");
//        list.clear();
//        System.out.println(list);
//        System.out.println("------------");
        System.out.println(list.size());
        //ArrayList集合的遍历
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(100);
        System.out.println(scores);
        for(int i= 0; i < scores.size(); i++){
            int score = scores.get(i);
            if(score < 80){
                //删除低于80的分数
                scores.remove(i);
            }
        }
        System.out.println(scores);


    }
}
