package 包装类;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
class a_包装类的使用Test {

	//基本数据类型 --> 包装类   调用包装类的构造器，然后把基本数据类型作为参数
	@Test
	public void test1() {
	//方法1	包装类构造器参数为变量名
		int num1 = 10;
		// System.out.println(in1.toString()); 错误！变量in1不能调用toString()
		Integer in1 = new Integer(num1);
		System.out.println(in1.toString());
	//方法2  包装类构造器参数转换为基本数据类型值
		Boolean bool1 = new Boolean("tRuE");	//布尔类型的参数无视字符串大小写，是true就是true
		System.out.println(bool1.toString());	//true
		
		Boolean bool2 = new Boolean("true12345");	//如果构造器参数后面的不是true或者false则就默认为false
		System.out.println(bool2);	//false
	}
	
	//包装类 --> 基本数据类型   调用包装类的xxxValue(),然后把值赋给变量
	@Test
	public void test2() {
		Integer in1 = new Integer(20);
		int i1 = in1.intValue();
		System.out.println(i1 + 10);		//30
		
		Double dou1 = new Double(3.14);
		double d1 = dou1.doubleValue();
		System.out.println(d1 + 2);			//5.140000000000001
	}

}
