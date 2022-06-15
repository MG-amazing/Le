package 集合;

import java.util.LinkedList;

public class List_Dome2 {
    public static LinkedList list = new LinkedList();
    // 查询慢，增删快，线程不安全，执行效率高
    //LinkList底层是基于双链表去实现的
    //LinkedList底层是基于链表实现。
    /*
    链表没有长度限制，内存地址不需要固定长度，
    也不需要是连续的地址来进行存储，只需要通过引用来关联前后元素即可完成整个链表的连续。
    所以链表的优点就是添加删除元素比较快，只需要移动指针，并且不需要判断扩容。
    缺点就是因为没有索引，所以在查询和遍历元素时候比较慢
    */
    public static void main(String[] args) {
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        list.remove("c");
        System.out.println("--------");
        System.out.println(list);
        System.out.println("--------");
        list.addFirst("A");
        System.out.println(list);
        System.out.println("--------");
        list.addLast("D");
        System.out.println(list);
        System.out.println("--------");
        System.out.println(list.get(2));
        //删除低于80分
        LinkedList<Integer> scores = new LinkedList<>();
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
                i--;
            }
        }
        System.out.println(scores);
    }
}
