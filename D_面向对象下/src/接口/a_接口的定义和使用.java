package 接口;
/**
 * 	接口的使用和定义
 * 		1、接口使用interface来定义
 * 		2、Java中，接口和类是并列的两个结构
 * 		3、如何定义接口：定义接口中的成员
 * 			3.1 JDK8:  》全局常量：public static final XXX		在书写时可以省略前面的修饰符关键字，但他们的作用还在，也就是在接口中声明的属性和值都没人为全局常量。
 * 					   》处理定义全局常量和抽象方法之外，还可以定义静态方法、默认方法			在书写时也可以省略前面的修饰符关键字
 * 		4、接口中不能定义构造器！意味着接口不可以初始化
 * 
 * 		5、在Java开发当中，接口通过类去实现(implements)的方式来使用
 * 			- 如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
 * 			- 如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍为一个抽象类、
 * 
 * 		6、Java类可以实现多个接口 --- 弥补了Java单继承性的局限性
 * 			Java可以边继承边实现
 * 			class ClassName extends FatherClass implements inter1,inter2,inter3...
 * 		
 * 		7、接口与接口之间可以继承，并且可以多继承
 * 
 * 		8、   ① 接口的具体使用，体现了多态性  ② 接口实际上可以看做是一种规范
 * @author hjj
 * @time 2021年11月13日 下午9:02:26 
 *
 */
public class a_接口的定义和使用 {
	public static void main(String[] args) {
		
		TestImp test1 = new TestImp();
		//创建了接口的非匿名实现类的非匿名对象
		Tests tests = new Tests();
		test1.printTest(tests);
		
		//创建类接口的非匿名实现类的匿名对象
		test1.printTest(new Tests());
	}
}

interface a_Test {
	//全局常量
	public static final int MAX_SPEED = 7900;	//最大速度
	int MIN_SPEED = 1;		//最小速度
	
	//抽象方法
	public abstract void fly();	
	void stop();
}
interface a_Test2 {
	void test1();
}

class TestImp implements a_Test,a_Test2 {

	@Override
	public void fly() {
		System.out.println("芜湖！起飞！");
		
	}

	@Override
	public void stop() {
		System.out.println("停止！");
		
	}

	@Override
	public void test1() {
		System.out.println("多继承，这是另外一个接口的抽象方法，如果有一个抽象方法没有重写，则此类就必须被声明为抽象类");
		
	}
	
	public void printTest(TestImp test) {
		test.fly();
		System.out.println("一小时后");
		test.stop();
	}
}

class Tests extends TestImp {

	@Override
	public void test1() {
		// TODO 自动生成的方法存根
		super.test1();
	}
	
}








