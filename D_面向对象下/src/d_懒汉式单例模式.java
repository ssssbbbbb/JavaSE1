
public class d_懒汉式单例模式 {
	public static void main(String[] args) {
		dTest t1 = dTest.getMyObject();
		dTest t2 = dTest.getMyObject();	
		System.out.println(t1 == t2);				//true
		System.out.println("t1: "+t1+"    t2: "+t2);//t1: dTest@123a439b    t2: dTest@123a439b

		
		//如果没有判断语句来控制对象的初始化，让该方法随便创建新的对象，那这种设计模式就是多此一举了
		dTest t3 = dTest.getMyObject_2();
		dTest t4 = dTest.getMyObject_2();
		System.out.println(t3 == t4);				//false
		System.out.println("t3: "+t3+"    t4: "+t4);//t3: dTest@7de26db8    t4: dTest@1175e2db
	}
}

class dTest {
	//① 私有化类的构造器
	private dTest() {
		
	}
	
	//② 声明当前类的对象，没有初始化---记得static修饰，因为要在静态方法里调用
	private static dTest TestObject = null;
	
	//③ 声明公共的静态方法，用来返回当前类的对象
	public static dTest getMyObject() {
		if (TestObject == null) {		//先判断该对象是否初始化了，如果没初始化就new一下
			TestObject = new dTest();			
		}
		return TestObject;				//如果之前就已经初始化过了，就不new了，直接返回之前初始化过的对象
										//这样的分支结构是保证此单例模式只创建了一个对象，如果调用一次此方法就new一次的话就不止一个对象了，就不叫单例模式了
	}
	
	//如果没有判断语句来控制对象的初始化，让该方法随便创建新的对象，那这种设计模式就是多此一举了
	public static dTest getMyObject_2() {
		TestObject = new dTest();			
		return TestObject;				
									
	}
}