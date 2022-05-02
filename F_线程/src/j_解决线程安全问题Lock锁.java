import java.util.concurrent.locks.ReentrantLock;

/**
 *  解决线程安全问题的方式三：Lock锁 --- JDK5.0新增
 *
 *  1、synchronized 与 Lock 的异同
 *      相同：二者都可以解决线程安全问题
 *      不同：synchronized机制在执行完相应的同步代码以后，自动的释放同步监视器
 *            Lock需要手动的启动同步（调用Lock()方法），同时结束同步也需要手动的实现（unlock()）
 *
 *  2、解决线程安全问题方法的优先顺序
 *      Lock ----- 同步代码块（已经进入了方法体） ----- 同步方法（在方法体之外）
 */
public class j_解决线程安全问题Lock锁 {
    public static void main(String[] args) {
        Window win = new Window();

        Thread t1 = new Thread(win);
        Thread t2 = new Thread(win);
        Thread t3 = new Thread(win);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Window implements Runnable {
    private  int ticket = 100;

    // 1、实例化ReentrantLock
    private ReentrantLock lock = new ReentrantLock();

    /*
     *  此类的构造函数接受一个可选的公平参数。 当设置为true ，在争用true下，锁有利于授予对等待时间最长的线程的访问权限。
     *
     *      比如线程a速度为10，线程b速度为5，线程c速度为1，但因为线程a的速度最快因此每次锁都让线程a抢了。而ReentrantLock类就是来解决这个问题的*
     *      如果线程a执行完了就让在外面等待的线程b执行，如果线程b执行完了就让线程c执行，让它们都有公平（不一定完全公平）的执行次数
     */
    @Override
    public void run() {
        while (true) {
            // 2、上锁:lock()
            lock.lock();

            try {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName()+": 售票，票号为: "+ticket);
                    ticket--;
                }else {
                    break;
                }
            }finally {
                // 3、调用解锁方法：unlock()
                lock.unlock();
            }
        }
    }

}
