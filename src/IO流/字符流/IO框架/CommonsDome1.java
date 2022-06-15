package IO流.字符流.IO框架;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class CommonsDome1 {
    public static void main(String[] args) throws Exception {
        // 复制文件
        IOUtils.copy(new FileInputStream("当前路径"), new FileOutputStream("目标路径"));
        //完成文件复制到文件夹
        FileUtils.copyFileToDirectory(new File("当前路径"),new File("新路径"));
        //把文件夹复制到文件夹
        FileUtils.copyDirectoryToDirectory(new File("当前路径"),new File("目标路径"));
        //删除功能(删除文件夹)
        FileUtils.deleteDirectory(new File("目标问价夹"));
        //NIO2.0   JDK自带的方法   复制文件夹
        Files.copy(Path.of("路径1"),Path.of("路径2"));
        //删除文件夹(只能删除空文件夹)
        Files.deleteIfExists(Path.of(""));

    }
}
