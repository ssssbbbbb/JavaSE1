package IO流网络编程;

import org.testng.annotations.Test;

import java.io.*;

/**
 *  对象流的使用
 *  1、ObjectInputStream 和 ObjectOutputStream。
 *  2、作用：用于储存和读取基本数据类型数据或对象的处理流。它们的强大之处是可以以字节的方式保存或读取Java中的对象。
 *
 *  3、要想一个Java对象是可序列化的，则必须人对象所属的类及其属性是可序列化的。
 *      为了让某个类是可序列化的，该类必须实现如下两个接口之一，否则会抛出NotSerializableException异常。
 *          ①   Serializable    标识接口，并没有进行什么代码处理，它的作用仅仅是做个标记
 *          ②   Externalizable
 *      然后当前类需要提供一个全局常量，serialVersionUID，值随便！
 *
 *  --------------------------------------------------------------------------------------------------------------------
 *  如果有读取或写入多个对象的需求的话：
 *  1，用对象流向文件中添加多个对象，但是在读取的时候readObject()方法只能被调用一次，如果调用的次数超过一次会出java.io.EOFException异常
 *  2，那么就需要把对象装进集合中，把整个集合对象存储到文件中，当文件需要被读取文件中的对象来进行操作的时候，因为只能取出一次，所以就把这个集合对象取出来就好了
 *
 *  ！！！！！！！
 *  (经过验证，写入一个对象后再刷新，然后再写入一个对象，之后创建两个Object类，读取两次也可以达到读取多个对象的效果！)
 */
public class a_对象流 {

    /**
     *  序列化过程：将内存中的Java对象保存到磁盘中或通过网络传输出去
     *      使用ObjectOutputStream类实现
     *      在硬盘中保存的对象流的文件内容是不能正常观看的，需要经过反序列化过程
     */
    @Test
    public void test1(){
        ObjectOutputStream oos = null;
        try {
            //1、创建流，在对象流里创建了字节输出流
            oos = new ObjectOutputStream(new FileOutputStream("src//IO流网络编程//object.dat"));
            oos.flush();    //刷新操作
            //2、输出流，打算以字节流的形式输出String的对象，到 路径"src//object.dat"中去
            oos.writeObject(new String("我是字符串类"));
            System.out.println("完成！创建对象:src//object.dat");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (oos != null){

                    //3、关闭流，如果对象流不为空，就关闭对象流
                    oos.close();    // 因为对象流跟缓冲流一样，是处理流，包裹在字节流的外层。 一般只需要关闭最外层的流内层的流也会跟着关闭
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     *  反序列化过程：将磁盘文件中的对象还原为内存中的一个Java对象
     *      使用ObjectInputStream类实现
     */
    @Test
    public void test2(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("src//IO流网络编程//object.dat"));

            String s =  (String) ois.readObject();  // 返回类型是Object，所以需要强转

            System.out.println(s);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null){

                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /** ================================================================================================================
     *  自定义类 对象流
     *  自定义类Person类，并实现了 Serializable接口
     *
     */
    @Test
    public void test3(){

        b_自定义类Person p = new b_自定义类Person("可达鸭", 2000);
        ObjectOutputStream oos = null;
        try {
            oos =new ObjectOutputStream(new FileOutputStream("src//IO流网络编程//person.dat"));
            oos.writeObject(p);

            oos.flush();
            oos.writeObject(new b_自定义类Person("皮卡丘", 250));
        } catch (IOException e) {
            e.printStackTrace();
        }   finally {
            if (oos != null){

                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /**
     *  如果需要读取或者写入多个对象在一个文件中，那么只需要先把对象保存在集合中如何进行读写即可！
     *
     *  ！！！！！！！
     *  (经过验证，写入一个对象后再刷新，然后再写入一个对象，之后创建两个Object类，读取两次也可以达到读取多个对象的效果！)
     */
    @Test
    public void test4(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("src//IO流网络编程//person.dat"));
            Object o = ois.readObject();
            System.out.println(o);

            Object o2 = ois.readObject();
            System.out.println(o2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }   finally {

            try {
                if (ois != null){
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}












