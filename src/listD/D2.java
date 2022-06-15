package listD;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class D2 {
    public static void main(String[] args) {
        List<String>lists=new ArrayList<>();
        lists.add("java1");
        lists.add("java2");
        lists.add("java3");
        //for循环
        System.out.println("--------------------------");
        for (int i = 0; i <lists.size() ; i++) {
            System.out.println(lists.get(i));
        }
        //迭代器
        System.out.println("--------------------------");
        Iterator<String>it=lists.iterator();
        while (it.hasNext()){
            String ele= it.next();
            System.out.println(ele);
        }
        //forEach
        System.out.println("--------------------------");
        for (String ele : lists){
            System.out.println(ele);
        }
        //Lambda
        System.out.println("--------------------------");
        lists.forEach(s->{
            System.out.println(s);
        });



    }
}
