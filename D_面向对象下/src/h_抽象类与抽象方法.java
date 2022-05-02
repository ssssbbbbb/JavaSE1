/**
 * 	abstract关键字的使用
 * 		1、abstract（抽象的）
 * 		2、可以用来修饰的结构：类、方法
 * 	一、抽象类
 * 		》此类不能实例化
 * 		》抽象类中一定有构造器，便于子类实例化时调用（涉及：子类对象实例化的全过程）
 * 		》开发中，都提供抽象类的子类，让子类实例化操作
 * 
 *  二、抽象方法
 *  	》抽象方法没有方法体
 *  	》只能由抽象类来说明抽象方法
 *  	》抽象类里的所有抽象方法必须都被子类重写一次（只有重载都不行），否则该子类也将会是一个抽象类，因为普通类里面不允许存在抽象方法
 *  	》抽象类里可以有普通方法
 *  
 *  三、注意点
 *  	① abstract不能用来修饰除类与方法之外的结构
 *  	② abstract不能用来修饰私方法、静态方法、final方法
 *  	
 * @author hjj
 * @time 2021年11月13日 下午6:54:44 
 *
 */
public class h_抽象类与抽象方法 {
	public static void main(String[] args) {
		h_t h1 = new h_t();
		h1.test2();
		h1.test1();
	}
}
abstract class h_Test {
	public abstract void test1(String name,int age);
	
	public void test2() {
		System.out.println("抽象方法里也可以定义普通类");
	}
}
class h_t extends h_Test {

	@Override
	public void test1(String name, int age) {
		System.out.println(name+age+"岁了");
	}
	
	public void test1() {
		System.out.println("重载也可以");
	}
	
	

}