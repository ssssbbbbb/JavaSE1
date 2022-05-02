package ��̬��;
/**
 * 	һ����̬��
 * 		1����Ϊ��̬��
 * 			����Ķ�̬�ԣ����������ָ������Ķ�������Ķ��󸳸���������ã�
 * 			�� ����ֱ��Ӧ���ڳ�����ͽӿ���
 * 		2����̬�Ե�ʹ�ã����ⷽ������
 * 			�� ���˶���Ķ�̬���Ժ������ڱ�����ֻ�ܵ��ø������������ķ���������������ʵ��ָ�����������д����ķ�����
 * 			�ܽ᣺����ʱ��������Ƿ��У�����ʱ�����ұ�ʲô��
 * 		3����̬�Ե�ʹ��ǰ�᣺
 * 			�� ��Ҫ�̳й�ϵ
 * 			�� �����豻����д
 * 
 * 	����ΪJava��Ķ�̬����ʹ�ô����κ�һ����ʱ������ʹ��Object��ķ���		
 * 
 * 	�������ǿ��ת��
 * 		���ݶ�̬�Կ�֪����������޷������������е����Ժͷ�����
 * 		����Java��ֻ�ܴ��¶��ϣ�������ת��Ϊ�������	farther = son	[����son = father]  
 * 		�����������Ҫʹ�ã��ǾͿ��Խ�����Ķ���ǿ��ת��Ϊ����Ķ���	son = (son)father
 * 
 * @author hjj
 * @time 2021��11��9�� ����8:27:53 
 *	������   a_Person
 *	����    eat()��walk()��test()
 *	
 *
 *	������  Man extends a_Person
 *	����    earMoney()��test()
 *	��д���� eat()��walk()
 *
 *
 *	������  Woman extends a_Person
 *	����   goShopping()��test()
 *	��д   eat()��walk()
 */
public class a_��̬ {
	public static void main(String[] args) {
// һ����˵ ���������������� ------------------------------------------
		a_Person p1 = new a_Person();
		p1.eat();
		
		Man man = new Man();
		man.eat();
		man.age=25;
		man.earMoney();
		System.out.println(man.name);	//����  ��Man�������nameĬ��ֵΪ�����ˡ�
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
// ����̬���������� --------------------------------------------------
		//1������Ķ�̬�ԣ����������ָ������Ķ���
		a_Person p2 = new Man();
		System.out.println(p2.name);	//null ����Man������name��Ĭ��ֵΪ �����ˡ��������������Ĭ��ֵΪnull����˵�����õĻ��Ǹ����������ֵ
		
		a_Person p3 = new Woman();
		
		//��̬��ʹ��:�������Ӹ���ͬ��ͬ�����ķ���ʱ��ʵ��ִ�е���������д����ķ�����	
		p2.name="tom";
		p2.eat();	// ����Ҫ�Զ�㷹
		p2.test();	// tom---class ��̬��.Man
		//����test�������Կ�����ʵ���϶�̬���ǣ�ʹ��������[a_Person]�����ԣ����ô�����[new Man()]�ķ����ṹ-----�������ԣ�������д������෽��
		//p2.isSmoking = true;
		//p2.earMoney();	�������еķ��������ԾͲ��ܵ���

// ������Ķ���ǿ��ת��Ϊ����Ķ���	son = (son)father -------------------
		System.out.println(p2.getClass());	//class ��̬��.Man
		System.out.println(p2.name);		//tom
		
		Man m = new Man();
		m = (Man)p2;
		System.out.println(m.isSmoking);	//false
		System.out.println(m.getClass());	//class ��̬��.Man
		System.out.println(m.name);			//����
		m.eat();							//����Ҫ�Զ�㷹
	}
}

class a_Person{
	String name;
	int age;
	
	public void eat() {
		System.out.println("��Ҫ�Է�");
	}
	
	public void walk() {
		System.out.println("����·");
	}
	
	public void test() {
		System.out.println(name+"---"+this.getClass());
	}
}

class Man extends a_Person{
	String name = "����";
	boolean isSmoking;
	
	public void earMoney() {
		System.out.println("������Ǯ����");
	}

	@Override
	public void eat() {
		System.out.println("����Ҫ�Զ�㷹");
	}

	@Override
	public void walk() {
		System.out.println("���˴���·");
	}
	
	public void test() {
		super.test();
	}
}
	
class Woman extends a_Person{
	String name = "Ů��";
	boolean isBeauty;
	
	public void goShopping() {
		System.out.println("Ů��ϲ������");
	}
	
	@Override
	public void eat() {
		System.out.println("Ů��Ҫ���ٵ㷹");
	}
	
	@Override
	public void walk() {
		System.out.println("Ů��С����·");
	}
	
	public void test() {
		super.test();
	}
}
	