package Map集合;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Dome2 {
    public static void main(String[] args) {
        Map <String, Integer>maps=new HashMap<>();
        maps.put("iphoneX",10);
        maps.put("娃娃",31);
        maps.put("iphoneX",100);
        maps.put("huawei",1000);
        maps.put("生活用品",10);
        maps.put("手表",10);
        //{huawei=1000, 手表=10, 生活用品=10, iphoneX=100, 娃娃=31}
        System.out.println(maps);
        //清空集合
        //maps.clear();
        //判断集合是否返回为空，为空返回true,反之！
        System.out.println(maps.isEmpty());
        //根据键获取对应值:public V get(Object key)
        System.out.println(maps.get("huawei"));
        Integer key=maps.get("生活用品");
        System.out.println(key);
        //根据键删除整个元素。（删除键会返回键的值）
        System.out.println(maps.remove("iphoneX"));
        System.out.println(maps);
        //删除判断是否包含某个键
        System.out.println(maps.containsKey("娃娃"));
        System.out.println(maps.containsValue("iphoneX"));
        //判断是否包含某个值
        System.out.println(maps.containsKey(100));
        System.out.println(maps.containsKey(10));
        System.out.println(maps.containsKey(22));
        //获取全部键的集合 public Set<K> keySet()
        Set<String> keys=maps.keySet();
        System.out.println(keys);
        //获取所有的值的集合Collection<V> values()
        Collection<Integer>value=maps.values();
        System.out.println(value);
        //集合的大小
        System.out.println(maps.size());
        //合并其他Map集合
        Map<String, Integer>map1 = new HashMap<>();
        map1.put("java1",1);
        map1.put("java2",100);
        Map<String, Integer>map2 = new HashMap<>();
        map2.put("java2",1);
        map2.put("java3",100);
        map1.putAll(map2);
        System.out.println(map1);
        System.out.println(map2);
    }
}
