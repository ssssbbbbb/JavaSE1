import org.testng.annotations.Test;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class f_其它流 {

    /**
     *  一、标准的输入、输出流
     *      1、   System.in：标准的输入流，默认从键盘输入
     *            System.out：标准的输出流，默认从控制台输出
     *
     *      2、   System类的setIn()  和 setOut() 方法重新直到输入和输出的结果
     *
     *      3、练习
     *          从键盘输入字符串，要求将读取到的整行字符串撞成大写输出，然后继续进行输入操作。
     *          直至当输入“e” 或者 “exit”时，退出程序。
     *
     */
    @Test
    public void test1(){

    }

    /**
     *  二、打印流
     *      PrintStream 和 PrintWriter
     *      》 提供了一系列重载的print()和println()方法，用于多种数据类型的输出
     *
     */
    @Test
    public void test2(){

    }

    /**
     *  三、数据流
     *      DataInputStream 和 DataOutputStream
     *
     *      1、作用：用于读取或写出基本数据类型的变量或字符串
     */
    @Test
    public void test3() throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("src//数据流.txt"));

        dos.writeUTF("UTF-8");
        dos.flush();    // 刷新此数据输出流。这会强制将任何缓冲的输出字节写出到流中。
        dos.writeInt(123);
        dos.flush();
        dos.writeBoolean(true);
        dos.flush();

        dos.close();
    }
}

