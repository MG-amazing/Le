package IO流.字符流.打印流;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDome2 {
    public static void main(String[] args) throws IOException {
        //读取文件中的键值对信息
        Properties properties =new Properties();
        System.out.println(properties);
        //加载属性文件中的键值对数据到属性对象properties中去
        properties.load(new FileReader("src/IO流/字符流/打印流/user.properties"));
        System.out.println(properties);

        //可以根据键去找值
        String rs= properties.getProperty("dilei");

    }
}
