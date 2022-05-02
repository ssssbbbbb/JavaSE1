/**
 *  <h3>使用同步机制将单例模式中的懒汉式改写为线程安全的</h3>
 *
 */
public class h_线程安全的单例模式 {
    public static void main(String[] args) {

        ThreadTest_h TH = new ThreadTest_h();

        Thread t1 = new Thread(TH);
        Thread t2 = new Thread(TH);
        Thread t3 = new Thread(TH);

        t1.start();
        t2.start();
        t3.start();


    }
}
//单例模式 懒汉式
class Bank {
    private  Bank(){

    }

    private static Bank instance = null;

    //public static synchronized Bank getInstance() {   同步方法监视器

    public static Bank getInstance() {  // 未解决线程安全的 共享数据代码块
        // 首次使用 instance 调用 getInstance() ，Bank类的实例对象instance为null，
        // 因此就会初始化，获得内存中对象的地址值（instance = new Bank();）
        if (instance == null){
            instance = new Bank();
        }
        return instance;
        /* -------------------------------------------------------------------------------------------------------------
            如果是多线程调用这段代码去创建单例模式的对象，那么，这里很可能会发生线程安全问题。
            因为当多个线程同时到达此处，判断 instance 是否为null时，它们都会得到instance为null的信息
            因此，这多条线程就会都执行 instance = new Bank() 这条代码，从而创建了多个对象，导致实例化模式没了其所存在的意义。
            Bank@94f2d6d
            Bank@411dfe5
            Bank@94f2d6d
            以上就是线程使用单例模式创建的对象的地址，可以发现第二个对象的地址与其它两个不同，这就说明了第二个线程创建了新的对象

            解决方法：
                方式一：将getInstance()方法用 synchronized 修饰，时 this为监视器，使用同步方法解决线程安全问题。
        ------------------------------------------------------------------------------------------------------------- */
    }
}

class ThreadTest_h implements Runnable {

    @Override
    public void run() {
        Bank b1 = Bank.getInstance();

        System.out.println(b1); //输出所创建的对象的地址
    }
}
