package 包装类;
/**
 * 	自动装箱： 当我们把一个基本类型的值（ 20），赋值给引用变量时候，系统可以 自动将它“包装”为相应的包装类的实例程序需要对象时， 
 * 			如果给的只是一个基本类型的值， 系统会将它自动装箱为包装类的实例达到的效果： 有了自动装箱之后， 基本类型的值可以当成对象用—— 其实是【假相】 。
 * 
    自动拆箱： 当我们需要一个基本类型的值时， 但实际上传入的包装类的对象。 系 统会自动把对象“剥”开，得到它的值。 
    		达到的效果： 有了自动拆箱之后， 包装类的对象可当成基本类型的值 用——其实是【假相】 。
 * @author hjj
 * @time 2021年11月11日 下午9:44:00 
 *
 */
public class b_自动装箱和自动拆箱 {
	public static void main(String[] args) {
		
		//自动装箱    基本数据类型 --> 包装类
		int num1 = 10;
		Integer in1 = num1;	
		System.out.println(num1 == in1.intValue());		//true
		
		//自动拆箱    包装类 --> 基本数据类型
		int num2 = in1;
		System.out.println(num2 == in1.intValue());		//true
		
	}
}
