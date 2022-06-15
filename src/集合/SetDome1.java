package 集合;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDome1 {
    //学会使用Set集合
    //TreeSet 和TreeMap 都是Set集合的父类
    //这里学的是TreeMap
    //HashSet集合的底层是HashMap
    //特点无序存储，无索引
    //JDK8之前 数组+链表
    //JDK8之后 数组+链表+红黑树
    //哈希值是JDK根据对象的地址，按照某种规则算出来的int 类型的数值
    // hashcode拿到哈希值
    //同一个对象的hashcode是相同的
    public static void main(String[] args) {
        //有序，无索引，不重复
        Set<String> set2 = new LinkedHashSet();
        set2.add("MYSQL");
        set2.add("HTML");
        set2.add("JAVA");
        set2.add("JAVA");
        set2.add("SpringBoot");
        System.out.println(set2);
    }
}
