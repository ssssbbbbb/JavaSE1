/**
 *  线程的生命周期
 *  1、新建
 *      ① 继承于Thread类，并重写run()
 *      ② 创建一个实现了Runnable接口的类，并实现Runnable里的抽象方法run()，然后创建实现类的对象，最后将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 *  2、就绪
 *      调用start()
 *  3、运行
 *      main()
 *  4、阻塞
 *      ① yield()           释放当前cpu的执行，也就是不执行当前这段
 *      ② join()            在线程a中调用线程b的join()，此时线程a就进入阻塞状态，直到线程b执行完以后，线程a才结束阻塞
 *      ③ sleep()           使当前线程进入睡眠，参数毫秒
 *  5、死亡
 *      ① stop()            强制结束当前线程
 *      ② 出现异常程序崩溃
 *      ③ 程序自然结束
 */
public class f_线程的生命周期 {
    public static void main(String[] args) {

    }
}
