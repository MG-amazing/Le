package listD.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TD2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("黑马");
        list.add("JAVA");
        list.add("JAVA");
        list.add("赵敏");
        list.add("赵敏");
        list.add("素素");
        System.out.println(list);
        //迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String ele = it.next();
            if ("JAVA".equals(ele)) {
                it.remove();//删除当前所在元素，并且不会后移，使用迭代器删除当前位置元素才会不后移，就不会跳过元素了。
            }
        }
        System.out.println(list);
        for (String s : list) {
            if ("JAVA".equals(s)) {
                list.remove("JAVA");//无法解决报错
            }
        }
        list.forEach(s -> {
            if ("JAVA".equals(s)) {
                list.remove("JAVA");//仍然报错
            }
        });
        //并发出现的问题
        //不出bug 但会漏删倒着删就不出bug了
        for (int i = list.size()-1; i >=0; i--) {
            String ele=list.get(i);
            if ("JAVA".equals(ele)){
                list.remove("JAVA");
            }
        }
    }
}