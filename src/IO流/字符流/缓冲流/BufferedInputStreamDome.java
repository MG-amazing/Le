package IO流.字符流.缓冲流;

import java.io.*;

/**
 *
 */
public class BufferedInputStreamDome {
    public static void main(String[] args) {
        //学会使用字节流实现文件的拷贝

        try (
                //定义一个字节输入流,实现与源文件的接通
                InputStream is = new FileInputStream("C:\\Users\\Administrator\\Desktop\\最终合成.mp4");
                //把原始的字节输入流包装成高级的缓冲字节输入流
                InputStream bis = new BufferedInputStream(is);
                //把字节输出流管道包装成高级的字节输出流管道
                OutputStream os=new FileOutputStream("E:\\新建文件夹\\1.mp4");
                OutputStream bos=new BufferedOutputStream(os);
        ) {
            int b1 = is.read();
            //定义一个字节数组来转移数据
            byte[] buffer = new byte[1024];
            int len;//记录每次读取的字节数
            while ((len = bis.read(buffer)) != -1) {
                System.out.print((char) b1);
                bos.write(buffer, 0, len);
            }
            System.out.println("复制完成");
            //JDK7之后在try()中的资源会自动释放
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

