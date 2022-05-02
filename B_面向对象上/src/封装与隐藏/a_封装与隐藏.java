package 封装与隐藏;
/**
 * 	⭐ 把该隐藏的隐藏起来，该暴露的暴露出来。这就是封装性的设计思想。
 * 
 * 	对象属性的初始化使用构造函数，对象的属性设置和查看输出使用set和get方法
 * 
 * 	Java规定的4种权限（从小到大）：private、缺省、protected、public。
 * 		1、public是公共的，被public所修饰的成员可以在任何类中都能被访问到。
 * 		2、protected是受保护的，受到该类所在的包所保护，只能在该类所在的包中被调用。
 * 		3、default(默认的)，也被称为friendly(友好的)。
 * 		4、private是私有的，即只能在当前类中被访问到，它的作用域最小。
 * 
 * @author hjj
 * @time 2021年11月6日 下午3:40:43 
 *
 */
public class a_封装与隐藏 {
	public static void main(String[] args) {
		ren r1 = new ren("杨戬",22000,3);
		
		r1.show();
	}
}

class ren{
	private String name;
	private int age;
	private int eye;
	
	public ren() {
		//构造器
	}
	
	public ren(String name, int age, int eye) {
		//构造函数（构造器）
		this.name = name;
		this.age = age;
		this.eye = eye;
	}
	
	//私有属性，都以set()来设置，get()来输出
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEye() {
		return eye;
	}
	public void setEye(int eye) {
		this.eye = eye;
	}
	
	public void show() {
		System.out.println(getName() + "今年" + getAge() + ",它有" + getEye() + "只眼睛");
	}
	
	
}