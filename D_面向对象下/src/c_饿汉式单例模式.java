
public class c_����ʽ����ģʽ {
	public static void main(String[] args) {
		cTest t1 = cTest.getMyTest();
		cTest t2 = cTest.getMyTest();
		
		System.out.println(t1 == t2);
		System.out.println("t1 : "+t1+"   t2 : "+t2);	// t1 : cTest@123a439b   t2 : cTest@123a439b
		
		/*	����ģʽ���ǳ���ֻ����һ�����󣬶������Ҫ���ⲿ���ô˶��������Ҫ�÷��ض���ķ������Ѷ����ֵַ��������������������
		 * 	cTest t1 = cTest.getMyTest();		
		 * 	�����ǰ��������洴���Ķ���ĵ�ֵַ���� t1 ��Ȼ��ͨ�� t1 �������ö�����ָ����ڴ���Ľṹ��ֵ
		 */
	}
}

class cTest {
	//�� ˽�л���Ĺ�����---���ã���������ⲿ��������
	private cTest() {
		
	}
	
	//�� ���ڲ�������̬����Ķ���---��Ϊ���ɶ���ķ����Ǿ�̬����������̬������ֻ�ܵ��þ�̬�ķ��������ԣ�������ⴴ���Ķ���Ҳ����Ҫ��static����
	private static cTest TestObject = new cTest();		//TestObject	���ڲ������Ķ�����
	
	//�� �ṩ������̬������������Ķ���---��Ϊû�ж����ֻ�����������ô˷���������ɵ��õķ��������Ҫ��static����
	public static cTest getMyTest() {
		return TestObject;
	}
}