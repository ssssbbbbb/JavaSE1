package �ӿ�;
/**
 * 	�ӿڵ�ʹ�úͶ���
 * 		1���ӿ�ʹ��interface������
 * 		2��Java�У��ӿں����ǲ��е������ṹ
 * 		3����ζ���ӿڣ�����ӿ��еĳ�Ա
 * 			3.1 JDK8:  ��ȫ�ֳ�����public static final XXX		����дʱ����ʡ��ǰ������η��ؼ��֣������ǵ����û��ڣ�Ҳ�����ڽӿ������������Ժ�ֵ��û��Ϊȫ�ֳ�����
 * 					   ��������ȫ�ֳ����ͳ��󷽷�֮�⣬�����Զ��徲̬������Ĭ�Ϸ���			����дʱҲ����ʡ��ǰ������η��ؼ���
 * 		4���ӿ��в��ܶ��幹��������ζ�Žӿڲ����Գ�ʼ��
 * 
 * 		5����Java�������У��ӿ�ͨ����ȥʵ��(implements)�ķ�ʽ��ʹ��
 * 			- ���ʵ���า���˽ӿ��е����г��󷽷������ʵ����Ϳ���ʵ����
 * 			- ���ʵ����û�и��ǽӿ������еĳ��󷽷������ʵ������Ϊһ�������ࡢ
 * 
 * 		6��Java�����ʵ�ֶ���ӿ� --- �ֲ���Java���̳��Եľ�����
 * 			Java���Ա߼̳б�ʵ��
 * 			class ClassName extends FatherClass implements inter1,inter2,inter3...
 * 		
 * 		7���ӿ���ӿ�֮����Լ̳У����ҿ��Զ�̳�
 * 
 * 		8��   �� �ӿڵľ���ʹ�ã������˶�̬��  �� �ӿ�ʵ���Ͽ��Կ�����һ�ֹ淶
 * @author hjj
 * @time 2021��11��13�� ����9:02:26 
 *
 */
public class a_�ӿڵĶ����ʹ�� {
	public static void main(String[] args) {
		
		TestImp test1 = new TestImp();
		//�����˽ӿڵķ�����ʵ����ķ���������
		Tests tests = new Tests();
		test1.printTest(tests);
		
		//������ӿڵķ�����ʵ�������������
		test1.printTest(new Tests());
	}
}

interface a_Test {
	//ȫ�ֳ���
	public static final int MAX_SPEED = 7900;	//����ٶ�
	int MIN_SPEED = 1;		//��С�ٶ�
	
	//���󷽷�
	public abstract void fly();	
	void stop();
}
interface a_Test2 {
	void test1();
}

class TestImp implements a_Test,a_Test2 {

	@Override
	public void fly() {
		System.out.println("�ߺ�����ɣ�");
		
	}

	@Override
	public void stop() {
		System.out.println("ֹͣ��");
		
	}

	@Override
	public void test1() {
		System.out.println("��̳У���������һ���ӿڵĳ��󷽷��������һ�����󷽷�û����д�������ͱ��뱻����Ϊ������");
		
	}
	
	public void printTest(TestImp test) {
		test.fly();
		System.out.println("һСʱ��");
		test.stop();
	}
}

class Tests extends TestImp {

	@Override
	public void test1() {
		// TODO �Զ����ɵķ������
		super.test1();
	}
	
}








