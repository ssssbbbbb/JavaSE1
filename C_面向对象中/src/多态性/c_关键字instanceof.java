package 多态性;
/**
 * 	关键字instanceof的使用：
 * 		A instanceof B
 * 	检验 对象A 是否为 class B 的对象，返回值为boolean类型。
 * 	》 要求A所属的类与 类B 必须是子类和父类的关系，否则编译错误。
 * 	》 如果A属于 类B 的子类0， 那么输出的值也为true。
 * @author hjj
 * @time 2021年11月9日 下午9:40:16 
 *
 */
public class c_关键字instanceof {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		System.out.println(a instanceof A);	//true
		// System.out.println(b instanceof A);	报错
		System.out.println(c instanceof A);	//true
		System.out.println(a instanceof C);	//false
		//父类new的对象不属于子类的对象，子类new的对象属于父类的对象
		
		A a2 = new C();
		//C c2 = new A();  报错，多态只能 父类对象 new子类
		System.out.println(a2 instanceof A);	//true
		
	}
}

class A {
	
}

class B {
	
}

class C extends A {
	
}
