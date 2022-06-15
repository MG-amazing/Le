package IO流.字符流.转换流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharSetTestDome1 {
    public static void main(String[] args) {
        //演示不同编码和相同编码读取情况{
        try (
                //创建一个字符输入流与源文件接通
                //遇到编码UTF-8的时候3个字节为一个字符
                //字符流直接读取文件
                //怎么解决?
                //把原始代码转换为字节输入转换流,
                Reader fr = new FileReader("C:\\Users\\Administrator\\Desktop\\GBK.txt");
                //把低级的字符输入流包装成高级的字节输出缓冲流
                BufferedReader bfr = new BufferedReader(fr);
        ) {

            String len;
            while ((len = bfr.readLine()) != null) {
                System.out.println(len);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

