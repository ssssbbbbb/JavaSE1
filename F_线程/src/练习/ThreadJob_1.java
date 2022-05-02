package 练习;

/**
 * 练习：创建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数
 */
public class ThreadJob_1 {
    public static void main(String[] args) {
        ThreadTest1 threadTest1 = new ThreadTest1();
        ThreadTest2 threadTest2 = new ThreadTest2();

        threadTest1.start();
        threadTest2.start();
    }
}

class ThreadTest1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " 偶数 : " + i);
            }
        }
    }
}

class ThreadTest2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " 奇数 : " + i);
            }
        }
    }
}