package ��װ��;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
class a_��װ���ʹ��Test {

	//������������ --> ��װ��   ���ð�װ��Ĺ�������Ȼ��ѻ�������������Ϊ����
	@Test
	public void test1() {
	//����1	��װ�๹��������Ϊ������
		int num1 = 10;
		// System.out.println(in1.toString()); ���󣡱���in1���ܵ���toString()
		Integer in1 = new Integer(num1);
		System.out.println(in1.toString());
	//����2  ��װ�๹��������ת��Ϊ������������ֵ
		Boolean bool1 = new Boolean("tRuE");	//�������͵Ĳ��������ַ�����Сд����true����true
		System.out.println(bool1.toString());	//true
		
		Boolean bool2 = new Boolean("true12345");	//�����������������Ĳ���true����false���Ĭ��Ϊfalse
		System.out.println(bool2);	//false
	}
	
	//��װ�� --> ������������   ���ð�װ���xxxValue(),Ȼ���ֵ��������
	@Test
	public void test2() {
		Integer in1 = new Integer(20);
		int i1 = in1.intValue();
		System.out.println(i1 + 10);		//30
		
		Double dou1 = new Double(3.14);
		double d1 = dou1.doubleValue();
		System.out.println(d1 + 2);			//5.140000000000001
	}

}
