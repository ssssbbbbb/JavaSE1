import org.testng.annotations.Test;

import java.io.File;
import java.util.Arrays;

// https://www.apiref.com/java11-zh/java.base/java/io/File.html
public class f_File类的方法 {
    /**
     * 获取---
     *  public String getAbsolutePath():   获取绝对路径
     *  public String getPath():    获取路径
     *  public String getName():    获取名称
     *  public String getParent():  获取上层文件目录路径。若无，返回null
     *  public long length():   获取文件长度（即：字节数）。不能获取目录的长度
     *  public long lastModified(): 获取最后一次的修改时间，毫秒值
     *  public String[] list(0: 获取指定目录下的所有文件或者文件目录的名称数组
     *  public File[] listFiles():  获取指定目录下的所有文件或者文件目录的File数组
     *
     */
    @Test
    public void test1(){
        File file1 = new File("hello.txt");
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());

        File file2 = new File("C:\\Users\\hhhhh\\Desktop\\任务.txt");
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.lastModified());

        File file3 = new File("C:\\Users\\hhhhh\\Documents\\MyCode\\IDEA_Java\\K_泛型与File");
        System.out.println(Arrays.toString(file3.list()));
        System.out.println(Arrays.toString(file3.listFiles()));
    }

    /**
     * 修改---
     *  public boolean renameTo(File dest):     把文件重命名为指定的文件路径
     */
    @Test
    public void test2() {
        File file1 = new File("C:\\Users\\hhhhh\\Documents\\MyCode\\IDEA_Java\\K_泛型与File\\haha.txt");
        File file2 = new File("xx.txt");
        /*  这里原来是有一个叫 haha.txt 的文件的，但是在运行这个程序一次之后，
            这个 haha.txt文件就会改名为 xx.txt 文件,
            而且，只有存储在磁盘中的文件才能改名，因此 File对象“file2”是永远改不了名的，
            想要程序成功，就要保证 “file1”对象中的参数与左边 “K_泛型与File”中的txt文件名一致！
         */
        if (file1.renameTo(file2)) {
            System.out.println("更改成功");
            System.out.println(file1.getAbsolutePath());
        }
    }

    /**
     *  public boolean isDirectory():判断是否是文件目录
     *  public boolean isFile():判断是否是文件
     *  public boolean exists():判断是否存在
     *  public boolean canRead()判断是否可读
     *  public boolean canWrite():判断是否可写
     *  public boolean isHidden():判断是否隐藏
     */
    @Test
    public void test3(){

    }

    /**
     * public boolean createNewFile()：创建文件。若文件存在，则不创建，返回false
     * public boolean mkdir()：创建文件目录。如果此文件目录存在，就不创建了。如果此文件目录的上层目录不存在，也不创建。
     * public boolean mkdirs()：创建文件目录。即使上层文件目录不存在，也一并创建。
     *
     * 注意事项：如果你创建文件或者文件目录没有写盘符路径，那么，就默认在项目路径下。
     *
     * public boolean delete()：删除文件或者文件夹
     *
     * 删除注意事项：
     * Java中的删除不走回收站。
     * 要删除一个文件目录，请注意该文件目录内不能包含文件或者文件目录
     */
}
