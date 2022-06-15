package IO流;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutPutStreamDome1 {
    public static void main(String[] args) throws Exception {
        //创建一个文件输出字节流与目标管道接通
        //覆盖管道
        //String(o1,bollen)
        OutputStream ne=new FileOutputStream("src/IO流/out.txt",true);
        ne.write('a');
        ne.write(98);
        //换行符
        ne.write("\r\n".getBytes());
        ne.write('何');//写一个字节会出现乱码
        //写数据必须刷新数据
        byte[]buffer={'a',97,98,99};
        ne.write(buffer,0,3);
        ne.write("\r\n".getBytes());
        ne.write(buffer);
        ne.write("\r\n".getBytes());
        byte[]buffer2="我是一个大帅哥".getBytes();
        ne.write(buffer2);
        ne.flush();
        //刷新后流可以继续写
        //写完了之后必须把管道关闭




        ne.close();
        //关闭流后,管道无法继续使用
        //一定会刷新,关闭流会节省内存
        //拿字节输入流可以把文件进行拷贝
        //把一个字节输入流和字节输出流相接通
    }
}
