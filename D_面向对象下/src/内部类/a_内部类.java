package 内部类;
/**		类的内部成员之五：内部类
 * 	1、Java中允许一个类声明在另一个类的里面，而在里面的类就称之为内部类，外面的类就为外部类
 * 
 * 	2、内部类的分类：成员内部类   or  局部内部类(方法内、代码块内、构造器内)
 * 		内部类作为一个类，它的功能与普通的类大致相同：可以定义属性、方法、构造器等，可以被修饰符修饰
 * 		内部类作为一个成员，它就可以调用外部类的结构
 * 
 * 	一、如何实例化成员内部类的对象
 * 
 *  二、如何在成员内部类中区分调用外部类的结构
 * 		比如调用外部类的name，但是内部类也有个name
 * 		public void getName(String name){
 * 			System.out.println(name);  //就是参数变量name
 * 			System.out.println(this.name);  //就是内部类属性name
 * 			System.out.println(外部类.this.name); 	//就是外部类的属性name
 * 		}
 * 
 *  三、开发中局部内部类的使用
 */
public class a_内部类 {
	public static void main(String[] args) {
		//创建SSR的实例对象（静态的成员内部类）
		a_test.SSR ssr = new a_test.SSR();
		ssr.ssrTest();
		
		//创建非静态的内部类 SS
		a_test test = new a_test();
		a_test.SS ss = test.new SS();
		ss.ssTest();
	}
}

class a_test {
	
	public class SS {
		//成员内部类
		
		public void ssTest() {
			System.out.println("非静态内部类的方法");
		}
	}
	
	static class SSR {
		//静态成员内部类
		
		public void ssrTest() {
			System.out.println("欧皇驾到！");
		}
	}
	
	public void method() {
		//局部内部类  在方法里
		class AA{
			
		}
	}
	
	{
		//局部内部类  在代码块里
		class BB {
			
		}
	}
	
	public a_test() {
		//局部内部类   在构造器里
		class CC {
			
		}
	}
}