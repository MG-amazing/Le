package IO流.字符流.打印流;

//Properties代表是是一个属性文件,可以把自己对象中的键值对信息储存到一个属性文件夹中区
//属性文件后缀是Properties的文件内,里面的内容都是key=value,后缀做系统配置信息的

import java.io.FileWriter;
import java.util.Properties;

public class PropertiesDome1 {
    public static void main(String[] args) throws Exception {
       //需求使用Properties把键值对信息存储到属性文件中去
        Properties properties=new Properties();
        properties.setProperty("admin","123456");
        properties.setProperty("dilei","0012345");
        properties.setProperty("mima","00551");
        //底层还是put
        properties.store(new FileWriter("src/IO流/字符流/打印流/user.properties"),"this is user!! give me 100!!");
    }
}
