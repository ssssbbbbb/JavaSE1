package �ӿ�;
/**
 * 	JDK8 ���� ���Դ�����ȫ�ֳ����ͳ��󷽷�֮�⣬�����Զ��徲̬������Ĭ�Ϸ���
 * 
 * @author hjj
 * @time 2021��11��14�� ����12:07:43 
 *
 */
public class c_Java8�ӿ������� {
	public static void main(String[] args) {
		imptest i1 = new imptest();
		
//		  i1.method1();  ����
//	һ��    �ӿ��ж���ľ�̬����ֻ���ɽӿ�������
		  c_test.method1();
		  
//  ����    ͨ��ʵ����Ķ��󣬿��Ե��ýӿ��е�Ĭ�Ϸ���
		//���ʵ������д�˽ӿ��е�Ĭ�Ϸ���������ʱ����Ȼ���õ�����д�Ժ�ķ���
		  i1.method2();
		  
//  ����    ��������ʵ����̳еĸ����ʵ�ֽӿ���������ͬ��ͬ�����ķ���������������û����д�˷���������£�Ĭ�ϵ��õ��Ǹ����е�ͬ��ͬ�εķ��� --- ������ԭ��
		  
//  �ġ�    ���ʵ����ʵ���˶���ӿڣ��������ӿ��ж�����ͬ��ͬ������Ĭ�Ϸ�����������ʵ����ô����д�˷���������£����� --- �ӿڳ�ͻ
	}
}

interface c_test {
	static String name = "tom";
	
	public static void method1() {
		System.out.println("��̬����");
	}
	
	public default void method2() {
		System.out.println("Ĭ�Ϸ���");
	}
	
/*		public void method3() {}
 * 		��������д����Ҫ��ʽ�ļ���	static �� default
 */
}

class imptest implements c_test {
	
}