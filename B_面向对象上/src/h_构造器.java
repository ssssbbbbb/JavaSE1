/**
 * 	һ�������������캯�������췽����constructor
 * 			�κ�һ�����ж��й�����
 * 		1�����ã���������
 * 			
 * 		2��˵�������û����ʽ�Ķ�����Ĺ������Ļ�����ϵͳĬ���ṩһ���ղεĹ�����
 * 
 * 		3��һ�����п��Զ��������������˴˹�������
 * 
 * 		4��һ������ֱ�Ӷ����˹�������ϵͳ�Ͳ����ṩĬ�ϵĿղι������ˣ���ʱ�����Ҫ�ղι���������Ҫ�Լ�ȥ����
 * 
 * @author hjj
 * @time 2021��11��6�� ����4:03:34 
 *
 */
public class h_������ {
	public static void main(String[] args) {
		//��  ʵ������ = new  ������();
		
		h_Test h1 = new h_Test();	//����ʹ�õ��ǿղεĹ������������Ķ���
		h1.show();	//�����null��0
		
		h_Test h2 = new h_Test("Tom",19);	//����ʹ�õ���ʵ�εĹ������������Ķ���
		h2.show();	//�����Tom��19
		
	}
}

class h_Test{
	String name;
	int age;
	
	public h_Test() {
		//�ղι�����
		show();
	}

	public h_Test(String name, int age) {
		//ʵ�ι�����
		this.name = name;
		this.age = age;
		show();
	}
	
	public void show() {
		System.out.println(name+"��"+age);
	}
	
}