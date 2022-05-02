package 多态性;

public class b_多态性的使用 {
	public static void main(String[] args) {
		
/*如果没有多态性，需要使用Dog的重写方法就需要先设置一个Dog参数的方法；要使用Cat的重写方法就需要先设置一个Cat参数的方法
--------------------------------------------------------------------------------------------
		public void runDog(Dog d) {
			d.eat();
			d.shout();
		}
--------------------------------------------------------------------------------------------
		public void runCat(Cat c) {
			c.eat();
			c.shout();
		}
--------------------------------------------------------------------------------------------
*/	
	b_多态性的使用 test = new 	b_多态性的使用();
	test.runDog(new Dog());
	test.runCat(new Cat());
		
//但多态性就省了这些繁杂的步骤，只需要声明一个子类共同的父类为参数的方法即可 ------------------------------
	
	test.run(new Dog());
	test.run(new Cat());
	//想要使用哪个子类的重写方法就new哪个类就行
	
		
	}
	
	public void run(Animal anumal) {
		anumal.eat();
		anumal.shout();
	}
	
	public void runDog(Dog d) {
		d.eat();
		d.shout();
	}
	
	public void runCat(Cat c) {
		c.eat();
		c.shout();
	}
}


class Animal{
	
	public void eat(){
		System.out.println("动物，进食");
	}
	
	public void shout() {
		System.out.println("动物叫声");
	}
		
}

class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("狗吃肉");
	}

	@Override
	public void shout() {
		System.out.println("汪汪汪");
	}
	
}

class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}

	@Override
	public void shout() {
		System.out.println("喵喵喵");
	}
	
}