package Stream流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//初步体验Stream流的方便与快捷
public class Stream_dome1 {
    public static void main(String[] args) {
        List<String>names=new ArrayList<>();
        Collections.addAll(names,"张三丰","张无忌","周驰若","赵敏");
        List<String>zhangsan = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("张"));
            zhangsan.add(name);
        }
        System.out.println(zhangsan);
        //找名称长度是3的姓名
        //Stream流
        //一步一步过滤
        //
        names.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(s -> System.out.println(s));
    }
}
