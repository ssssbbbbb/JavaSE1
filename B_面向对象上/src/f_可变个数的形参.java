/**
 * 	�ɱ�������β� ���� �ɱ��β�
 * 		1����ʽ
 * 			Ȩ�����η� �������� ������(��������... ������)
 * 		2���ɱ����ָ���ǲ��������ɱ䣬���������Ϳɱ䡣
 * 		3���ɱ�����Ĳ���������0����Ҳ��������������
 * 		4������ tests �ı����������� String ���������һ������
 * 		5����ʵ�ɱ�����Ĳ������;���һ�����飬�磺����tests(String... strs)�����ĵ�18��
 * 			�ڿɱ���������У���ӡ�˸÷����ķ�������������ǵ�ֵַ����˵�����ɱ��������һ�������ﴢ����һ�������
 * 		
 * @author hjj
 * @time 2021��11��6�� ����2:01:43 
 *
 */
public class f_�ɱ�������β� {
	public static void main(String[] args) {
		test t1 = new test();
		
		t1.tests();
		t1.tests("һ","��","��");		//[Ljava.lang.String;@123a439b
		t1.tests(0, "һ","��","��");	//һ �� �� 
		
		t1.testss(1,2,3,4,4,5,65,6);
	}
}

class test{
	public void tests(){
		System.out.println("һ��ķ���");
	}
	
	public void tests(String... strs) {
		System.out.println("�ɱ�����ķ���");
		System.out.println(strs);
	}
	
	public void tests(int i, String... strs) {
		for (i=0; i<strs.length; i++) {
			System.out.println(strs[i]+" ");
		}
	}
	
	public void testss(int...is ) {
		System.out.println("int���Ϳɱ����");
	}
}