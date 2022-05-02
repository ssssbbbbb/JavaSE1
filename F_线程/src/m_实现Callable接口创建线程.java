import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 *  <h2>新增线程创建方式一：实现Callable接口</h2>
 *  <ul>
 *      <il>
 *          与使用Runnable相比，Callable功能更强大些。
 *      </il>
 *      <p>1. 相比两个场景方式的run()方法，Callable可以有返回值。</p>
 *      <p>2. 方法可以抛出异常。</p>
 *      <p>3. 支持泛型的返回值</p>
 *      <p>4. 需要借助FutureTask类，比如获取返回结果。</p>
 *  </ul>
 *  <hr/>
 *  <h3>实现步骤</h3>
 *      <ol>
 *          <li>创建一个实现Callable的实现类</li>
 *          <li>实现call方法，将此线程需要执行的操作声明在call()中</li>
 *          <li>场景Callable接口实现类的对象</li>
 *          <li>将此Callable接口实现类的对象作为参数传递到FutureTask构造器中，创建FutureTask的对象</li>
 *          <li>将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start()方法</li>
 *          <li>获取Callable中call方法的返回值  ———— 可有可不有，看需求</li>
 *      </ol>
 *  <hr/>
 *  <h3>Future接口</h3>
 *  <p>1. 可以对具体Runnable、Callable任务的执行结构进行取消、查询是否完成、获取结果等。</p>
 *  <p>2. FutureTask是Future接口的唯一实现类。</p>
 *  <p>3. FutureTask同时实现了Runnable、Future接口。它既可以作为Runnable被线程执行，又可以作为Future得到Callable的返回值。</p>
 */
public class m_实现Callable接口创建线程 {
    public static void main(String[] args) {
        // 3、场景Callable接口实现类的对象
        NumThread numThread = new NumThread();
        // 4、将此Callable接口实现类的对象作为参数传递到FutureTask构造器中，创建FutureTask的对象
        FutureTask futureTask = new FutureTask(numThread);

        // 5、将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start()方法
        new Thread(futureTask).start();

        try {
            // 6、获取Callable中call方法的返回值  ———— 可有可不有，看需求
            // get() 的返回值即为 FutureTask构造器 参数 Callable实现类 重写的 call() 的返回值,在这里就是NumThread重写call()的返回值
            Object sum = futureTask.get();
            System.out.println("总和为"+sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}

// 1、创建一个实现Callable的实现类
class NumThread implements Callable {
    // 2、实现call方法，将此线程需要执行的操作声明在call()中
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }

}