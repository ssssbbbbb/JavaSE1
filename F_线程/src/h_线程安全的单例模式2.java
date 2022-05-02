public class h_线程安全的单例模式2 {

}
// 单例模式 懒汉式
class Bank2 {
    private  Bank2(){
    }

    private static Bank2 instance = null;

    public static Bank2 getInstance() {
//        方式一：效率差
//        synchronized (Bank.class) {
//            if (instance == null){
//                instance = new Bank2();
//            }
//            return instance;
//        }

//         方式二：效率更高       当线程到第一个判断语句那知道instance 不为 null后就直接去 return instance；不用再一个一个的进入同步监视器造成效率变低的问题了。
        if (instance == null){
            synchronized (Bank.class){
                if (instance == null){
                    instance = new Bank2();
                }
            }
        }
        return instance;

    }
}