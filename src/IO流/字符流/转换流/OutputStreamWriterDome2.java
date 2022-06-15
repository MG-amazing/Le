package IO流.字符流.转换流;

import java.io.*;

public class OutputStreamWriterDome2 {
    public static void main(String[] args) throws Exception {
        //控制写出去的文件编码
        //定义字节输出流管道与文件管道接通
        OutputStream os=new FileOutputStream("src/IO流/字符流/data2.txt");
        Writer wr=new OutputStreamWriter(os,"GBK");
        //把低级的字符输出流包装成高级的字符输出流
        BufferedWriter obw=new BufferedWriter(wr);
        obw.write("我爱你中国");
        obw.write("我爱你中国");
        wr.close();


    }
}
