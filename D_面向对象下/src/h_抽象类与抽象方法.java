/**
 * 	abstract�ؼ��ֵ�ʹ��
 * 		1��abstract������ģ�
 * 		2�������������εĽṹ���ࡢ����
 * 	һ��������
 * 		�����಻��ʵ����
 * 		����������һ���й���������������ʵ����ʱ���ã��漰���������ʵ������ȫ���̣�
 * 		�������У����ṩ����������࣬������ʵ��������
 * 
 *  �������󷽷�
 *  	�����󷽷�û�з�����
 *  	��ֻ���ɳ�������˵�����󷽷�
 *  	��������������г��󷽷����붼��������дһ�Σ�ֻ�����ض����У������������Ҳ������һ�������࣬��Ϊ��ͨ�����治������ڳ��󷽷�
 *  	�����������������ͨ����
 *  
 *  ����ע���
 *  	�� abstract�����������γ����뷽��֮��Ľṹ
 *  	�� abstract������������˽��������̬������final����
 *  	
 * @author hjj
 * @time 2021��11��13�� ����6:54:44 
 *
 */
public class h_����������󷽷� {
	public static void main(String[] args) {
		h_t h1 = new h_t();
		h1.test2();
		h1.test1();
	}
}
abstract class h_Test {
	public abstract void test1(String name,int age);
	
	public void test2() {
		System.out.println("���󷽷���Ҳ���Զ�����ͨ��");
	}
}
class h_t extends h_Test {

	@Override
	public void test1(String name, int age) {
		System.out.println(name+age+"����");
	}
	
	public void test1() {
		System.out.println("����Ҳ����");
	}
	
	

}