/**
 * 创建多线程方式二：实现Runnable接口
 *  1、创建一个实现了Runnable接口的类
 *  2、实现类去实现Runnable中的抽象方法：run()
 *  3、创建实现类的对象
 *  4、将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 *  5、通过Thread类的对象调用start()
 *
 *  方式一：继承于Thread类    VS   方式二：实现Runnable接口
 *  开发中创建线程的方式优先使用  创建多线程方式二：实现Runnable接口
 *  因为在开发中，有可能继承Thread的类会需要继承其他的类，但子类的父类只能有一个，而接口的实现却是无限的。
 */
public class e_实现Runnable接口 {
    public static void main(String[] args) {
// 3、创建实现类的对象
        RunnableTest r1 = new RunnableTest();

// 4、将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread t1 = new Thread(r1);

// 5、通过Thread类的对象调用start()
        t1.start();



    }
}
// 1、创建一个实现了Runnable接口的类
class RunnableTest implements Runnable {

// 2、实现类去实现Runnable中的抽象方法：run()
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " 奇数 : " + i);
            }
        }
    }
}