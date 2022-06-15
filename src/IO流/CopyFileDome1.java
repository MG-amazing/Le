package IO流;

import java.io.*;

public class CopyFileDome1 {
    public static void main(String[] args) throws IOException {
        //学会使用字节流实现文件的拷贝
        //定义一个字节输入流,实现与源文件的接通
        try {
            InputStream is=new FileInputStream("C:\\Users\\Administrator\\Desktop\\最终合成.mp4");
            //创建一个字节输出流管道与目标路径接通
            OutputStream os=new FileOutputStream("E:\\新建文件夹\\1.mp4");
            int b1= is.read();
            //定义一个字节数组来转移数据
            byte[]buffer=new byte[1024];
            int len;//记录每次读取的字节数
            while ((len= is.read(buffer))!=-1){
                System.out.print((char)b1);
                os.write(buffer,0,len);
            }
            System.out.println("复制完成");
            //关闭流
            os.close();
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
