package IO流.字符流.序列化;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutPutStreamDome1 {
    public static void main(String[] args) throws IOException {
        Student s=new Student("何润东","cho1","123456",18);

        //创建低级流
        ObjectOutputStream one=new ObjectOutputStream(new FileOutputStream("src/IO流/字符流/data.txt"));
        //直接调用序列化方法
        one.writeObject(s);
        //序列化完成
        one.close();
    }
}
