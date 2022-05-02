
public class i_创建抽象类的匿名子类对象 {

	public static void main(String[] args) {
		
		AA a1 = new AA() {
			@Override
			public void test2() {
			}

			@Override
			public void test3(String name) {	
			}	
		};
		
		
	}

}

abstract class AA {
	String name;
	
	public void test1() {
		System.out.println("抽象类AA的test1方法");
	}
	
	public abstract void test2();
	
	public abstract void test3(String name);
}

class BB extends AA {

	@Override
	public void test2() {
		
		
	}

	@Override
	public void test3(String name) {
		System.out.println(name);
		
	}
	
}