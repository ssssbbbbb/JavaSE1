/**
 * 	�ؼ��֣�final�����յģ�
 * 		1��final�������εĽṹ��
 * 			�� ��
 * 			�� ����
 * 			�� ����
 * 	һ��final������
 * 		��final���ε���Ͳ�����������̳и����ˣ����������յ���
 * 		���磺String�ࡢSystem�ࡢStringBuffer��
 * 		
 *  ����final���η���
 *  	�����˷��������Ա���д�������ܱ�����
 * 		
 * ����final���α���
 * 		��final���εı����ͻ��Ϊ���ɱ�����Ҳ���ǳ��� 
 * 
 * @author hjj
 * @time 2021��11��13�� ����6:17:37 
 *
 */
public class g_final�ؼ��� {
	public static void main(String[] args) {
		b b1 = new b();
		b1.F("����");
	}
}

final class FinalClass {
	final void F() {
		System.out.println("���������ܱ���д");
	}
	
	final void F(String ff) {
		System.out.println("�����������ܱ�����");
	}
}
class a {
	final void F() {
		System.out.println("���������ܱ���д");
	}
}
class b extends a {
	final void F(String ff) {
		System.out.println("�����������ܱ�����");
	}
}