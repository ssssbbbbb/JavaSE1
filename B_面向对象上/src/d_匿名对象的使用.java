/**
 * 	一、匿名对象
 * 		1、理解：我们创建的对象，没有显式的赋给一个变量名，即为匿名对象。
 * 		2、特征：匿名对象只能调用一次，比如在给一个匿名对象属性赋值后，再次调用该属性发现值还是空的，也就是说匿名对象是用了一次就直接丢掉的。
 * 			new Phone().price = 100;
 *			System.out.println(new Phone().price);	
 *			输出：0.0		
 *		匿名对象是直接出现在堆空间中的实体值
 * 	二、把匿名对象做为参数
 * 		形参是局部变量，形参的作用域在方法内。而匿名对象是直接出现在堆中的实体值。
 * 		例如下面的方法：需要传入Phone对象为参数
 * 		-------------------------------------------------------
 *		public void show(Phone phone) {
		phone.sendEmail();
		phone.playGame();
		}
		-------------------------------------------------------
		如果这时把一个匿名对象作为参数传入该方法中，那么局部变量（也就是形参phone）里就会储存该匿名对象在堆空间中的地址值
		
 */
public class d_匿名对象的使用 {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.price = 1050;
		
		p1.sendEmail();
		p1.playGame();
		
		//匿名对象:有新对象，但没有对象名
		new Phone().sendEmail();
		new Phone().playGame();
		
		//
		new Phone().price = 100;
		System.out.println(new Phone().price);	//0.0
		
		showPhone sp = new showPhone();
		sp.show(new Phone());
		// 发送邮件！
		// 玩游戏！
		// Phone@53bd815b
	}
}

class Phone{
	double price;//价格
	
	public void sendEmail() {
		System.out.println("发送邮件！");
	}
	
	public void playGame() {
		System.out.println("玩游戏！");
	}
	
}
class showPhone{
	
	public void show(Phone phone) {
		phone.sendEmail();
		phone.playGame();
		System.out.println(phone);//如果传入的是匿名函数，那么形参里储存的就是该匿名函数在堆空间中的地址值
	}
}