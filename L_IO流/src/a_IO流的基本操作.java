import org.testng.annotations.Test;

import java.io.*;

/**
 *  一、流的分类
 *      1、操作数据单位：字节流、字符流
 *      2、数据的流向：输入流、输出流
 *      3、流的角色：节点流、处理流
 *
 *  二、流的体系的结构
 *      抽象基类
 *      InputStream
 *      OutputStream
 *      Reader
 *      Writer
 */
public class a_IO流的基本操作 {
    public static void main(String[] args) {
        File file = new File("IO流.md"); //相较于当前工程下的 (就是IDEA_Java文件目录为当前目录,此处创建的File对象是处于IDEA_Java之下L_IO流之上的)
        System.out.println(file.getAbsolutePath());
        // 如果使用大于此工程的相对路径则
        File f = new File("Documents\\MyCode\\IDEA_Java\\IO流.md");
        System.out.println(f.getAbsolutePath());
        File ff = new File("IDEA_Java\\L_IO流\\src\\IO流.md");
        System.out.println(ff.getAbsolutePath());
        //C:\Users\hhhhh\Documents\MyCode\IDEA_Java\IO流.md
        //C:\Users\hhhhh\Documents\MyCode\IDEA_Java\Documents\MyCode\IDEA_Java\IO流.md
        //C:\Users\hhhhh\Documents\MyCode\IDEA_Java\IDEA_Java\L_IO流\src\IO流.md
    }
    /*  ----------------------------------------------------------------------------------------------------------------
        FileReader

        知识点：
            1、read()：读取一个字符，返回0到65535（ 0x00-0xffff ）范围内的整数（可以转换为对应的char），在单次程序中每read()一次指针就指向下一个字符，如果已到达流末尾就返回-1。
            2、异常的处理：为了保证流资源一定可以执行关闭。需要使用try-catch-finally处理。
            3、读入的文件一定要存在，否则就会报错：FileNotFoundException。
     */
    @Test
    public void Test1() throws IOException {
        //1、实例化File类的对象，指明要操作的文件
        File file1 = new File("src//hello.txt"); //相较于当前模块下的 (L_IO流 是相对路径当前所在的目录位置)
        System.out.println(file1.getAbsolutePath());
        //2、提供具体的流
        FileReader fr = new FileReader(file1);

        //3、数据的读入
        //read()：读取一个字符，返回0到65535（ 0x00-0xffff ）范围内的整数（可以转换为对应的char），在单次程序中每read()一次指针就指向下一个字符，如果已到达流末尾就返回-1.
        //https://www.apiref.com/java11-zh/java.base/java/io/FilterReader.html#read()
        int data = fr.read();
        while (data != -1){
            System.out.println(data);
            System.out.println((char)data);
            data = fr.read();
        }

        //4、流的关闭
        fr.close();
    }


    /*     public int read(char cbuf[]) throws IOException {
                return read(cbuf, 0, cbuf.length);
            }
        将字符读入数组。此方法将阻塞，直到某些输入可用、发生 I/O 错误或到达流的末尾。
        参形：cbuf - 目标缓冲区
        返回值：读取的字符数，如果已到达流的末尾，则为 -1
        抛出：IOException – 如果发生 I/O 错误
     */
    @Test
    public void Test2() {
        File file = new File("src//hello.txt");


        FileReader fr = null;   //创建File对象可能会找不到此文件目录，因此要解决异常：FileNotFoundException   下面catch()抛出了IOException
        try {
            fr = new FileReader(file);
            char[] fileChar = new char[5];  //设置单次IO流可以读取多大的字符数量
            int i;  // 用来接收，IO流单次读取了的字符数量

            while ((i = fr.read(fileChar)) != -1){    //读取文件可能发送IO流错误，因此要解决异常：IOException
                for (int j = 0; j<i;j++){   // 这里的i已经在while赋值过了，里面储存的是每次读入的字符数量，以每次读入的字符数量来当做遍历次数
                    /*  如果这里用char[] fileChar的元素数量来作为遍历次数的话，在文件内字符数量不是5的倍数后就会打印出错误的信息
                        例如文件内有8个字符（a,b,c,d,e,f,g,h）：第一次读入5个(a,b,c,d,e)字符并存入数组然后遍历，第二次读入剩下的3个(f,g,h)存入数组，但此时的char数组内的元素为[f,g,h,d,e]
                        因为上一步存入的(a,b,c,d,e)并没有被清除，因此会接着遍历输出(f,g,h,d,e)，最终打印的结果会变成“abcdefgde”      */
                    System.out.println(fileChar[j]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {             // finally ：执行try ... catch语句后，一定会执行finally内的程序
            if (fr != null){    // 要保证如果创建了流，就一定要关闭！
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /*  FileWriter -----------------------------------------------------------------------------------------------------
        从内存（程序）中写出数据到硬盘的文件里。（把内存的数据传出去叫“出”，外面的数据到内存中来叫”进“）
        public FileWriter( @NotNull java.io.File file, boolean append )
        说明：
            1、输出操作：对应的File对象可以是不存在的（就是在硬盘上可以没有这个文件）。
                    如果不存在：就会在输出的过程中自动创建此文件，然后写出。
                    如果存在：FileWriter()构造器后面的形参“append”为 false，就把写出的内容覆盖原文件里的内容
                             FileWriter()构造器后面的形参“append”为 true，就把写出的内容添加到文件内容的末尾
     */
    @Test
    public void test3() throws IOException {
        //1、提供File类对象，指明写出到哪个文件（把内存中的数据 写出到硬盘内的哪个文件里）
        File file = new File("src//test2.txt");

        //2、提供FileWriter的对象，用于数据的写出
        FileWriter fileWriter = new FileWriter(file);
        FileWriter fileWriter2 = new FileWriter(file, false);
        //3、写出的操作
        fileWriter.write("天王盖地虎");
        fileWriter.write(new char[]{'c','n','m','l','m'});
        fileWriter.write(120);

        //4、流资源的关闭操作
        fileWriter.close();
    }

    /* 复制文件：先把内容写出到a文件，然后再读入a文件内的内容到内存中，再把a文件的内容写出到另一个文件上，以此达到复制文件内容的操作

        操作流程：先在 本模块下的src目录下创建了一个 "读入.txt"，然后再在程序内创建一个File对象"src//写出.txt"

     */
    @Test
    public void Test4() throws IOException {
        File file1 = new File("src//写出.txt");

        FileWriter fw = new FileWriter(file1);
        fw.write("别看我是一只羊");

        fw.close();


        File file2 = new File("src//读入.txt");
        FileReader fr = new FileReader(file1);

        StringBuilder s = new StringBuilder();
        int i=0;
        while ((i = fr.read()) != -1){
            s.append((char) i);
        }
        fr.close();

        FileWriter fileWriter = new FileWriter(file2);
        fileWriter.write(String.valueOf(s));
        System.out.println(s);
        fileWriter.close();
    }
    // 读取再写出的复制操作
    @Test
    public void Test5() {   //不能用FileWriter和FileReader来处理字节流（二进制），因为它们是处理字符的。

        //1、创建File类对象，指明读入和写出的文件
        File file1 = new File("src//写出.txt");
        File file2 = new File("src//读入.txt");

        //2、创建输入流和输出流的对象
        FileWriter fileWriter = null;
        FileReader fileReader = null;
        try {
            fileWriter = new FileWriter(file1);
            fileReader = new FileReader(file2);

            //3、完成数据的读入和写出操作
            char[] cbuf = new char[5];
            int len;                    // 获取读入的字符数量
            while ((len = fileReader.read(cbuf)) != -1){    //读多少，就写多少
                fileWriter.write(cbuf, 0, len);       //写入字符数组的一部分，写入多少就看len是多少
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4、关闭资源
            try {
                assert fileReader != null;
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {

                try {
                    assert fileWriter != null;
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}















