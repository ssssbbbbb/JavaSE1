import org.testng.annotations.Test;

import java.io.*;

/**
 *  处理流之一：缓冲流的作用
 *
 *  1、缓冲流：
 *  BufferedInputStream
 *  BufferedOutputStream
 *  BufferedReader
 *  BufferedWriter
 *
 *  2、作用：提供流的读取、写入的速度！
 *      提高读写速度的原因：内部提供了一个缓冲区
 *
 *  3、剩下的BufferedReader和BufferedWriter缓冲流与字节缓冲流使用方法相同。
 *      就是先创建普通的字符流，然后再传入字节缓冲流的构造器里，然后再调用字节缓冲流对象进行读写操作。
 *
 *  注意：像处理流里，一般都会有  flush()：用来刷新缓存区的方法。
 *  缓冲流加速读写速度的原因：有缓冲区，使用缓冲处理流包装就是一堆一堆的干活，还能不用CPU多次处理数据转换，只是设置一下数据转换成功后的文件。
 *                          不使用缓冲处理流包装就是CPU傻傻的一个字节一个字节循环来干活存储写入文件中，相比可见效率明显变慢。
 *
 */
public class c_缓冲流 {
    @Test
    public void Test1() {
        //1、创建File对象
        File file1 = new File("src//lol.jpg");
        File file2 = new File("src//lol1.jpg");

        //2、创建字节对象
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;

        //3、创建缓冲流对象
        //缓冲流作用：
        BufferedOutputStream bufferedOutputStream = null;
        BufferedInputStream bufferedInputStream = null;

        try {
            fileInputStream = new FileInputStream(file1);   // 加载字节流
            fileOutputStream = new FileOutputStream(file2);

            bufferedInputStream = new BufferedInputStream(fileInputStream); // 加载缓冲流
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            int len;    // 获取 字节流缓冲流读取的字节
            while ((len = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(len);    // 写入 字节
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            // 4、关闭流
            // 只要外层的处理流关闭，内层的流就也会跟着关闭，不需要再声明一次
            try {
                if (bufferedInputStream != null){

                    bufferedInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (bufferedOutputStream != null){

                    bufferedOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
