/**
 * 	关键字：final（最终的）
 * 		1、final可以修饰的结构：
 * 			① 类
 * 			② 方法
 * 			③ 变量
 * 	一、final修饰类
 * 		被final修饰的类就不允许被其他类继承更改了，它就是最终的类
 * 		比如：String类、System类、StringBuffer类
 * 		
 *  二、final修饰方法
 *  	表明此方法不可以被重写，但是能被重载
 * 		
 * 三、final修饰变量
 * 		被final修饰的变量就会成为不可变量，也就是常量 
 * 
 * @author hjj
 * @time 2021年11月13日 下午6:17:37 
 *
 */
public class g_final关键字 {
	public static void main(String[] args) {
		b b1 = new b();
		b1.F("重载");
	}
}

final class FinalClass {
	final void F() {
		System.out.println("啊哈！不能被重写");
	}
	
	final void F(String ff) {
		System.out.println("啊哈！但是能被重载");
	}
}
class a {
	final void F() {
		System.out.println("啊哈！不能被重写");
	}
}
class b extends a {
	final void F(String ff) {
		System.out.println("啊哈！但是能被重载");
	}
}