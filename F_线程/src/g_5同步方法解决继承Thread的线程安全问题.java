public class g_5同步方法解决继承Thread的线程安全问题 {
    public static void main(String[] args) {
        ThreadTest_g5 t1 = new ThreadTest_g5();
        ThreadTest_g5 t2 = new ThreadTest_g5();
        ThreadTest_g5 t3 = new ThreadTest_g5();

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
/**
 *  使用同步方法解决 继承Thread类 的线程安全问题
 *  如果此次还是跟 g_4同步方法解决线程安全问题.java 中解决实现Runnable接口的线程的安全问题 的方法一样，那么就错了
 *  因为，继承Thread创建线程的方式，每造一个线程就要new一个对象，
 *  因此如果还是使用synchronized来修饰 show() 方法用this为锁，那么它们就不会共享一个锁，因为此时的this代表t1、t2、t3。
 *
 *
 *      另外
 *          while (ticket > 1) {    //结束循环的条件也变了
 *             show();
 *         }
 */
class ThreadTest_g5 extends Thread {
    private static int ticket = 100;    //因为继承Thread方式创建线程，每个线程就需要重新创建一个对象，因此这里必须要把 ticket 设置为静态的，保证全局共享
    //Object obj = new Object();
    static Object obj = new Object();

    @Override
    public void run() {
        while (ticket > 1) {
            show();
        }
    }

    //private synchronized void show() { 错误，此时的同步监视器this为：t1、t2、t3，它们不共享一个锁
    private static synchronized void show() {
        synchronized (obj) {
            if (ticket > 0) {

                System.out.println(Thread.currentThread().getName() + ":卖票，票号为:" + ticket);
                ticket--;

            }
        }
    }
}