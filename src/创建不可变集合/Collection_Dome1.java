package 创建不可变集合;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection_Dome1 {
    public static void main(String[] args) {
        List<Double> lists = List.of(569.5, 700.5, 570.5);
        //lists.add(600.89);常量集合不可改变
        //lists.set(2,689.5);不可设置值，报错
        System.out.println(lists);
        double score = lists.get(1);

        System.out.println(lists);
        Set<String>names=Set.of("迪丽热巴","迪丽热九","马尔扎哈");
        //names.add("三少");
        //无法添加与重复,报错
        Map<String, Integer>maps=Map.of("huawei",2,"java",1);

        System.out.println(maps);
    }
}
