/**
 * 	方法的重载(overload)
 * 		1、定义：在同一个类中，允许存在一个以上的同名方法，只要它们的参数或者参数类型不同即可。
 * 
 * 		一、重载(Overload)
			重载(overloading) 是在一个类里面，方法名字相同，而参数类型与数量不同。返回类型可以相同也可以不同。
			每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表。
			最常用的地方就是构造器的重载。
		二、重载规则:
			① 被重载的方法必须改变参数列表(参数个数或类型不一样)；
			② 被重载的方法可以改变返回类型；
			③ 被重载的方法可以改变访问修饰符；
			④ 被重载的方法可以声明新的或更广的检查异常；
			⑥ 方法能够在同一个类中或者在一个子类中被重载。
			⑦ 无法以返回值类型作为重载函数的区分标准。
 * 		三、调用指定重载方法
 * 			根据方法名和指定的参数，调用指定的重载方法.
 * 
 *	注意：如果重载方法时，只是改变了方法的参数名而不是参数类型和参数数量，则不视为重载方法
 */
public class e_方法的重载 {
	public static void main(String[] args) {
		testOverload t1 = new testOverload();
		//test(int i, double d)	这里的参数必须要明确，否则如果传入的参数是（1，1），那么编译器不会将他们转化为浮点数，而是会自动将此方法视为  test(int i, int i2)。
		t1.test(1,1.0);
		
		t1.test(1, 1);
		
		//局部方法private String test(String s1, String s2)，要想在main函数里调用，就需要在该类里面创建一个调用方法
		System.out.println(t1.testPrivate());
	}
}

class testOverload{
	String name;
	
	public testOverload() {
		//构造器
	}
	public testOverload(String name) {
		//重载构造器二
		this.name=name;
	}
	
	
	public void test() {
		System.out.println("快来重载我");
	}
	
	public void test(int i, double d) {		//① 被重载的方法必须改变参数列表(参数个数或类型不一样)；
		
		System.out.println(i+d);
	}
	
	public int test(int i, int i2) {		//② 被重载的方法可以改变返回类型；
		return i+i2;
	}
	
	private String test(String s1, String s2) {		//③ 被重载的方法可以改变访问修饰符；
		System.out.println("参数和方法类型还有方法体都改变了");
		return s1+s2;
	}
	public String testPrivate() {
		return test("1","2");
	}
}