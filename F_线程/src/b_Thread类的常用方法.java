/**
 * Thread类的常用方法
 *  1、start()           启动当前线程，调用当前线程的run()
 *  2、run()             通常需要重写此方法，将创建的线程要执行的操作声明再此方法中
 *  3、currentThread()   静态方法，返回对当前正在执行的线程对象的引用。
 *  4、getName()         返回此线程的名称
 *  5、setName()         设置当前线程的名字
 *  6、yield()           释放当前cpu的执行，也就是不执行当前这段
 *  7、join()            在线程a中调用线程b的join()，此时线程a就进入阻塞状态，直到线程b执行完以后，线程a才结束阻塞
 *  8、stop()            强制结束当前线程
 *  9、sleep()           使当前线程进入睡眠，参数毫秒
 */
public class b_Thread类的常用方法 {
    public static void main(String[] args) {
        ThreadTest_b t1 = new ThreadTest_b();
        t1.start();

        // 给主线程设置名字     调用currentThread()获取当前正在执行的线程的引用，然后再调用setName设置当前线程的名字
        Thread.currentThread().setName("主线程GO");
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0){
                try {
                    Thread.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }



    }
}

class ThreadTest_b extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                this.yield();   // 如果i为10的倍数，就释放当前CPU的执行，this可以省略
            }
            else {
                // 在线程类中 this 就是代表当前线程对象，与 Thread.currentThread() 作用一样
                System.out.println(this.getName() + " : " + i);
            }

        }
    }
}