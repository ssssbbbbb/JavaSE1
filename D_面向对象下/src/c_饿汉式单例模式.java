
public class c_饿汉式单例模式 {
	public static void main(String[] args) {
		cTest t1 = cTest.getMyTest();
		cTest t2 = cTest.getMyTest();
		
		System.out.println(t1 == t2);
		System.out.println("t1 : "+t1+"   t2 : "+t2);	// t1 : cTest@123a439b   t2 : cTest@123a439b
		
		/*	单例模式就是程序只创建一个对象，而如果需要在外部调用此对象，则就需要用返回对象的方法，把对象地址值赋给外面的特殊变量即可
		 * 	cTest t1 = cTest.getMyTest();		
		 * 	这句就是把在类里面创建的对象的地址值赋给 t1 ，然后通过 t1 来操作该对象所指向的内存里的结构和值
		 */
	}
}

class cTest {
	//① 私有化类的构造器---作用：不允许从外部创建对象
	private cTest() {
		
	}
	
	//② 在内部创建静态的类的对象---因为生成对象的方法是静态方法，而静态方法里只能调用静态的方法和属性，因此在这创建的对象也必须要被static修饰
	private static cTest TestObject = new cTest();		//TestObject	在内部创建的对象名
	
	//③ 提供公共静态方法，返回类的对象---因为没有对象就只能用类来调用此方法，而类可调用的方法则就需要用static修饰
	public static cTest getMyTest() {
		return TestObject;
	}
}