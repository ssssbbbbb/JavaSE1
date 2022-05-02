package 包装类;
/*	方法1的局限性：无法转换包装类
 * 
 */
public class c_包装类转换String {
	public static void main(String[] args) {
//一、基本属性类型、包装类 --> String类型    调用String重载的valueOf(Xxx xxx)
		
		//方法1:连接运算
		int num1 = 10;
		String str1 = num1 + "";
		System.out.println(str1);
		
		//方法2:调用valueOf(Xxx xx)方法
		float f1 = 12.3f;
		String str2 = String.valueOf(f1);
		System.out.println(str2);
		
		Double dou1 = new Double(3.14);
		String str3 = String.valueOf(dou1);
		System.out.println(str3);
		
//二、String类型 --> 基本属性类型、包装类    调用包装类的parseXxx(String s)
		String s1 = "123";
		int int1 = Integer.parseInt(s1);	//先把String转化为基本数据类型所对应的包装类，再利用自动拆箱 把值赋给基本数据类型变量
		System.out.println(int1);
		//注意数据类型之间的转换关系！
	}
}
