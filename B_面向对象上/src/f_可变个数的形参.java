/**
 * 	可变个数的形参 —— 可变形参
 * 		1、格式
 * 			权限修饰符 返回类型 方法名(数据类型... 变量名)
 * 		2、可变参数指的是参数个数可变，而不是类型可变。
 * 		3、可变参数的参数可以是0个，也可以是无数个。
 * 		4、方法 tests 的变量参数类型 String 必须是最后一个参数
 * 		5、其实可变参数的参数类型就是一个数组，如：调用tests(String... strs)方法的第18行
 * 			在可变参数方法中，打印了该方法的方法名，输出的是地址值，这说明，可变参数就是一个数组里储存则一组参数。
 * 		
 * @author hjj
 * @time 2021年11月6日 下午2:01:43 
 *
 */
public class f_可变个数的形参 {
	public static void main(String[] args) {
		test t1 = new test();
		
		t1.tests();
		t1.tests("一","二","三");		//[Ljava.lang.String;@123a439b
		t1.tests(0, "一","二","三");	//一 二 三 
		
		t1.testss(1,2,3,4,4,5,65,6);
	}
}

class test{
	public void tests(){
		System.out.println("一般的方法");
	}
	
	public void tests(String... strs) {
		System.out.println("可变参数的方法");
		System.out.println(strs);
	}
	
	public void tests(int i, String... strs) {
		for (i=0; i<strs.length; i++) {
			System.out.println(strs[i]+" ");
		}
	}
	
	public void testss(int...is ) {
		System.out.println("int类型可变参数");
	}
}