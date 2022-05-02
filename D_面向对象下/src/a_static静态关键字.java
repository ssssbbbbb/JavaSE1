/**
 * 	static�ؼ��ֵ�ʹ��
 * 
 * 	�� static  ��̬��
 * 	�� static�����������Σ����ԡ�����������顢�ڲ���
 * 	�� static���εķ����ﲻ��ʹ��this��super�ؼ���
 * 	
 * 	һ��ʹ��static��������
 * 		1�����԰�װ�Ƿ�static���Σ���Ϊ	�� ��̬����(��̬����)	�� �Ǿ�̬����(ʵ������)
 * 		
 * 		2����̬���ԣ������������һ������������һ����̬���ԣ������˶������������һ��������������ľ�̬����ֵ����������ľ�̬���Ե�ֵҲ����ű仯��
 * 		
 * 		3��static�������Ե�����˵����
 * 			�� ��̬����������ļ��ض����أ���������ǰ��Ҫ������ص��ڴ��е��ù�����������̬�������������ʱ����ش��ڵ�
 * 			�� ��̬�����ļ���Ҫ���ڶ���Ĵ�������ͨ���������ڶ���ļ��ع����л���غ�����ص�
 * 			�� ��̬��������ֱ������ȥ���ã�ClassName.StaticValue
 * 			�� ������ֻ�����һ�Σ���̬�������ڴ���Ҳֻ�����һ��
 * 
 * 	����ʹ��static���η���
 * 		�� ������ļ��ض�����
 * 
 * 		�� ��̬�����У�ֻ�ܵ��þ�̬�ķ���������  ��ϸ��59-66��
 * 	
 * 	
 * 
 * 
 * @author hjj
 * @time 2021��11��13�� ����4:05:09 
 *
 */
public class a_static��̬�ؼ��� {

	public static void main(String[] args) {
		
		Chinese c1 = new Chinese("���ţ",28);
		System.out.println(c1.nationality);
		
		Chinese c2 = new Chinese("��С��",25);
		System.out.println(c2.nationality);
		
		//equalsIgnoreCase() �������ڽ��ַ�����ָ���Ķ���Ƚϣ������Ǵ�Сд��
		System.out.println(c1.nationality.equalsIgnoreCase(c2.nationality));
		
		c1.show(c1.name, c1.age);
	}

}

class Chinese {
	String name;
	int age;
	// nationality ����
	static String nationality = "�й�";
	
	public Chinese(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//���ܶԷǾ�̬���Խ��о�̬���ã��������Ĳ����Ͳ���������ԣ�����һ����name���ַ�������		name!=this.name  name=String.name
	public static void show(String name,int age) {
		System.out.println(name+"����"+age+"  ����"+ Chinese.nationality);
	}
	//������Ǿ�̬��show�������õ�name��age���Ǹö����name��age		name=this.name  age=this.name
	public void show() {
		System.out.println(this.name+"����"+age+"  ����"+ Chinese.nationality);
	}
}