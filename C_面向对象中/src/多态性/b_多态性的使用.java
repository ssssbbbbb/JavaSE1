package ��̬��;

public class b_��̬�Ե�ʹ�� {
	public static void main(String[] args) {
		
/*���û�ж�̬�ԣ���Ҫʹ��Dog����д��������Ҫ������һ��Dog�����ķ�����Ҫʹ��Cat����д��������Ҫ������һ��Cat�����ķ���
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
	b_��̬�Ե�ʹ�� test = new 	b_��̬�Ե�ʹ��();
	test.runDog(new Dog());
	test.runCat(new Cat());
		
//����̬�Ծ�ʡ����Щ���ӵĲ��裬ֻ��Ҫ����һ�����๲ͬ�ĸ���Ϊ�����ķ������� ------------------------------
	
	test.run(new Dog());
	test.run(new Cat());
	//��Ҫʹ���ĸ��������д������new�ĸ������
	
		
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
		System.out.println("�����ʳ");
	}
	
	public void shout() {
		System.out.println("�������");
	}
		
}

class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("������");
	}

	@Override
	public void shout() {
		System.out.println("������");
	}
	
}

class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("è����");
	}

	@Override
	public void shout() {
		System.out.println("������");
	}
	
}