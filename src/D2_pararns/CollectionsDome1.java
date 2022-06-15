package D2_pararns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections 是一个工具类
 * 静态方法不需要构建对象，直接调类名就行了
 * 集合中添加元素，集合送进来泛型必须是
 */

public class CollectionsDome1 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        //添加元素，工具
        Collections.addAll(names,"初一","初二","初三","初四");
        System.out.println(names);
        //打乱顺序,真的是随机的
        Collections.shuffle(names);
        System.out.println(names);
        //将List中元素进行排序
        //Shift+F6批量改数据
        List <Integer> list=new ArrayList<>();
        Collections.addAll(list,10,12,19,15,18);
        //将其元素升序排序,按照默认的排序方法
        Collections.sort(list);
        System.out.println(list);
    }
}
