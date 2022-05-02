package �ӿ�;
/**
 * 	�ӿڵ�Ӧ�ã�����ģʽ
 * 		����ģʽ��Java������ʹ�ý϶��һ�����ģʽ��������ƾ���Ϊ������������һ�ִ����Կ��ƶ��������ķ��ʡ�
 * 
 * 	
 * @author hjj
 * @time 2021��11��14�� ����11:40:46 
 *	�� �����ӿ� NetWork   �� ������������ Server ʵ�ֽӿ�NetWork  �� ������������ ProxyServer ʵ�ֽӿ�NetWork 
 *	�� ������ ȥʵ�� �������� ��Ҫִ�еĲ������� ������ �ܴ����������ܸ��࣬�ͱ����������ӣ������� ִ�� �������෽�� ֮ǰ���ܼ��һ�� �������ࡣ
 */
public class b_�ӿڵĴ���ģʽ {
	public static void main(String[] args) {
		Server server = new Server();
		ProxyServer proxy = new ProxyServer(server);
		
		proxy.browse();
	}
}

interface NetWork {  //������
	
	public void browse();	//���
	
}

//��������
class Server implements NetWork {

	@Override
	public void browse() {
		System.out.println("��ʵ�ķ�������������");
		
	}
	
}

//������
class ProxyServer implements NetWork {
	private NetWork work;
	
	public ProxyServer(NetWork work) {
		this.work = work;
	}
	
	public void check() {
		System.out.println("����ǰ�ļ�鹤��");
	}

	@Override
	public void browse() {
		check();
		
		work.browse();
	}
	
}