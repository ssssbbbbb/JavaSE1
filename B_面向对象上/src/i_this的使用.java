/**
 * 	一、this是什么？
 * 		this表示当前对象，可以调用类的属性、方法和构造器
 * 		》 它在方法内部使用，即这个方法所属对象的引用
 * 		》 它在构造器内部使用，表示该构造器正在初始化的对象
 * 	二、使用场景
 * 		1、当在方法内需要用到调用该方法的对象是，就用this。
 * 		2、可以使用this来区别局部变量和属性，比如：this.name = name;
 * 		3、如果方法的形参和类的属性同名是，我们必须显式的使用this，表面这是属性不是形参
 * 
 * 	三、this调用构造器
 * 		1、在类的构造器中，可以显式的使用 this(形参列表) 的方式，调用本类中指定的其他构造器
 * 		2、构造器中不能通过 this(形成列表) 的方式调用自己
 * 		3、必须声明在首行
 * @author hjj
 * @time 2021年11月6日 下午4:25:33 
 *
 */
public class i_this的使用 {
	public static void main(String[] args) {
		i_Test i1 = new i_Test();
		/*	输出：
		 * 	构造器1
		 * 	构造器2
		 * 	构造器3
		 * 
		 * 	说明，构造器之间的互相调用。其他构造器里就不能调用空参构造器了，
		 * 		因为空参构造器调用了构造器2，而构造器2调用了构造器3，如果构造器3再调用空参构造器。
		 * 		那么，最后空参构造器就会调用到自己，然后报错。
		 */
	}
}

class i_Test{
	int a;
	int b;
	int c;
	
	public i_Test() {
		this(100);
		System.out.println("构造器1");
		
	}
	public i_Test(int a) {
		this(100,200,300);
		this.a=a;
		System.out.println("构造器2");
	}
	//方法的重载与参数名称无关，重载的是类型与参数列表的数量
	public i_Test(int a,int b,int c) {
		
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println("构造器3");
	}
	
}
