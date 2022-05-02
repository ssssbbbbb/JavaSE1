package 多态性;
/**
 * 	一、多态性
 * 		1、何为多态性
 * 			对象的多态性：父类的引用指向子类的对象（子类的对象赋给父类的引用）
 * 			》 可以直接应用在抽象类和接口上
 * 		2、多态性的使用：虚拟方法调用
 * 			》 有了对象的多态性以后，我们在编译期只能调用父类中声明过的方法，但在运行期实际指向的是子类重写父类的方法。
 * 			总结：编译时，看左边是否有；运行时，看右边什么样
 * 		3、多态性的使用前提：
 * 			① 需要继承关系
 * 			② 方法需被的重写
 * 
 * 	正因为Java里的多态，才使得创建任何一个类时，都能使用Object类的方法		
 * 
 * 	二、类的强制转换
 * 		根据多态性可知，父类对象无法调用子类特有的属性和方法。
 * 		而在Java中只能从下而上，从子类转换为父类对象	farther = son	[错误：son = father]  
 * 		但如果还是需要使用，那就可以将父类的对象强制转换为子类的对象。	son = (son)father
 * 
 * @author hjj
 * @time 2021年11月9日 下午8:27:53 
 *	创建类   a_Person
 *	方法    eat()、walk()、test()
 *	
 *
 *	创建类  Man extends a_Person
 *	方法    earMoney()、test()
 *	重写方法 eat()、walk()
 *
 *
 *	创建类  Woman extends a_Person
 *	方法   goShopping()、test()
 *	重写   eat()、walk()
 */
public class a_多态 {
	public static void main(String[] args) {
// 一般来说 声明对象是这样的 ------------------------------------------
		a_Person p1 = new a_Person();
		p1.eat();
		
		Man man = new Man();
		man.eat();
		man.age=25;
		man.earMoney();
		System.out.println(man.name);	//男人  类Man里的属性name默认值为“男人”
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
// 而多态性是这样的 --------------------------------------------------
		//1、对象的多态性：父类的引用指向子类的对象
		a_Person p2 = new Man();
		System.out.println(p2.name);	//null ，在Man里属性name的默认值为 “男人”，但这里输出的默认值为null，这说明调用的还是父类里的属性值
		
		a_Person p3 = new Woman();
		
		//多态的使用:当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法。	
		p2.name="tom";
		p2.eat();	// 男人要吃多点饭
		p2.test();	// tom---class 多态性.Man
		//根据test方法可以看出，实际上多态就是，使用声明类[a_Person]的属性，调用创建类[new Man()]的方法结构-----父类属性，调用重写后的子类方法
		//p2.isSmoking = true;
		//p2.earMoney();	子类特有的方法和属性就不能调用

// 将父类的对象强制转换为子类的对象。	son = (son)father -------------------
		System.out.println(p2.getClass());	//class 多态性.Man
		System.out.println(p2.name);		//tom
		
		Man m = new Man();
		m = (Man)p2;
		System.out.println(m.isSmoking);	//false
		System.out.println(m.getClass());	//class 多态性.Man
		System.out.println(m.name);			//男人
		m.eat();							//男人要吃多点饭
	}
}

class a_Person{
	String name;
	int age;
	
	public void eat() {
		System.out.println("人要吃饭");
	}
	
	public void walk() {
		System.out.println("人走路");
	}
	
	public void test() {
		System.out.println(name+"---"+this.getClass());
	}
}

class Man extends a_Person{
	String name = "男人";
	boolean isSmoking;
	
	public void earMoney() {
		System.out.println("男人挣钱养家");
	}

	@Override
	public void eat() {
		System.out.println("男人要吃多点饭");
	}

	@Override
	public void walk() {
		System.out.println("男人大步走路");
	}
	
	public void test() {
		super.test();
	}
}
	
class Woman extends a_Person{
	String name = "女人";
	boolean isBeauty;
	
	public void goShopping() {
		System.out.println("女人喜欢购物");
	}
	
	@Override
	public void eat() {
		System.out.println("女人要吃少点饭");
	}
	
	@Override
	public void walk() {
		System.out.println("女人小步走路");
	}
	
	public void test() {
		super.test();
	}
}
	