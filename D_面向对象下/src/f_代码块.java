/**
 * 	类的成员之四：代码块（或初始化块）
 * 		
 * 			1、代码块的作用：用来初始化类和对象
 * 			2、代码块只能缺省或者被static修饰
 * 			3、分类： ① 静态代码块    
 * 						》随着类的加载而执行
 * 						》只会执行一次
 * 						》作用：初始化类的信息
 * 					② 非静态代码块
 * 						》随着对象的创建而执行
 * 						》每创建一次对象就执行一次
 * 						》作用：可以在创建对象时，对对象的属性等结构进行初始化
 * 			4、代码块可以定义多个，执行顺序就是定义代码块的顺序
 * 				静态代码块内只能调用静态的属性、静态的方法，不能调用非静态结构
 * @author hjj
 * @time 2021年11月13日 下午5:44:54 
 *
 */
public class f_代码块 {
	public static void main(String[] args) {
		System.out.println(Person.desc);	//其它的结构是需要类或对象来调用才能执行的，而静态代码块能随着类的加载而执行
		/*	输出
		 * 
		 * 	静态代码块
		 *  老子是人
		 */
		
		Person p1 = new Person("SB",250);	//在之前，这种发生在创建对象时就能自动执行的语句只有在构造器里才能实现，而代码块却是能够随着对象的加载而执行
		/*	输出
		 * 
		 *  代码块
		 * 	构造对象成功
		 */
		Person p2 = new Person("SB",250);
	}
}

class Person {
	//属性
	String name;
	int age;
	static String desc = "老子是人";
	
	//构造器
	public Person() {
		
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("构造对象成功");
	}
	
	//代码块
	{
		System.out.println("代码块");
	}
	static {
		System.out.println("静态代码块");
	}
	
	//方法
	public void eat() {
		System.out.println("人吃饭");
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name +", age="+ age + "]";
	}
}