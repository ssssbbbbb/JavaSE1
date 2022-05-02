/**
 * Java语言的JVM预先程序运行多个线程，它通过Java.lang.Thread类来实现
 *
 * 一、多线程的创建
 *      方式一：继承于Thread类
 *          1、创建一个继承于Thread类的子类
 *          2、重写Thread类中的run()方法
 *          3、创建Thread类的子类的对象
 *          4、通过此对象调用start()方法
 *              作用: ① 启动当前线程    ② 调用当前线程的run()方法
 *
 *  二、Thread方法  Thread.currentThread().getName()
 *      1、currentThread()：返回对当前正在执行的线程对象的引用。
 *      2、getName()：返回此线程的名称
 *
 *  三、问题
 *      1、我们不能通过直接调用run()的方式启动线程
 *      2、一个线程只能调用一次start()
 *      3、一个线程子类，可以实例化多个线程对象 —— 24~25行
 */
public class a_线程的创建和使用 {
    public static void main(String[] args) {
// 3、创建Thread类的子类的对象
        ThreadTest threadTest = new ThreadTest();
        ThreadTest threadTest1 = new ThreadTest();
// 4、通过此对象调用start()方法
        threadTest.start();
        threadTest1.start();
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }

        ThreadTests threadTests = new ThreadTests();
        threadTests.start();
    }
}

// 1、创建一个继承于Thread类的子类
class ThreadTest extends Thread {

//2、重写Thread类中的run()方法
    @Override
    public void run() {
        for (int i = 0; i <= 200; i++ ) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }

    }
}

class ThreadTests extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 300; i++){
            if (i % 3 == 0){
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }
}