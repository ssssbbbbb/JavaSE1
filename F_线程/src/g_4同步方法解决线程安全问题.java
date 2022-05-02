public class g_4同步方法解决线程安全问题 {
    public static void main(String[] args) {
        ThreadTest_g4 tg4 = new ThreadTest_g4();

        Thread t1 = new Thread(tg4);
        Thread t2 = new Thread(tg4);
        Thread t3 = new Thread(tg4);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}

/**
 *  使用同步方法来解决 实现Runnable接口 的线程安全问题：
 *      1、把需要操作共享数据的线程方法声明在run()外部 ———— show()
 *      2、把show()方法用 synchronized 修饰
 *      3、然后在run()方法里调用show()方法
 *          在show()方法中，监视器就是this
 *
 *
 *      另外
 *          while (ticket > 1) {    //结束循环的条件也变了
 *             show();
 *         }
 */
class ThreadTest_g4 implements Runnable {
    private int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {

        while (ticket > 1) {    //结束循环的条件也变了
            show();
        }

    }

    private synchronized void  show() {
        // 如果不用synchronized修饰show()方法，也可以在这里使用同步代码块方式来解决
        // synchronized(this) {操作共享数据的操作}       这里的锁就是this，当前类  《ThreadTest_g4 tg4 = new ThreadTest_g4(); 在main()中》
        if (ticket > 0) {
            // 故意增加的代码，用于增加线程安全问题出现的机率
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + ":卖票，票号为:" + ticket);
            ticket--;
        }
    }


}
