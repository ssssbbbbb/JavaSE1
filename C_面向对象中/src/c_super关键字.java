/**
 * 	һ��super�ؼ��ֵ�ʹ��
 * 		1��super���Ϊ�������
 * 		2��super�����������ã����ԡ�������������
 * 	
 * 	����super�������Ժͷ���
 * 		1�����ǿ���������ķ����������У�ͨ��ʹ�á�super.���ԡ���super.�������ķ�ʽ����ʽ�ĵ��ø��������������Ի򷽷������ǣ�ͨ�����������ϰ��ʡ�� super
 * 		2��������͸����ж�����ͬ��������ʱ������Ҫ���������е��ø��������������ԣ����������ʽ��ʹ�á�super.���ԡ��ķ�ʽ���������õ��Ǹ��������������ԡ�
 * 		3����������д�˸������Ƿ����Ժ�������������ķ����е��ø��౻��д�ķ����ǣ��������ʽ��ʹ�� super.���� �ķ�ʽ������������Ƿ����б���д�ķ�����
 *	
 * 	����super���ù�����
 * 		1�����ǿ���������Ĺ���������ʽ��ʹ�á�super(�β��б�)���ķ�ʽ
 * 		2����super(�β��б�)����ʹ�ã�����˵�������๹���������У�
 * 		3����������Ĺ������У�����ڡ�this(�β��б�)����super(�β��б�)��ֻ�ܶ�ѡһ������ͬʱ����
 * 		4���ڹ��������У�û����ʽ������ ��this(�β��б�)�� �� ��super(�β��б�)�� ����Ĭ�ϵ��õ��Ǹ����пղεĹ�����
 * 		5������Ĺ������У�������һ���๹����ʹ����super()
 * 
 * 		superֻ�ܵ������ֺͽṹ�����ܵ���ֵ
 * @author hjj
 * @time 2021��11��8�� ����7:49:28 
 *
 */
public class c_super�ؼ��� {
	public static void main(String[] args) {
		c_Person p1 = new c_Person("��A",30);
		p1.eat();	//��A�Զ���
		p1.show();	//��A����30
		
		c_Students s1 = new c_Students("Сa",10,100000);
		s1.eat();	//Сaѧ���Զ���
		
		s1.show();	//	Сa����10,Ҫ��ѧ��ѧ����0
					//	Сa����10
					//  Сa10
					//  Сa����10
/*	��ѧ��������д��Person�����show()����,Ȼ������ѧ�������show()��  ������Person���show(),Ҳ������дǰ��show()����
 * 
	@Override
	public void show() {
		System.out.println(name+"����"+age+",Ҫ��ѧ��ѧ����"+ID);
		super.show();
		System.out.println(super.name+super.age);
		super.show(super.name,super.age);
	}
	
	����д��ķ������super.show();���൱�ڵ�������дǰ��show()������Ҳ���Ǹ�����ķ��������Ƿ���������Ե��û��Ǵ˶�������ԣ���ʹ����ʹ��super�ؼ��ֵ��������ԡ�
	
	���ۣ����������������ø��������ȥʹ����дǰ����ķ���������Ҫ��ʽ�ĳ�ʼ������Ȼ��ʹ��������
*/
		
		c_Students s2 = new c_Students("Сb");
		s2.eat();	//Сbѧ���Զ���
		/*	ʹ�õĹ�����������
		 * 	public c_Students(String name) {
			super.name=name;
			} 	
		 */
	}
}

class c_Person{
	String name = "������";
	int age = 1000;
	
	public c_Person() {
		System.out.println("���๹����");
	}
	
	public c_Person(String name) {
		this.name = name;
	}
	
	public c_Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println(name+"�Զ���");
	}
	
	public void work() {
		System.out.println(name+"����");
	}
	
	public void show() {
		System.out.println(name+"����"+age);
	}
	//���ط���������ʵ�������������ʹ��super���ø���ķ���ʹ�ø��������
	public void show(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println(name+"����"+age);
	}
}

class c_Students extends c_Person{
	int ID;


	public c_Students(String name, int age,int ID) {
		this.name=name;
		this.age=age;
		this.ID=ID;
		
	}

	public c_Students(String name) {
		super.name=name;
		
	}

	@Override
	public void eat() {
		System.out.println(name+"ѧ���Զ���");
	}
	
	public void XX() {
		System.out.println("ѧ��ѧϰȥ");
	}
	
	@Override
	public void show() {
		System.out.println(name+"����"+age+",Ҫ��ѧ��ѧ����"+ID);
		super.show();
		System.out.println(super.name+super.age);
		super.show(super.name,super.age);
		System.out.println(this.name == super.name);	//true
	}
}