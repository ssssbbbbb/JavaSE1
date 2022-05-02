
public class d_����ʽ����ģʽ {
	public static void main(String[] args) {
		dTest t1 = dTest.getMyObject();
		dTest t2 = dTest.getMyObject();	
		System.out.println(t1 == t2);				//true
		System.out.println("t1: "+t1+"    t2: "+t2);//t1: dTest@123a439b    t2: dTest@123a439b

		
		//���û���ж���������ƶ���ĳ�ʼ�����ø÷�����㴴���µĶ������������ģʽ���Ƕ��һ����
		dTest t3 = dTest.getMyObject_2();
		dTest t4 = dTest.getMyObject_2();
		System.out.println(t3 == t4);				//false
		System.out.println("t3: "+t3+"    t4: "+t4);//t3: dTest@7de26db8    t4: dTest@1175e2db
	}
}

class dTest {
	//�� ˽�л���Ĺ�����
	private dTest() {
		
	}
	
	//�� ������ǰ��Ķ���û�г�ʼ��---�ǵ�static���Σ���ΪҪ�ھ�̬���������
	private static dTest TestObject = null;
	
	//�� ���������ľ�̬�������������ص�ǰ��Ķ���
	public static dTest getMyObject() {
		if (TestObject == null) {		//���жϸö����Ƿ��ʼ���ˣ����û��ʼ����newһ��
			TestObject = new dTest();			
		}
		return TestObject;				//���֮ǰ���Ѿ���ʼ�����ˣ��Ͳ�new�ˣ�ֱ�ӷ���֮ǰ��ʼ�����Ķ���
										//�����ķ�֧�ṹ�Ǳ�֤�˵���ģʽֻ������һ�������������һ�δ˷�����newһ�εĻ��Ͳ�ֹһ�������ˣ��Ͳ��е���ģʽ��
	}
	
	//���û���ж���������ƶ���ĳ�ʼ�����ø÷�����㴴���µĶ������������ģʽ���Ƕ��һ����
	public static dTest getMyObject_2() {
		TestObject = new dTest();			
		return TestObject;				
									
	}
}