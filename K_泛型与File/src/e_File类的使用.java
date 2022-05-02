import org.testng.annotations.Test;

import java.io.File;

/**
 *  File类的使用
 *  1、File类的一个对象，代表一个文件或一个文件目录（俗称：文件夹）
 *  2、File类声明在Java.io包下
 *  3、File类中涉及到关于文件或文件目录的创建、删除、重命名、修改时间、文件大小等方法，
 *      并为涉及到写入或读取文件内容的操作。如果需要，则必须使用IO流来完成。
 */
public class e_File类的使用 {
    /*
    1、如何创建File类的实例
        import java.io.File;    //先导入包
        ①
        File file1 = new File("hello.txt"); //在相对路径“hello.txt”上创建txt文件对象
        ②
        File file2 = new File("C:\\Users\\hhhhh\\Documents\\MyCode\\IDEA_Java", "hello"); //在绝对路径上创建文件夹对象"hello"
        ③
        File file3 = new File(file2, "hello.txt"); //在文件夹对象file2下创建.txt文件对象“hello.txt”


    2、 相对路径：相较于某个路径下，指明的路径。
        绝对路径：包含盘符在内的文件或文件目录的路径。

    3、路径分隔符
        Windows：\\
        unix：/

    4、后续File类的对象常会作为参数传递到流的构造器中，指明读取或写入的“终点”
     */
    @Test
    public void Test1(){
        // 以下三个File对象构造器，创建的都是在内存层面中的对象，并没有存入磁盘。
        File file1 = new File("hello.txt"); //在相对路径“hello.txt”上创建txt文件对象

        File file2 = new File("C:\\Users\\hhhhh\\Documents\\MyCode\\IDEA_Java", "hello"); //在绝对路径上创建文件夹对象"hello"

        File file3 = new File(file2, "hello.txt"); //在文件夹对象file2下创建.txt文件对象“hello.txt”
    }
}
