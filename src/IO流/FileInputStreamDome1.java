package IO流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamDome1 {
    public static void main(String[] args) throws IOException {
        //创建一个文件字节输入流的管道与源文件接通
        InputStream is=new FileInputStream("src/IO流/readme");
        //读取一个字节返回
        int b1=is.read();
        System.out.println((char)b1);
        //读取完毕返回-1
        //使用循环改进
        //定义一个变量,用来装字节
        int b;
        while ((b =is.read())!=-1){
            System.out.print("\t"+b);
        }
    }
}
