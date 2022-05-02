/**
 * 	一、继承格式
 * 		class 子类 extends 父类{...}
 * 		
 * 		1、子类 又称 —— 派生类、subclass
 * 		2、父类 又称 —— 超类、基类、superclass
 * 
 * 	二、继承性		
 * 		1、一旦子类继承了父类，那么子类就获取了父类中声明的结构、属性、方法
 * 			但如果，父类的属性或者方法被标明私有化后，子类仍然继承了父类的该属性或方法（构造器方法也是方法），只是子类无法直接调用。
 * 		2、继承完父类后，子类还能创建自己独特的属性或方法
 * 		3、一个子类只能有一个父类
 * 		4、一个父类可以派生出多个子类
 * 		5、子类可以直接继承父类，也可以间接继承父类
 * 			比如，先声明class A，然后Class B继承A，这就是直接继承，称为直接父类
 * 			如果是再声明一个Class C，然后C再继承B，这就是间接继承A，称为间接父类
 * 	三、Object类	Java.lang.Object
 * 		Object是所有类的父类，它是最顶级的类，所有类都是它的子类，直接或间接的继承它
 * 
 * 	四、方法的重写（override/overwrite）
 * 		1、在重写方法时，需要遵循以下的规则：
	(一) 父类方法的参数列表必须完全与被子类重写的方法的参数列表相同，否则不能称其为重写而是重载。
	(二) 父类的返回类型必须与被子类重写的方法返回类型相同，否则不能称其为重写而是重载。
	(三) Java中规定，被子类重写的方法不能拥有比父类方法更加严格的访问权限。编写过Java程序的人就知道，父类中的方法并不是在任何情况下都可以重写的，
	 	当父类中方法的访问权限修饰符为private时，该方法只能被自己的类访问，不能被外部的类访问，在子类是不能被重写的。如果定义父类的方法为public，
	 	在子类定义为private，程序运行时就会报错。
	(四) 由于子类的访问权限修饰符的限制一定要大于需要重写的父类方法的访问权限修饰符，而private权限最小。所以如果某一个方法在父类中的访问权限是private，
	 	那么就不能在子类中对其进行重写。如果重新定义，也只是定义了一个新的方法，不会达到重写的效果。
	(五) 在继承过程中如果父类当中的方法抛出异常，那么在子类中重写父类的该方法时，也要抛出异常，而且抛出的异常不能多于父类中抛出的异常(可以等于父类中抛出的异常)。
	 	换句话说，重写方法一定不能抛出新的检查异常，或者比被重写方法声明更加宽泛的检查型异常。
 * 
 * 	    2、重写后，子类对象执行的方法就是子类重写后的方法了
 		3、子类和父类中的同名同参数的方法妖媚搜声明为非static方法（可以重写），要么都声明为static的方法（不是重写）
 * 
 * @author hjj
 * @time 2021年11月8日 下午6:25:42 
 *	
 *	class b_ren 人类	  --->	class b_students 学生类    --->     class b_Yi 小学生类
 *	
 */
public class b_继承 {
	public static void main(String[] args) {
		b_students s1 = new b_students("tom", 20);
		s1.eat();
		//s1.ZhongZhu;	私有属性不可直接调用
		
		//父类的属性或者方法被标明私有化后，子类仍然继承了父类的该属性或方法，只是子类无法直接调用
		s1.setZhongzu("火星族");
		System.out.println(s1.getZhongZu());
		
		//b_ren 就是 b_Yi 的间接父类，间接父类也继承了它所有父类的属性和方法
		b_Yi y1 = new b_Yi("SB", 10);
		y1.eat();
		y1.setZhongzu("月球人");	//b_ren的方法
		y1.setID("2022_10_1000");//b_Students的方法
	}
}

class b_ren{
	String name;
	int age;
	private String ZhongZu;	//种族
	
	public b_ren(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void eat() {
		System.out.println("吃东西");
	}
	
	public void setZhongzu(String ZhongZu) {
		this.ZhongZu=ZhongZu;
	}
	public String getZhongZu() {
		return ZhongZu;
	}
	
}

class b_students extends b_ren{
	private String ID;
	
	public b_students(String name, int age) {
		super(name, age);
		
	}
	// 重写方法
	@Override
	public void eat() {
		System.out.println("学生吃东西");
	}
	
	public void setID(String ID) {
		this.ID=ID;
	}
	public String getID() {
		return ID;
	}
	
}

class b_Yi extends b_students{

	public b_Yi(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void eat() {
		System.out.println("小学生吃东西");
	}
	
}