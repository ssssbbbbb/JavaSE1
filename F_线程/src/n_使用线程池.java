import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *  创建线程新增方式二：使用线程池
 *
 *  一、背景：
 *          经常创建和销毁、使用量特别大的资源，比如并发情况下的线程。对哦性能影响很大。
 *  二、思路：
 *          提前创建好多个线程，放入线程池中，使用时直接获取，使用完放回池中。可以避免频繁创建销毁、实现重复利用。类似生活中的公共交通工具。
 *  三、好处：
 *          1、提高响应速度（减少了创建新线程的时间）
 *          2、降低资源消耗（吃饭利用线程池中线程，不需要每次都创建）
 *          3、便于管理(属性）
 *              corePoolSize: 核心池的大小
 *              maximumPoolSize: 最大线程池
 *              keepAliveTime: 线程没有让我也时最多保持多长时间后会终止
 *  四、线程池相关API
 *      1、JDK 5.0起提供了线程池相关API:ExecutorService和Executors
 *      2、ExecutorService：真正的线程池接口。常见子类ThreadPoolExecutor
 *          ① void execute(Runnable command)：执行任务/命令，没有返回值，一般用来执行Runnable
 *          ② <T> Future<T>submit(Callable<T>task)：执行任务，有返回值，一般用来执行Callable
 *          ③ void shutdown()：关闭连接池
 *      3、Executors:工具类、线程池的工厂类，用于创建并返回不同类型的线程池
 *          ① Executors.newCachedThreadPool()：创建一个可根据需要创建新线程的线程池
 *          ② Executors.newFixedThreadPool(n);创建一个可重用固定线程数的线程池
 *          ③ Executors.newSingleThreadExecutor()：创建一个只有一个线程的线程池
 *          ④ Executors.newScheduledThreadPool(n)：创建一个线程池，它可安排在给定延迟后运行命令或者定期地执行。
 */
public class n_使用线程池 {
    public static void main(String[] args) {
        // 1、提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);

        // 2、执行指定的线程的操作。需要提供实现Runnable接口或Callable接口实现类的对象
        service.execute(new NumberThread1());  //适合使用于Runnable
        service.execute(new NumberThread2());
//        service.submit();    适合使用于Callable

        // 3、关闭线程池
        service.shutdown();
    }
}

class NumberThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }
}

class NumberThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++){
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }
}