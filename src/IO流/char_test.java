package IO流;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 学会自己将文字进行编码和解码,为以后场景做准备
 */
public class char_test {
    public static void main(String[] args) throws UnsupportedEncodingException {
    //1.编码:把文字转换成字节(使用指定的编码)
        String name="我爱你";
        //byte[]bytes=name.getBytes();
        byte[]bytes=name.getBytes("GBK");
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));
        //把字节转换成中文形式(编码前和编码后的字符集必须一致,否则会出现乱码)
//        String rs=new String(bytes);
        //也可以指定GBK解码
        String rs=new String(bytes,"GBK");
        System.out.println(rs);
    }
}
