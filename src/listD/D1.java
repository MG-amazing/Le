package listD;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class D1 {
    public static void main(String[] args) {

        //ArrayList可以通过索引插入数据
        //查询内部数据还需要遍历集合才能获取想要的元素，整体效率较慢
        //增删元素较慢，查询（根据目标索引）快
        //LinkedList相当于数据结构中的双链表,查询数据时较慢，增删首尾元素较快
        List <String> list=new ArrayList<>();
        //相当于数据结构中的栈
        list.add("JAVA");
        list.add("JAVA");
        list.add("MYSQL");
        list.add("MYSQL");

        System.out.println(list);


        //某个位置插入元素
        list.add(2,"HTML");
        System.out.println(list);
        //删除元素
        System.out.println(list.remove(2));
        System.out.println(list);

        //根据索引获取元素
        System.out.println(list.get(2));

        //修改索引位置对应的元素
        System.out.println(list.set(1,"何润东"));
        System.out.println(list);
    }
}
