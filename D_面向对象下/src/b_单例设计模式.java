/**
 * 	
 * @author hjj
 * @time 2021年11月13日 下午4:55:03 
 *	设计模式：是在大量的实践中总结和理论化之后优选的代码结构、编程风格、以及解决问题的思考方式。
 *
 *	单例设计模式分为：
 *		① 饿汉式		
 *			饿汉式就是像饿死鬼一样一上来就初始化：在调用对象之前就初始化对象了，因此会一直在内存中加载该对象，需要时就调用。
 *			好处：线程安全
 *			坏处：对象加载时间过长
 *		② 懒汉式
 *			懒汉式就是像懒鬼一样你不叫它就不初始化：在需要时才初始化对象，在那之前一直处于未初始化加载的状态，推荐懒汉式，这样就不会对内存资源造成浪费
 *			好处：延迟对象加载时间，节省内存
 *			坏处：线程不安全
 */
public class b_单例设计模式 {

}
