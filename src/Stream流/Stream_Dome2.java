package Stream流;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stream_Dome2 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("张无忌");
        list.add("周驰若");
        list.add("赵薇");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");
        list.stream().filter((new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张");
            }
        })).forEach(s -> System.out.println(s));
        long size=list.stream().filter(s -> s.length()==3).count();
        System.out.println(size);
        list.stream().filter(s->s.startsWith("张")).limit(2).forEach(s -> System.out.println(s));
        System.out.println("--------------------------");
        list.stream().filter(s->s.startsWith("张")).skip(2).forEach(s -> System.out.println(s));
        //Map 加工方法
        //给集合元素的前面都加上特定数据
        list.stream().map(s -> "黑马的:"+s).forEach(s -> System.out.println(s));
        //把所有的名称都加工成学生对象
        list.stream().map(s -> new Student(s)).forEach(s-> System.out.println(s));
        System.out.println("------------------------------");
        list.stream().map(Student::new).forEach(System.out::println);
        //合并流
        //一般都是同一类型的流
        //不同类型流合并需要用Object泛型去接

        System.out.println("------------------------");
        Stream<String>s1=list.stream().filter(s -> s.startsWith("张"));
        Stream<String>s2=Stream.of("Java1","Java2");
        Stream<String>s3=Stream.concat(s1, s2);
        s3.forEach(System.out::println);

        //终结方法调完就不会再返回数据了，调完就不可以再使用了。
        //终结方法是最终的方法

    }
}
