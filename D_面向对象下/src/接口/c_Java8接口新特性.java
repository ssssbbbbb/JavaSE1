package 接口;
/**
 * 	JDK8 —— 可以处理定义全局常量和抽象方法之外，还可以定义静态方法、默认方法
 * 
 * @author hjj
 * @time 2021年11月14日 下午12:07:43 
 *
 */
public class c_Java8接口新特性 {
	public static void main(String[] args) {
		imptest i1 = new imptest();
		
//		  i1.method1();  错误
//	一、    接口中定义的静态方法只能由接口来调用
		  c_test.method1();
		  
//  二、    通过实现类的对象，可以调用接口中的默认方法
		//如果实现类重写了接口中的默认方法，调用时，仍然调用的是重写以后的方法
		  i1.method2();
		  
//  三、    如果子类或实现类继承的父类和实现接口中声明了同名同参数的方法，匿名子类在没有重写此方法的情况下，默认调用的是父类中的同名同参的方法 --- 类优先原则
		  
//  四、    如果实现类实现了多个接口，而这多个接口中定义了同名同参数的默认方法，匿名在实现类么有重写此方法的情况下，报错 --- 接口冲突
	}
}

interface c_test {
	static String name = "tom";
	
	public static void method1() {
		System.out.println("静态方法");
	}
	
	public default void method2() {
		System.out.println("默认方法");
	}
	
/*		public void method3() {}
 * 		不能这样写，需要显式的加上	static 和 default
 */
}

class imptest implements c_test {
	
}