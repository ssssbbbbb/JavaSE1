import org.testng.annotations.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 *      1、转换流提供了在字节流和字符流之间的转换
 *
 *      2、Java API提供了两个转换流：     （它们也是处理流）
 *          》InputStreamReader：将一个 字节的输入流 转换为 字符的输入流
 *          》OutputStreamWriter：将一个 字符的输出流 转换为 字节的输出流
 *          解码：字节、字节数组 ---> 字符数组、字符串
 *          编码：字符数组、字符串 ---> 字节、字节数组
 *
 *      3、字节流中的数据都是字符时，转成字符流操作更高效。
 *
 *      4、很多时候外面使用转换流来处理文件乱码问题。实现编码和解码功能。
 */
public class e_转换流 {

    /*  先解码：将文件内容以字节流的方式 读入，然后返回默认类型的字符流（此时，在内存中储存的就是默认的（GBk）字节）
        再编码：将读入的字符进行解码，以需要的类型写出。（将内存中的默认字节，转换为新的字符输出（UTF-8））
        在转换中，是不能直接解码然后再写出的，中间需要使用转换流（OutputStreamWriter）将内存中的字节转换为想要的类型的字符，然后再写出才行！
     */
    @Test
    public void test1() throws IOException {

        FileInputStream fis = new FileInputStream("src//字符转换_GBK.txt");
        FileOutputStream fos = new FileOutputStream("src//字符转换_UTF8.txt");


        InputStreamReader isr = new InputStreamReader(fis, "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");

        char[] cbuf = new char[20];
        int len;
        while ((len = isr.read(cbuf)) != -1){
//            String str = new String(cbuf,0,len);
//            System.out.println(str);
            osw.write(cbuf,0,len);
        }

        isr.close();
        osw.close();

    }
}
