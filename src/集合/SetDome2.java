package 集合;

import java.util.Set;
import java.util.TreeSet;

public class SetDome2 {
    public static void main(String[] args) {
        //特点无序,无索引,不重复
        Set<Integer> set1 = new TreeSet<>();
        set1.add(2);
        set1.add(3);
        set1.add(88);
        set1.add(56);
        set1.add(49);
        set1.add(59);
        System.out.println(set1);
        Set<String> set2 = new TreeSet<>();
        set2.add("123");
        set2.add("456");
        set2.add("JAVA");
        set2.add("MYSQL");
        set2.add("HTML");
        set2.add("JAVA");
        set2.add("VUE");
        System.out.println(set2);

        StringBuffer a = new StringBuffer("rootBoot");
        System.out.println(a.delete(1, 5));
        System.out.println(Math.round(3.7));

    }
}
