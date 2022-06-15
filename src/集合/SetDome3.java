package 集合;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDome3 {
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
