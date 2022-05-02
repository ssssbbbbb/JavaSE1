/**
 * 	一、super关键字的使用
 * 		1、super理解为：父类的
 * 		2、super可以用来调用：属性、方法、构造器
 * 	
 * 	二、super调用属性和方法
 * 		1、我们可以在子类的方法或构造器中，通过使用“super.属性”或“super.方法”的方式，显式的调用父类中声明的属性或方法。但是，通常情况下我们习惯省略 super
 * 		2、当子类和父类中定义了同名的属性时，我们要想在子类中调用父类中声明的属性，则必须是显式的使用“super.属性”的方式，表明调用的是父类中声明的属性。
 * 		3、当子类重写了父类中是方法以后，我们想在子类的方法中调用父类被重写的方法是，则必须显式的使用 super.方法 的方式，表面调用是是夫类中被重写的方法。
 *	
 * 	三、super调用构造器
 * 		1、我们可以在子类的构造器中显式的使用“super(形参列表)”的方式
 * 		2、“super(形参列表)”的使用，必须说明在子类构造器的首行！
 * 		3、我们在类的构造器中，针对于“this(形参列表)”或“super(形参列表)”只能二选一，不能同时出现
 * 		4、在构造器首行，没有显式的声明 “this(形参列表)” 或 “super(形参列表)” ，则默认调用的是父类中空参的构造器
 * 		5、在类的构造器中，至少有一个类构造器使用了super()
 * 
 * 		super只能调用名字和结构但不能调用值
 * @author hjj
 * @time 2021年11月8日 下午7:49:28 
 *
 */
public class c_super关键字 {
	public static void main(String[] args) {
		c_Person p1 = new c_Person("大A",30);
		p1.eat();	//大A吃东西
		p1.show();	//大A今年30
		
		c_Students s1 = new c_Students("小a",10,100000);
		s1.eat();	//小a学生吃东西
		
		s1.show();	//	小a今年10,要上学，学号是0
					//	小a今年10
					//  小a10
					//  小a今年10
/*	在学生类里重写了Person类里的show()方法,然后又在学生类里的show()里  调用了Person类的show(),也就是重写前的show()方法
 * 
	@Override
	public void show() {
		System.out.println(name+"今年"+age+",要上学，学号是"+ID);
		super.show();
		System.out.println(super.name+super.age);
		super.show(super.name,super.age);
	}
	
	在重写后的方法里的super.show();就相当于调用了重写前的show()方法，也就是父类里的方法，但是方法里的属性调用还是此对象的属性，即使参数使用super关键字调用了属性。
	
	结论：如果想在子类里调用父类的属性去使用重写前父类的方法，就需要显式的初始化父类然后使用其属性
*/
		
		c_Students s2 = new c_Students("小b");
		s2.eat();	//小b学生吃东西
		/*	使用的构造器是这种
		 * 	public c_Students(String name) {
			super.name=name;
			} 	
		 */
	}
}

class c_Person{
	String name = "成年人";
	int age = 1000;
	
	public c_Person() {
		System.out.println("父类构造器");
	}
	
	public c_Person(String name) {
		this.name = name;
	}
	
	public c_Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println(name+"吃东西");
	}
	
	public void work() {
		System.out.println(name+"工作");
	}
	
	public void show() {
		System.out.println(name+"今年"+age);
	}
	//重载方法，由于实验在子类中如何使用super调用父类的方法使用父类的属性
	public void show(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println(name+"今年"+age);
	}
}

class c_Students extends c_Person{
	int ID;


	public c_Students(String name, int age,int ID) {
		this.name=name;
		this.age=age;
		this.ID=ID;
		
	}

	public c_Students(String name) {
		super.name=name;
		
	}

	@Override
	public void eat() {
		System.out.println(name+"学生吃东西");
	}
	
	public void XX() {
		System.out.println("学生学习去");
	}
	
	@Override
	public void show() {
		System.out.println(name+"今年"+age+",要上学，学号是"+ID);
		super.show();
		System.out.println(super.name+super.age);
		super.show(super.name,super.age);
		System.out.println(this.name == super.name);	//true
	}
}