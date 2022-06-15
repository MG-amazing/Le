package 字节缓冲的性能分析;

import java.io.*;

public class ByteBufferTimeDome1 {
    private static final String SRC_FILE = "C:\\Users\\Administrator\\Desktop\\最终合成.mp4";
    private static final String DEST_FILE = "E:\\新建文件夹\\";

    public static void main(String[] args) {
        //copy1();//慢的一批直接淘汰
        copy2();
        copy3();
        copy4();
    }

    private static void copy4() {
        long StartTime = System.currentTimeMillis();
        try (
                //创建低级字符输入流与源文件接通
                InputStream is = new FileInputStream(SRC_FILE);
                //创建高级字节缓冲输入流管道与is对象接通
                InputStream bis=new BufferedInputStream(is);
                //创建低级的字节输出流与目标文件接通
                OutputStream os = new FileOutputStream(DEST_FILE + "video4.mp4");
                //创建高级字节输出缓冲流与输出目标对象接通
                OutputStream bos=new BufferedOutputStream(os);
        ) {
            // 定义一个变量记录读取的字节,一个字节一个字节的去复制
            byte[]buffer=new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                os.write(buffer,0,len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        long EndTime=System.currentTimeMillis();
        System.out.println("高级字节数组流耗时"+(EndTime-StartTime)/1000.0+"s");
    }

    private static void copy3() {
        long StartTime = System.currentTimeMillis();
        try (
                //创建低级字符输入流与源文件接通
                InputStream is = new FileInputStream(SRC_FILE);
                //创建高级字节缓冲输入流管道与is对象接通
                InputStream bis=new BufferedInputStream(is);
                //创建低级的字节输出流与目标文件接通
                OutputStream os = new FileOutputStream(DEST_FILE + "video3.mp4");
                //创建高级字节输出缓冲流与输出目标对象接通
                OutputStream bos=new BufferedOutputStream(os);
        ) {
            // 定义一个变量记录读取的字节,一个字节一个字节的去复制

            int len;
            while ((len = bis.read()) != -1) {
                bos.write(len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        long EndTime=System.currentTimeMillis();
        System.out.println("高级字节缓冲流耗时"+(EndTime-StartTime)/1000.0+"s");

    }

    private static void copy2()  {
        long StartTime = System.currentTimeMillis();
        try (
                //创建低级字符输入流与源文件接通
                InputStream is = new FileInputStream(SRC_FILE);
                //创建低级的字节输出流与目标文件接通
                OutputStream os = new FileOutputStream(DEST_FILE + "video2.mp4");
        ) {
            // 定义一个变量记录读取的字节,一个字节一个字节的去复制
            byte[]buffer=new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer,0,len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        long EndTime=System.currentTimeMillis();
        System.out.println("低级数组流耗时"+(EndTime-StartTime)/1000.0+"s");

    }


    private static void copy1() {
        long StartTime = System.currentTimeMillis();
        try (
                //创建低级字符输入流与源文件接通
                InputStream is = new FileInputStream(SRC_FILE);
                //创建低级的字节输出流与目标文件接通
                OutputStream os = new FileOutputStream(DEST_FILE + "video1.mp4");
        ) {
            // 定义一个变量记录读取的字节,一个字节一个字节的去复制
            int b;
            while ((b = is.read()) != -1) {
                os.write(b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        long EndTime=System.currentTimeMillis();
        System.out.println("低级流耗时"+(EndTime-StartTime)/1000.0+"s");

    }

}
