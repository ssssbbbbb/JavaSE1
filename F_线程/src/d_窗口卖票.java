/**
 * 例子：创建三个窗口，总票数为100张，三个窗口卖这一百张
 */
public class d_窗口卖票 {
    public static void main(String[] args) {
        ThreadTest_d t1 = new ThreadTest_d();
        t1.setName("窗口一");
        t1.start();

        ThreadTest_d t2 = new ThreadTest_d();
        t2.setName("窗口二");
        t2.start();

        ThreadTest_d t3 = new ThreadTest_d();
        t3.setName("窗口三");
        t3.start();
    }
}

class ThreadTest_d extends Thread {
    static int value = 100;

    @Override
    public void run() {
        int i = 1;
        while (true){
            if (value == 0){
                System.out.println(getName()+ "卖完了");
                break;
            }else {
                value --;
                System.out.println(this.getName()+" 卖出"+ i + "张票");
                i++;
            }
        }

    }
}