package IO流.字符流.序列化;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDome2 {
    //对象反序列化
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建字节输入流管道,与低级的字节输入流管道接通
        ObjectInputStream os=new ObjectInputStream(new FileInputStream("src/IO流/字符流/data.txt"));
        //调用字节序列化的方法
        Student s= (Student) os.readObject();
        System.out.println(s);
    }
}
