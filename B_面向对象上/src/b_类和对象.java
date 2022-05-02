/**
 * 	一、类（Class）和对象（Object）是面向对象的核心概念
 * 		1、类是对一类事物的描述，是抽象的、概念上的定义
 * 		2、对象是实际存在的该类事物的每个个体，因而也称为实例（instance）
 * 	二、Java类及类的成员
 * 		1、属性：对应类中的成员变量
 * 		2、行为：对应类中的成员方法
 * 	三、类和对象的使用
 * 		1、想要调用类对象的方法和属性，就需要先实例化对象，然后用实例对象去调用。
 * 		2、如果创建了一个类的多个对象，则每个对象都独立的拥有一套类的属性。（非static）
 * 			也就是，一个对象的属性不影响另外一个对象的属性
 * 	四、内存
 * 	stack（栈）
    	存放基本类型的数据和对象的引用，即存放变量。
    	如果存放的是基本类型数据（非静态变量），则直接将变量名和值存入stack中的内存中；
    	如果是引用类型，则将变量名存入栈，然后指向它new出的对象（存放在堆中）。

	heap（堆）
   		存放new产生的数据。
   		
	data segment
   		分为静态域和常量域。
	静态域
   		存放在对象中用static定义的静态成员（即静态变量，同理，如果该静态变量是基本类型则将变量名和值存入静态域，如果是引用类型则指向new出的对象）。
	常量池
   		常量池指的是在编译期被确定，并被保存在已编译的.class文件中的一些数据。除了包含代码中所定义的各种基本类型（如int、long等）和对象型（如String及数组）
   		的常量值(final)还包含一些以文本形式出现的符号引用，比如：类和接口的全限定名；字段的名称和描述符；方法和名称和描述符。

   code segment：存放代码。
   
   五、没有new，就没有创建新的对象出来
 *
 */
public class b_类和对象 {
	public static void main(String[] args) {
		
		Person p1 = new Person();	//这里就是实例化了类对象，成为实例对象
		
		p1.name = "tom";
		p1.age = 15;
		p1.survival = true;
		
		p1.eat();
		p1.talk("英语");
		
		System.out.println(p1);	//Person@123a439b	这个地址指向堆空间中的实体
		
		//创建一个新的对象，然后把p1的地址赋给它，那么它们的属性都将相同，因为它们储存的地址值都一样
		Person p2 = new Person();		//有创建了一个对象，但其属性为空
		System.out.println(p2.name);	//null  此时p2的地址指向的堆空间里还未添加任何值，因此p2.name为null
		p2 = p1;
		System.out.println(p2.name);	//tom  此时，已经经过赋值操作把p1里的地址赋给了p2，因此p2也指向了p1指向的堆空间了
		
	}
}
//人类
class Person{
	//属性
	String name;
	int age;
	boolean survival; //活的吗
	
	//方法
	public void eat() {
		System.out.println(name+"吃饭！");
	}
	
	public void talk(String language) {	//定义方法，和参数
		System.out.println("说话，用的是"+language);
	}
	
	
}