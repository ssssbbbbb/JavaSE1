/**
 * 	��ĳ�Ա֮�ģ�����飨���ʼ���飩
 * 		
 * 			1�����������ã�������ʼ����Ͷ���
 * 			2�������ֻ��ȱʡ���߱�static����
 * 			3�����ࣺ �� ��̬�����    
 * 						��������ļ��ض�ִ��
 * 						��ֻ��ִ��һ��
 * 						�����ã���ʼ�������Ϣ
 * 					�� �Ǿ�̬�����
 * 						�����Ŷ���Ĵ�����ִ��
 * 						��ÿ����һ�ζ����ִ��һ��
 * 						�����ã������ڴ�������ʱ���Զ�������ԵȽṹ���г�ʼ��
 * 			4���������Զ�������ִ��˳����Ƕ��������˳��
 * 				��̬�������ֻ�ܵ��þ�̬�����ԡ���̬�ķ��������ܵ��÷Ǿ�̬�ṹ
 * @author hjj
 * @time 2021��11��13�� ����5:44:54 
 *
 */
public class f_����� {
	public static void main(String[] args) {
		System.out.println(Person.desc);	//�����Ľṹ����Ҫ�����������ò���ִ�еģ�����̬�������������ļ��ض�ִ��
		/*	���
		 * 
		 * 	��̬�����
		 *  ��������
		 */
		
		Person p1 = new Person("SB",250);	//��֮ǰ�����ַ����ڴ�������ʱ�����Զ�ִ�е����ֻ���ڹ����������ʵ�֣��������ȴ���ܹ����Ŷ���ļ��ض�ִ��
		/*	���
		 * 
		 *  �����
		 * 	�������ɹ�
		 */
		Person p2 = new Person("SB",250);
	}
}

class Person {
	//����
	String name;
	int age;
	static String desc = "��������";
	
	//������
	public Person() {
		
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("�������ɹ�");
	}
	
	//�����
	{
		System.out.println("�����");
	}
	static {
		System.out.println("��̬�����");
	}
	
	//����
	public void eat() {
		System.out.println("�˳Է�");
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name +", age="+ age + "]";
	}
}