/**
 * 	һ���̳и�ʽ
 * 		class ���� extends ����{...}
 * 		
 * 		1������ �ֳ� ���� �����ࡢsubclass
 * 		2������ �ֳ� ���� ���ࡢ���ࡢsuperclass
 * 
 * 	�����̳���		
 * 		1��һ������̳��˸��࣬��ô����ͻ�ȡ�˸����������Ľṹ�����ԡ�����
 * 			���������������Ի��߷���������˽�л���������Ȼ�̳��˸���ĸ����Ի򷽷�������������Ҳ�Ƿ�������ֻ�������޷�ֱ�ӵ��á�
 * 		2���̳��길������໹�ܴ����Լ����ص����Ի򷽷�
 * 		3��һ������ֻ����һ������
 * 		4��һ����������������������
 * 		5���������ֱ�Ӽ̳и��࣬Ҳ���Լ�Ӽ̳и���
 * 			���磬������class A��Ȼ��Class B�̳�A�������ֱ�Ӽ̳У���Ϊֱ�Ӹ���
 * 			�����������һ��Class C��Ȼ��C�ټ̳�B������Ǽ�Ӽ̳�A����Ϊ��Ӹ���
 * 	����Object��	Java.lang.Object
 * 		Object��������ĸ��࣬����������࣬�����඼���������ֱ࣬�ӻ��ӵļ̳���
 * 
 * 	�ġ���������д��override/overwrite��
 * 		1������д����ʱ����Ҫ��ѭ���µĹ���
	(һ) ���෽���Ĳ����б������ȫ�뱻������д�ķ����Ĳ����б���ͬ�������ܳ���Ϊ��д�������ء�
	(��) ����ķ������ͱ����뱻������д�ķ�������������ͬ�������ܳ���Ϊ��д�������ء�
	(��) Java�й涨����������д�ķ�������ӵ�бȸ��෽�������ϸ�ķ���Ȩ�ޡ���д��Java������˾�֪���������еķ������������κ�����¶�������д�ģ�
	 	�������з����ķ���Ȩ�����η�Ϊprivateʱ���÷���ֻ�ܱ��Լ�������ʣ����ܱ��ⲿ������ʣ��������ǲ��ܱ���д�ġ�������常��ķ���Ϊpublic��
	 	�����ඨ��Ϊprivate����������ʱ�ͻᱨ��
	(��) ��������ķ���Ȩ�����η�������һ��Ҫ������Ҫ��д�ĸ��෽���ķ���Ȩ�����η�����privateȨ����С���������ĳһ�������ڸ����еķ���Ȩ����private��
	 	��ô�Ͳ����������ж��������д��������¶��壬Ҳֻ�Ƕ�����һ���µķ���������ﵽ��д��Ч����
	(��) �ڼ̳й�����������൱�еķ����׳��쳣����ô����������д����ĸ÷���ʱ��ҲҪ�׳��쳣�������׳����쳣���ܶ��ڸ������׳����쳣(���Ե��ڸ������׳����쳣)��
	 	���仰˵����д����һ�������׳��µļ���쳣�����߱ȱ���д�����������ӿ��ļ�����쳣��
 * 
 * 	    2����д���������ִ�еķ�������������д��ķ�����
 		3������͸����е�ͬ��ͬ�����ķ�������������Ϊ��static������������д����Ҫô������Ϊstatic�ķ�����������д��
 * 
 * @author hjj
 * @time 2021��11��8�� ����6:25:42 
 *	
 *	class b_ren ����	  --->	class b_students ѧ����    --->     class b_Yi Сѧ����
 *	
 */
public class b_�̳� {
	public static void main(String[] args) {
		b_students s1 = new b_students("tom", 20);
		s1.eat();
		//s1.ZhongZhu;	˽�����Բ���ֱ�ӵ���
		
		//��������Ի��߷���������˽�л���������Ȼ�̳��˸���ĸ����Ի򷽷���ֻ�������޷�ֱ�ӵ���
		s1.setZhongzu("������");
		System.out.println(s1.getZhongZu());
		
		//b_ren ���� b_Yi �ļ�Ӹ��࣬��Ӹ���Ҳ�̳��������и�������Ժͷ���
		b_Yi y1 = new b_Yi("SB", 10);
		y1.eat();
		y1.setZhongzu("������");	//b_ren�ķ���
		y1.setID("2022_10_1000");//b_Students�ķ���
	}
}

class b_ren{
	String name;
	int age;
	private String ZhongZu;	//����
	
	public b_ren(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void eat() {
		System.out.println("�Զ���");
	}
	
	public void setZhongzu(String ZhongZu) {
		this.ZhongZu=ZhongZu;
	}
	public String getZhongZu() {
		return ZhongZu;
	}
	
}

class b_students extends b_ren{
	private String ID;
	
	public b_students(String name, int age) {
		super(name, age);
		
	}
	// ��д����
	@Override
	public void eat() {
		System.out.println("ѧ���Զ���");
	}
	
	public void setID(String ID) {
		this.ID=ID;
	}
	public String getID() {
		return ID;
	}
	
}

class b_Yi extends b_students{

	public b_Yi(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void eat() {
		System.out.println("Сѧ���Զ���");
	}
	
}