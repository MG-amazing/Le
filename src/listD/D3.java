package listD;

import java.util.LinkedList;

public class D3 {
    public static void main(String[] args) {
        //ArrayList底层基于数组实现的，但需要对数组进行移位操作
        //首先分配长度为10的数组，

        //LinkedList基于双链表，首尾操作非常快
        //压栈push是个方法原理还是addFirst
        LinkedList stack=new LinkedList<>();
        stack.push("第一颗子弹");
        stack.addFirst("第二颗子弹");
        stack.addFirst("第三颗子弹");
        stack.addFirst("第四颗子弹");
        System.out.println(stack);
        //出栈pop是个方法原理与removeFirst相同
        System.out.println(stack.pop());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack);
        //队列
        LinkedList<String>queue=new LinkedList<>();
        queue.addLast("1号");
        queue.addLast("2号");
        queue.addLast("3号");
        queue.addLast("4号");
        System.out.println(queue);
        //出
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);
    }
}
