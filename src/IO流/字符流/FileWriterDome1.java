package IO流.字符流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDome1 {
    public static void main(String[] args) throws IOException {
        //创建一个子为父输出流管道与目标文件接通
        Writer fw=new FileWriter("src/IO流/字符流/data.txt",true);

        fw.write(98);
        fw.write("\r");
        fw.write('a');
        fw.write("\r");
        fw.write('徐');
        fw.write("\r");
        fw.write("abc我的世界");
        fw.write("\r");

        char[]chars="abc我是中国人".toCharArray();
        fw.write(chars);
        fw.write("\r");

        fw.write("adsdas",0,5);
        fw.write("\r");

        fw.write(chars,3,5);
        fw.write("\r");

        fw.flush();//刷新后流可以继续使用
        fw.write("\r");

        fw.close();//关闭包括刷新,关闭后流不可使用

    }
}
