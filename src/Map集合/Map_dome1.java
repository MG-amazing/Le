package Map集合;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_dome1 {
    public static void main(String[] args) {
        //Map<String ,Integer> maps=new HashMap<>();
        Map<String ,Integer> maps=new LinkedHashMap<>();
        maps.put("鸿星尔克",3);
        maps.put("枸杞",100);
        maps.put("Java",1);
        maps.put("Java",100);
        maps.put(null,null);
        System.out.println(maps);
    }
}
