package IO流.字符流.打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintDome2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("锦瑟无端五十弦");
        System.out.println("一弦一柱思华年");
        //重定向打印流
        PrintStream ps=new PrintStream("src/IO流/字符流/打印流/log.txt");
        System.setOut(ps);
        System.out.println("庄生晓梦迷蝴蝶");
        System.out.println("望帝春心托杜鹃");
    }
}
