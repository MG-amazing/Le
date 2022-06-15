package Hashset.Treeset;

import Hashset.D2.Student;

import java.util.Set;
import java.util.TreeSet;

/**
 * 观察treeset对于有值的数据怎么排序
 * 学会自定义类型的对象指定规则的排序
 */
public class setdome {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        set1.add(2);
        set1.add(3);
        set1.add(88);
        set1.add(56);
        set1.add(49);
        set1.add(59);
        System.out.println(set1);
        Set<String> set2 = new TreeSet<>();
        set2.add("你妹的");
        set2.add("啊啊啊");
        set2.add("JAVA");
        set2.add("MYSQL");
        set2.add("HTML");
        set2.add("JAVA");
        set2.add("VUE");
        System.out.println(set2);
        Student st1 = new Student();    //01234567
        StringBuffer a =new StringBuffer("rootBoot");
        System.out.println(a.delete(1,5));
        System.out.println(Math.round(3.7));


    }
}
