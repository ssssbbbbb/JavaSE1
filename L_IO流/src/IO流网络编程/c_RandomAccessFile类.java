package IO流网络编程;

import org.testng.annotations.Test;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *    一、RandomAccessFile 类  （随机存取文件流）
 *
 * 1、 RandomAccessFile声明在java.io包下，但直接继承于java.lang.Object类。并且它实现了
 *      DataInput、DataOutput这两个接口，也就意味着这个类既可以读也可以写。
 *
 * 2、 RandomAccessFile类支持“随机访问”的方式，程序可以直接跳到文件的任意地方来读、写文件
 *      >支持只访问文件的部分内容
 *      >可以向已存在的文件后追加内容
 *
 * 3、 RandomAccessFile对象包含一个记录指针，用以标示当前读写处的位置。RandomAccessFile类对象可以自由移动记录指针：
 *      long getFilePointer()：获取文件记录指针的当前位置
 *      void seek(long pos)：将文件记录指针定位到pos 位置
 *
 *    二、构造器
 *   1、public RandomAccessFile(File file, String mode)
 *   2、public RandomAccessFile(String name, String mode)
 *
 *   3、创建 RandomAccessFile类实例需要指定 个mode 参数，该参数指定RandomAccessFile的访问模式：
 *          r：以只读方式打开
 *          rw：打开以便读取和写入
 *          rwd：打开以便读取和写入；同步文件内容的更新
 *          rws：打开以便读取和写入；同步文件内容和元数据的更新
 *
 *   4、如果模式为只读r。则不会创建文件，而是会去读取一个已经存在的文件，如果读取的文件不存在则会出现异常。
 *      如果模式为rw读写。如果文件不存在则会去创建文件，如果存在则不会创建。
 */
public class c_RandomAccessFile类 {
    @Test
    public void test1() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("src//lol.jpg", "r");
        RandomAccessFile raf2 = new RandomAccessFile("src//llooll.jpg", "rw");

        byte[] bytes = new byte[1024];
        int len;
        while ( (len = raf.read(bytes)) != -1){
            raf2.write(bytes,0,len);
        }

        raf.close();
        raf2.close();
    }
}
