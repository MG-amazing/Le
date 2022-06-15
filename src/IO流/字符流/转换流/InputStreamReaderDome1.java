package IO流.字符流.转换流;

import java.io.*;

public class InputStreamReaderDome1 {
    public static void main(String[] args) throws Exception {
        //通过对象代表流管道
        //把字节转换为GBK编码
        //创建管道与源文件接通
        InputStream is = new FileInputStream("src/IO流/字符流/GBK.txt");
        //把原始字节流转换成字节输入转换流
        Reader rs = new InputStreamReader(is,"GBK");
        BufferedReader brs = new BufferedReader(rs);
        String len;
        while ((len=brs.readLine())!=null){
            System.out.println(len);
        }

    }

}
