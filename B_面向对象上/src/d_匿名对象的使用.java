/**
 * 	һ����������
 * 		1����⣺���Ǵ����Ķ���û����ʽ�ĸ���һ������������Ϊ��������
 * 		2����������������ֻ�ܵ���һ�Σ������ڸ�һ�������������Ը�ֵ���ٴε��ø����Է���ֵ���ǿյģ�Ҳ����˵��������������һ�ξ�ֱ�Ӷ����ġ�
 * 			new Phone().price = 100;
 *			System.out.println(new Phone().price);	
 *			�����0.0		
 *		����������ֱ�ӳ����ڶѿռ��е�ʵ��ֵ
 * 	����������������Ϊ����
 * 		�β��Ǿֲ��������βε��������ڷ����ڡ�������������ֱ�ӳ����ڶ��е�ʵ��ֵ��
 * 		��������ķ�������Ҫ����Phone����Ϊ����
 * 		-------------------------------------------------------
 *		public void show(Phone phone) {
		phone.sendEmail();
		phone.playGame();
		}
		-------------------------------------------------------
		�����ʱ��һ������������Ϊ��������÷����У���ô�ֲ�������Ҳ�����β�phone����ͻᴢ������������ڶѿռ��еĵ�ֵַ
		
 */
public class d_���������ʹ�� {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.price = 1050;
		
		p1.sendEmail();
		p1.playGame();
		
		//��������:���¶��󣬵�û�ж�����
		new Phone().sendEmail();
		new Phone().playGame();
		
		//
		new Phone().price = 100;
		System.out.println(new Phone().price);	//0.0
		
		showPhone sp = new showPhone();
		sp.show(new Phone());
		// �����ʼ���
		// ����Ϸ��
		// Phone@53bd815b
	}
}

class Phone{
	double price;//�۸�
	
	public void sendEmail() {
		System.out.println("�����ʼ���");
	}
	
	public void playGame() {
		System.out.println("����Ϸ��");
	}
	
}
class showPhone{
	
	public void show(Phone phone) {
		phone.sendEmail();
		phone.playGame();
		System.out.println(phone);//����������������������ô�β��ﴢ��ľ��Ǹ����������ڶѿռ��еĵ�ֵַ
	}
}