/**
 * 	����������(overload)
 * 		1�����壺��ͬһ�����У��������һ�����ϵ�ͬ��������ֻҪ���ǵĲ������߲������Ͳ�ͬ���ɡ�
 * 
 * 		һ������(Overload)
			����(overloading) ����һ�������棬����������ͬ��������������������ͬ���������Ϳ�����ͬҲ���Բ�ͬ��
			ÿ�����صķ��������߹��캯������������һ����һ�޶��Ĳ��������б�
			��õĵط����ǹ����������ء�
		�������ع���:
			�� �����صķ�������ı�����б�(�������������Ͳ�һ��)��
			�� �����صķ������Ըı䷵�����ͣ�
			�� �����صķ������Ըı�������η���
			�� �����صķ������������µĻ����ļ���쳣��
			�� �����ܹ���ͬһ�����л�����һ�������б����ء�
			�� �޷��Է���ֵ������Ϊ���غ��������ֱ�׼��
 * 		��������ָ�����ط���
 * 			���ݷ�������ָ���Ĳ���������ָ�������ط���.
 * 
 *	ע�⣺������ط���ʱ��ֻ�Ǹı��˷����Ĳ����������ǲ������ͺͲ�������������Ϊ���ط���
 */
public class e_���������� {
	public static void main(String[] args) {
		testOverload t1 = new testOverload();
		//test(int i, double d)	����Ĳ�������Ҫ��ȷ�������������Ĳ����ǣ�1��1������ô���������Ὣ����ת��Ϊ�����������ǻ��Զ����˷�����Ϊ  test(int i, int i2)��
		t1.test(1,1.0);
		
		t1.test(1, 1);
		
		//�ֲ�����private String test(String s1, String s2)��Ҫ����main��������ã�����Ҫ�ڸ������洴��һ�����÷���
		System.out.println(t1.testPrivate());
	}
}

class testOverload{
	String name;
	
	public testOverload() {
		//������
	}
	public testOverload(String name) {
		//���ع�������
		this.name=name;
	}
	
	
	public void test() {
		System.out.println("����������");
	}
	
	public void test(int i, double d) {		//�� �����صķ�������ı�����б�(�������������Ͳ�һ��)��
		
		System.out.println(i+d);
	}
	
	public int test(int i, int i2) {		//�� �����صķ������Ըı䷵�����ͣ�
		return i+i2;
	}
	
	private String test(String s1, String s2) {		//�� �����صķ������Ըı�������η���
		System.out.println("�����ͷ������ͻ��з����嶼�ı���");
		return s1+s2;
	}
	public String testPrivate() {
		return test("1","2");
	}
}