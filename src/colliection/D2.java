package colliection;

import java.util.ArrayList;
import java.util.Collection;

public class D2 {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("赵敏");
        list.add("小昭");
        list.add("殷素素");
        list.add("周驰若");
        System.out.println(list);
        list.forEach( s-> System.out.println(s));
    }
}
