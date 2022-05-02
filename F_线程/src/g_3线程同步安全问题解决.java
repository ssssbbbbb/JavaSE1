public class g_3线程同步安全问题解决 {
    public static void main(String[] args) {
        ThreadTest_g3 t1 = new ThreadTest_g3();
        ThreadTest_g3 t2 = new ThreadTest_g3();
        ThreadTest_g3 t3 = new ThreadTest_g3();

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
        // 虽然输出的都是窗口一的卖票，那是因为每次线程抢同步代码块的锁时都是它最快，因此这里建议创建线程最好使用  实现Runnable接口的方式  创建线程
    }
}

/**
 *  此处使用的线程安全解决方法是：同步代码块
 *  但是线程安全问题依然存在
 *  这是因为，这个线程创建方式是继承Thread，而要创建线程对象就需要new三个继承Thread的对象
 *  而同步代码synchronized()方法的要求是：多个线程必须要共用同一把锁。
 *  因为此创造线程对象的方法是new了三个不同的对象，因此，它们的锁    Object obj  都是不同的类，因此需要把该锁设置为静态，全局共享。
 *
 */
class ThreadTest_g3 extends Thread {
    private static int ticket = 100;
    //Object obj = new Object();    因为继承Thread方式创建线程，每个线程就需要重新创建一个对象，因此这里必须要把类设置为静态的，保证全局共享
    static Object obj = new Object();
    @Override
    public void run() {

        while (true) {
            synchronized (obj) {
                if (ticket > 0) {

                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为:" + ticket);
                    ticket--;

                } else {
                    break;
                }
            }
        }

    }
}
