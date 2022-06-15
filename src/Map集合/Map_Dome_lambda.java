package Map集合;

import java.util.HashMap;
import java.util.Map;

public class Map_Dome_lambda {
    public static void main(String[] args) {
        Map<String, Integer> maps=new HashMap<>();
        maps.put("娃娃",30);
        maps.put("iphoneX",100);
        maps.put("huawei",1000);
        maps.put("生活用品",10);
        maps.put("手表",10);
        System.out.println(maps);
//        maps.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String key, Integer value) {
//                System.out.println(key+"==>"+value);
//            }
//        });
        maps.forEach((k,v)->{
                System.out.println(k+"==>"+v);
            });

    }
}
