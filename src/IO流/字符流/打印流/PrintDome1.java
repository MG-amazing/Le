package IO流.字符流.打印流;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintDome1 {
    //特点高效方便
    public static void main(String[] args) throws Exception {
        //创建打印流管道
        //高效的流
        //底层是字节
        PrintStream ps=new PrintStream(new FileOutputStream("src/IO流/字符流/data2.txt",true));
        ps.println("97");
        ps.println(23.3);
        ps.println("我是打印流");
        ps.close();
        //打字符
        //只能打字符
        PrintWriter ps1=new PrintWriter(new FileOutputStream("src/IO流/字符流/data2.txt",true));
        ps1.println("97");
        ps1.println(23.3);
        ps1.println("我是打印流");
        ps1.close();
    }
}
