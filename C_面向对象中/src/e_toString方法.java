/**
 * 	一、toString()方法的使用
 * 		概述：toString() 方法返回指定对象的字符串形式。
 * 		
 * 		1、当我们输出一个对象的引用时，实际是就是调用当前对象的toString()
 * 			System.out.println(对象);   等于   System.out.println(对象.toString);
 * 
 * 		2、Object类中，toString()的定义
 * 
 * 			   public String toString() {
        			return getClass().getName() + "@" + Integer.toHexString(hashCode());
    		   }
 * 		
 * 		3、像String类、Data类、File类、包装类等都重写了Object类中的toString方法。
 * 			使得在调用对象的toString方法时，返回“实体内容”信息(自己想要的内容)。
 * 
 * 		4、自定义类也可以重写toString方法，当调用此方法时，返回对象的“实体内容”。
 * 
 * @author hjj
 * @time 2021年11月11日 下午6:10:58 
 *
 */
public class e_toString方法 {
	public static void main(String[] args) {
		Atest a1 = new Atest();
		
		System.out.println(a1);	 //Atest@123a439b
		System.out.println(a1.toString());	//Atest@123a439b
		
		e_test test1 = new e_test();
		
		System.out.println(test1.toString());
		
	}
}
 class Atest {
	 String name = "aa";
	 int age = 1;
	 
	 public void AA() {
		 System.out.println("AAAAAAA");
	 }
 }
 
//重写Object内的toString方法，使其输出自己想要的数值。
class getStringTest {
	
	@Override
	public String toString() {		
		return getClass().getName() +"  " + getClass(); 
	}
}
 
 class e_test extends getStringTest {
	 String name = "SB";
	 int age = 20;
 }
 
 
 
 
 
 
 
 