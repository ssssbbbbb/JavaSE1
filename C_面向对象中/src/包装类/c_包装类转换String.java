package ��װ��;
/*	����1�ľ����ԣ��޷�ת����װ��
 * 
 */
public class c_��װ��ת��String {
	public static void main(String[] args) {
//һ�������������͡���װ�� --> String����    ����String���ص�valueOf(Xxx xxx)
		
		//����1:��������
		int num1 = 10;
		String str1 = num1 + "";
		System.out.println(str1);
		
		//����2:����valueOf(Xxx xx)����
		float f1 = 12.3f;
		String str2 = String.valueOf(f1);
		System.out.println(str2);
		
		Double dou1 = new Double(3.14);
		String str3 = String.valueOf(dou1);
		System.out.println(str3);
		
//����String���� --> �����������͡���װ��    ���ð�װ���parseXxx(String s)
		String s1 = "123";
		int int1 = Integer.parseInt(s1);	//�Ȱ�Stringת��Ϊ����������������Ӧ�İ�װ�࣬�������Զ����� ��ֵ���������������ͱ���
		System.out.println(int1);
		//ע����������֮���ת����ϵ��
	}
}
