package ��̬��;
/**
 * 	�ؼ���instanceof��ʹ�ã�
 * 		A instanceof B
 * 	���� ����A �Ƿ�Ϊ class B �Ķ��󣬷���ֵΪboolean���͡�
 * 	�� Ҫ��A���������� ��B ����������͸���Ĺ�ϵ������������
 * 	�� ���A���� ��B ������0�� ��ô�����ֵҲΪtrue��
 * @author hjj
 * @time 2021��11��9�� ����9:40:16 
 *
 */
public class c_�ؼ���instanceof {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		System.out.println(a instanceof A);	//true
		// System.out.println(b instanceof A);	����
		System.out.println(c instanceof A);	//true
		System.out.println(a instanceof C);	//false
		//����new�Ķ�����������Ķ�������new�Ķ������ڸ���Ķ���
		
		A a2 = new C();
		//C c2 = new A();  ������ֻ̬�� ������� new����
		System.out.println(a2 instanceof A);	//true
		
	}
}

class A {
	
}

class B {
	
}

class C extends A {
	
}
