/**
 * 	一、 equals()的使用
 * 		boolean 	equals​(Object obj) 	  某个其他对象是否“等于”此对象。
 *  
 * 		对象1.equals(对象2)
 * 
 * 	二、 == 与 equals方法 的区别
 * 		
 * 	
 * @author hjj
 * @time 2021年11月9日 下午10:18:20 
 *
 */
public class d_equals {
	public static void main(String[] args) {
		double d1 = 3.0;
		int i1 = 3;
		System.out.println(d1 == i1);		//true
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		System.out.println(a.age == b.age);	//true
		System.out.println(b.age == c.age);	//true
		System.out.println(a.age == c.age);	//true	
		System.out.println(a.equals(b));	//false
		System.out.println(a.equals(c));	//false
		System.out.println(b.equals(c));	//false
		// System.out.println(a == b);	错误：操作数类型 A 和 B 不兼容
		System.out.println(a == c);			//false

		System.out.println("-------------------------------------");
		
		A a2 = new A();
		B b2 = new B();
		C c2 = new C();
		
		System.out.println(a == a2);		//false
		System.out.println(b == b2);		//false
		System.out.println(c == c2);		//false
		System.out.println(a.equals(a2));	//false
		System.out.println(b.equals(b2));	//false
		System.out.println(c.equals(c2));	//false
		
		System.out.println("-------------------------------------");
		
		A a3 = new C();
		
		System.out.println(a.equals(a3));	//false
		System.out.println(a == a3);		//false
		System.out.println(c.equals(a3));	//false
		System.out.println(c == a3);		//false
		
		a = c;		//把对象c的地址值赋给对象a
		System.out.println(a == c);			//true
		System.out.println(a.equals(c));	//true
		
		System.out.println("--------------------------------------");
		System.out.println(a3+"  "+a2);		//C@7de26db8  A@1175e2db
		System.out.println(a+"  "+c);		//C@36aa7bc2  C@36aa7bc2
		//实际上，对象跟对象比的是地址值
	}
}
class A{
	int age = 100;
}

class B{
	int age = 100;
}

class C extends A{
	int age = 100;
}