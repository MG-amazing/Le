package char_buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Char_bufferDome1 {
    public static void main(String[] args) {
        try (
                //创建一个字符输入流与源文件接通
                Reader fr = new FileReader("src/char_buffered/data.txt");
                //把低级的字符输入流包装成高级的字节输出缓冲流
                BufferedReader bfr = new BufferedReader(fr);
        ) {
//            char[] buffered = new char[1024];
//            int len;
//            while ((len = bfr.read(buffered)) != -1) {
//                String rs = new String(buffered, 0, len);
//                System.out.println(rs);
//            }
            String len;
            while ((len=bfr.readLine())!=null){
                System.out.println(len);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
