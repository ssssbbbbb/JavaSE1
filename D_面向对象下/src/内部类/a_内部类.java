package �ڲ���;
/**		����ڲ���Ա֮�壺�ڲ���
 * 	1��Java������һ������������һ��������棬�����������ͳ�֮Ϊ�ڲ��࣬��������Ϊ�ⲿ��
 * 
 * 	2���ڲ���ķ��ࣺ��Ա�ڲ���   or  �ֲ��ڲ���(�����ڡ�������ڡ���������)
 * 		�ڲ�����Ϊһ���࣬���Ĺ�������ͨ���������ͬ�����Զ������ԡ��������������ȣ����Ա����η�����
 * 		�ڲ�����Ϊһ����Ա�����Ϳ��Ե����ⲿ��Ľṹ
 * 
 * 	һ�����ʵ������Ա�ڲ���Ķ���
 * 
 *  ��������ڳ�Ա�ڲ��������ֵ����ⲿ��Ľṹ
 * 		��������ⲿ���name�������ڲ���Ҳ�и�name
 * 		public void getName(String name){
 * 			System.out.println(name);  //���ǲ�������name
 * 			System.out.println(this.name);  //�����ڲ�������name
 * 			System.out.println(�ⲿ��.this.name); 	//�����ⲿ�������name
 * 		}
 * 
 *  ���������оֲ��ڲ����ʹ��
 */
public class a_�ڲ��� {
	public static void main(String[] args) {
		//����SSR��ʵ�����󣨾�̬�ĳ�Ա�ڲ��ࣩ
		a_test.SSR ssr = new a_test.SSR();
		ssr.ssrTest();
		
		//�����Ǿ�̬���ڲ��� SS
		a_test test = new a_test();
		a_test.SS ss = test.new SS();
		ss.ssTest();
	}
}

class a_test {
	
	public class SS {
		//��Ա�ڲ���
		
		public void ssTest() {
			System.out.println("�Ǿ�̬�ڲ���ķ���");
		}
	}
	
	static class SSR {
		//��̬��Ա�ڲ���
		
		public void ssrTest() {
			System.out.println("ŷ�ʼݵ���");
		}
	}
	
	public void method() {
		//�ֲ��ڲ���  �ڷ�����
		class AA{
			
		}
	}
	
	{
		//�ֲ��ڲ���  �ڴ������
		class BB {
			
		}
	}
	
	public a_test() {
		//�ֲ��ڲ���   �ڹ�������
		class CC {
			
		}
	}
}