package IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDome2 {
    public static void main(String[] args) throws Exception {
        //使用字节输入流数组管道与源文件接通
        InputStream is = new FileInputStream("src/IO流/readme");
        //定义一个字节数组存储字节
//        byte[] ne = new byte[20];//一次读3个字节
//
//
//        int len = is.read(ne);
//        System.out.println("读取了个字节"+len);
//        String rs=new String(ne);
//        System.out.println(rs);
//
//        int len2 = is.read(ne);
//        System.out.println("读取了个字节"+len);
//        String rs2=new String(ne);
//        System.out.println(rs2);

//        byte[]buffer=new byte[1024];
//        int len1;
//        while ((len1= is.read(buffer))!=-1){
//            System.out.print(new String(buffer,0,len1));
//        }
        //一次读取完文件所有字节
        //能避免出现乱码,但会出现内存溢出
        File f=new File("src/IO流/readme");
        InputStream b=new FileInputStream(f);
//        byte[]size=new byte[(int) f.length()];
//        int ke=b.read(size);
//        System.out.println("读取了:"+ke+"字节");
//        System.out.println(new String(size));

        byte[] buff=b.readAllBytes();
        System.out.println(new String(buff));

    }
}
