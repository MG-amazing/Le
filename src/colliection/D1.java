package colliection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class D1 {
    public static void main(String[] args) {
        Collection <String> list=new ArrayList<>();
        list.add("赵敏");
        list.add("小昭");
        list.add("殷素素");
        list.add("周驰若");
        System.out.println(list);
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("---------");
        double[]scores={100,99.5,59.5};
        for (double score : scores) {
            System.out.println(score);
        }
        System.out.println(Arrays.toString(scores));
    }
}
