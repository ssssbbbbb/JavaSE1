/**
 * 调度策略：
 *      1、时间片
 *      2、抢占式：高优先级的线程抢占CPU
 *
 * Java的调度方法
 *      1、同优先级线程组成先进先出队列（先到先得），使用时间片策略
 *      2、对高优先，使用优先调度的抢占式策略
 *
 *      一、线程的优先级常量
 *          1. MAX_PRIORITY : 10    最优先
 *          2. MIN_PRIORITY : 1     最末尾
 *          3. NORM_PRIORITY : 5    默认
 *
 *      二、如何获取和设置当前线程的优先级
 *          getPriority()：获取线程的优先级
 *          setPriority(int p)：设置线程的优先级
 *
 *  说明：高优先级的线程要抢占低优先级线程cpu的执行权，但是只是才概率上讲，高优先级的线程高概率的情况下被执行。
 *       并不意味着，只有当高优先级的线程执行以后，低优先级的线程才执行。
 */
public class c_线程的调度 {
    public static void main(String[] args) {

        ThreadTest_c1 t1 = new ThreadTest_c1();
        t1.start();

        ThreadTest_c2 t2 = new ThreadTest_c2();
        t2.start();

        for (int i = 0; i <= 100; i++) {
            Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
            if (i % 3 == 0){
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }
}

class ThreadTest_c1 extends Thread {

    @Override
    public void run() {
        // 设置当前线程优先级
        this.setPriority(MAX_PRIORITY);

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " 偶数 : " + i);
            }
        }
    }
}

class ThreadTest_c2 extends Thread {

    @Override
    public void run() {
        Thread.currentThread().setPriority(NORM_PRIORITY);
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " 奇数 : " + i);
            }
        }
    }
}