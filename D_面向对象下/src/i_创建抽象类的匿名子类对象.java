
public class i_���������������������� {

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
		System.out.println("������AA��test1����");
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