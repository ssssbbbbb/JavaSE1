/**
 * 	一、构造器（构造函数、构造方法）constructor
 * 			任何一个类中都有构造器
 * 		1、作用：创建对象
 * 			
 * 		2、说明：如果没有显式的定义类的构造器的话，则系统默认提供一个空参的构造器
 * 
 * 		3、一个类中可以定义多个构造器，彼此构成重载
 * 
 * 		4、一旦我们直接定义了构造器后系统就不会提供默认的空参构造器了，这时如果需要空参构造器就需要自己去定义
 * 
 * @author hjj
 * @time 2021年11月6日 下午4:03:34 
 *
 */
public class h_构造器 {
	public static void main(String[] args) {
		//类  实例对象 = new  构造器();
		
		h_Test h1 = new h_Test();	//这里使用的是空参的构造器来创建的对象
		h1.show();	//输出：null和0
		
		h_Test h2 = new h_Test("Tom",19);	//这里使用的是实参的构造器来创建的对象
		h2.show();	//输出：Tom和19
		
	}
}

class h_Test{
	String name;
	int age;
	
	public h_Test() {
		//空参构造器
		show();
	}

	public h_Test(String name, int age) {
		//实参构造器
		this.name = name;
		this.age = age;
		show();
	}
	
	public void show() {
		System.out.println(name+"和"+age);
	}
	
}