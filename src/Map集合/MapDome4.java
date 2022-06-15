package Map集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//值取键
public class MapDome4 {
    public static void main(String[] args) {
        Map<String, Integer> maps=new HashMap<>();
        //添加元素：无序，不重复，无索引
        maps.put("娃娃",30);
        maps.put("iphoneX",100);
        maps.put("huawei",1000);
        maps.put("生活用品",10);
        maps.put("手表",10);
        System.out.println(maps);
        //调用Map的方法把map集合转换为set集合形式
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        //ctrl+alt+v
        //创建接口的实体对象

        //使用forEach遍历集合
        for (Map.Entry<String, Integer>entry:entries){
            String key= entry.getKey();
            Integer value=entry.getValue();
            System.out.println(key+"==>"+value);
        }
    }
}
