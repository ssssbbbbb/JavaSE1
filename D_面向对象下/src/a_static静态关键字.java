/**
 * 	static关键字的使用
 * 
 * 	① static  静态的
 * 	② static可以用来修饰：属性、方法、代码块、内部类
 * 	③ static修饰的方法里不能使用this和super关键字
 * 	
 * 	一、使用static修饰属性
 * 		1、属性安装是否被static修饰，分为	① 静态属性(静态变量)	② 非静态属性(实例变量)
 * 		
 * 		2、静态属性（变量）：如果一个类中声明了一个静态属性，创建了多个对象后，如果有一个对象更改了它的静态属性值后，其它对象的静态属性的值也会跟着变化。
 * 		
 * 		3、static修饰属性的其它说明：
 * 			① 静态变量随着类的加载而加载：创建对象前需要把类加载到内存中调用构造器，而静态变量就是在这个时候加载存在的
 * 			② 静态变量的加载要早于对象的创建：普通变量就是在对象的加载过程中或加载后而加载的
 * 			③ 静态变量可以直接用类去调用：ClassName.StaticValue
 * 			④ 由于类只会加载一次，则静态变量在内存中也只会存在一份
 * 
 * 	二、使用static修饰方法
 * 		① 随着类的加载而加载
 * 
 * 		② 静态方法中，只能调用静态的方法或属性  详细看59-66行
 * 	
 * 	
 * 
 * 
 * @author hjj
 * @time 2021年11月13日 下午4:05:09 
 *
 */
public class a_static静态关键字 {

	public static void main(String[] args) {
		
		Chinese c1 = new Chinese("李大牛",28);
		System.out.println(c1.nationality);
		
		Chinese c2 = new Chinese("王小虎",25);
		System.out.println(c2.nationality);
		
		//equalsIgnoreCase() 方法用于将字符串与指定的对象比较，不考虑大小写。
		System.out.println(c1.nationality.equalsIgnoreCase(c2.nationality));
		
		c1.show(c1.name, c1.age);
	}

}

class Chinese {
	String name;
	int age;
	// nationality 国籍
	static String nationality = "中国";
	
	public Chinese(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//不能对非静态属性进行静态引用，因此这里的参数就不是类的属性，而是一个叫name的字符串变量		name!=this.name  name=String.name
	public static void show(String name,int age) {
		System.out.println(name+"年龄"+age+"  国籍"+ Chinese.nationality);
	}
	//而这个非静态的show方法调用的name和age就是该对象的name和age		name=this.name  age=this.name
	public void show() {
		System.out.println(this.name+"年龄"+age+"  国籍"+ Chinese.nationality);
	}
}