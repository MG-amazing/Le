package char_buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Char_BufferedWriterDome1 {
    public static void main(String[] args) throws IOException {
        Writer fw=new FileWriter("src/char_buffered/data3.txt",true);

        BufferedWriter bw =new BufferedWriter(fw);
        fw.write(98);
        bw.write('a');
        bw.write('徐');
        bw.newLine();

        bw.write("abc我叫何润东");
        bw.write("\r\n");

        char[]chars="我是中国人".toCharArray();
        bw.write(chars);
        bw.write("\r\n");

        bw.write("我是中国的",0,5);
        bw.write("\r\n");

    }
}
