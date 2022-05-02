/**
 *  <h2>经典例题</h2>
 *  <h3>生产者/消费者问题 ---- 线程通信的应用</h3>
 *  <ul>
 *      <li>
 *          <p>生产者（Producer）将产品交给店员（Clerk），而消费者（Customer）从店员处取走产品，店员一次只能持有固定数量的产品（比如：20）
 *          ，如果生产者试图生产更多的产品。店员会叫生产者停一下，如果店中有空位放产品了再通知生产者继续生产；如果店中没有产品了，店员
 *          会告诉消费者等一下，如果店中有产品了再通知消费者来取走产品。</p>
 *      </li>
 *      <li>
 *          <p>这里可能出现两个问题：</p>
 *          <p>1. 生产者比消费者快时，消费者会漏掉一些数据没有取到。</p>
 *          <p>2. 消费者比生产者快时，消费者会取相同的数据。</p>
 *      </li>
 *  </ul>
 */
public class l_经典例题 {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer producer1 = new Producer(clerk);
        producer1.setName("生产者1");

        Customer customer1 = new Customer(clerk);
        customer1.setName("消费者1");

        producer1.start();
        customer1.start();

    }
}
/* =====================================================================================================================
分析：
1、是否是多线程问题？     是，生产者线程，消费者线程
2、是否有共享数据？       是，店员（或产品）
3、如何解决线程的安全问题？  同步机制，有三种方法  Lock锁 ----- 同步代码块 ----- 同步方法
4、是否涉及到线程通信？    是

-----------------------------------------------------------------------------------------------------------------------
代码运行逻辑
1、店员类Clerk里有个共享数据 ： productCount    产品数量
    店员类里有两个方法：  ① 生产产品方法：当产品小于20时就开始生产，当产品大于等于20时线程就进入等待
                       ② 消费产品方法：当产品数量大于0时就开始消费，当产品数量小于等于0时就进入等待
2、生产者类Producer以继承Thread的方式创建线程，并调用 生产产品方法 来生产产品
2、消费者类Customer以继承Thread的方式创建线程，并调用 消费产品方法 来消费产品
===================================================================================================================== */
// 生产者-------------------------------------------------------------
class Producer extends Thread {
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk=clerk;
    }

    @Override
    public void run() {
        System.out.println(this.getName() +": 开始生产产品......");

        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.produceProduct(); //调用生产产品的方法
        }
    }
}

// 店员----------------------------------------------------------------
class Clerk {
    //产品数量
    private int productCount = 0;

    //生产产品      当产品小于20时就开始生产，当产品大于等于20时线程就进入等待
    public synchronized void produceProduct() {
        if (productCount < 20){
            productCount++;
            System.out.println(Thread.currentThread().getName()+":开始生产第" + productCount + "个产品");

            notify();
        }else {
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //消费产品      当产品数量大于0时就开始消费，当产品数量小于等于0时就进入等待
    public synchronized void CustomerProduct() {
        if (productCount > 0) {
            System.out.println(Thread.currentThread().getName()+"开始消费第" + productCount + "个产品");
            productCount--;

            notify();
        }else {
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// 消费者--------------------------------------------------------------
class Customer extends Thread {
    private Clerk clerk;

    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + ": 开始买产品......");

        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.CustomerProduct();    //调用消费产品的方法
        }
    }
}