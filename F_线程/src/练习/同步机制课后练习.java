package 练习;

import java.util.concurrent.locks.ReentrantLock;

/**
 *  银行有一个账户，有两个储户分别向同一个账户存3000元，每次存1000，存3次。每次存完打印账户余额。
 *
 */
public class 同步机制课后练习 {
    public static void main(String[] args) {
        账户 zh = new 账户();

        Thread t1 = new Thread(zh);
        Thread t2 = new Thread(zh);

        t1.setName("老李");
        t2.setName("老张");

        t1.start();
        t2.start();

    }
}
/* ---------------------------------------------------------------------------------------------------------------------
解决线程安全问题前：
老李: 存了1000，现在账户有 :1000
老李: 存了1000，现在账户有 :3000
老张: 存了1000，现在账户有 :2000
老李: 存了1000，现在账户有 :4000
老张: 存了1000，现在账户有 :5000
老张: 存了1000，现在账户有 :6000
账户错误 ！直接从1000飙到3000，中间的2000在3000后面才打印出来

使用Lock锁解决：
老李: 存了1000，现在账户有 :1000
老李: 存了1000，现在账户有 :2000
老李: 存了1000，现在账户有 :3000
老张: 存了1000，现在账户有 :4000
老张: 存了1000，现在账户有 :5000
老张: 存了1000，现在账户有 :6000
问题解决！
--------------------------------------------------------------------------------------------------------------------- */

class 账户 implements Runnable {
    private static int money = 0;
    //实例化ReentrantLock类，构造器参数为true
    private ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run() {
        //上锁
        lock.lock();

        for (int i = 0; i < 3; i++){
            money += 1000;
            System.out.println(Thread.currentThread().getName()+": 存了1000，现在账户有 :"+money);
        }
        //解锁
        lock.unlock();
    }

}