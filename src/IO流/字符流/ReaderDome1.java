package IO流.字符流;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDome1 {
    public static void main(String[] args) throws IOException {
        //每次读取一个字符,
        //创建一个字符输入流对象与源文件接通
        Reader fr=new FileReader("src/IO流.字符流/data1.txt");
        //读取一个字符返回,若没有字符返回-1
        int code=fr.read();
        System.out.println((char)code);
        //使用循环每次读取一个字符数组的数据
        char[]buffer=new char[1024];
        int len;
        while ((len= fr.read(buffer))!=-1){
            String rs=new String(buffer,0,len);
            System.out.print(rs);
        }


    }
}
