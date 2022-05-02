package 接口;
/**
 * 	接口的应用：代理模式
 * 		代理模式是Java开发中使用较多的一种设计模式。代理设计就是为其他对象提尕一种代理以控制对这个对象的访问。
 * 
 * 	
 * @author hjj
 * @time 2021年11月14日 上午11:40:46 
 *	① 创建接口 NetWork   ② 创建被代理类 Server 实现接口NetWork  ③ 创建被代理类 ProxyServer 实现接口NetWork 
 *	用 代理类 去实现 被代理类 需要执行的操作，而 代理类 能处理的事情可能更多，就比如以下例子，代理类 执行 被代理类方法 之前还能检测一下 被代理类。
 */
public class b_接口的代理模式 {
	public static void main(String[] args) {
		Server server = new Server();
		ProxyServer proxy = new ProxyServer(server);
		
		proxy.browse();
	}
}

interface NetWork {  //网络类
	
	public void browse();	//浏览
	
}

//被代理类
class Server implements NetWork {

	@Override
	public void browse() {
		System.out.println("真实的服务器访问网络");
		
	}
	
}

//代理类
class ProxyServer implements NetWork {
	private NetWork work;
	
	public ProxyServer(NetWork work) {
		this.work = work;
	}
	
	public void check() {
		System.out.println("联网前的检查工作");
	}

	@Override
	public void browse() {
		check();
		
		work.browse();
	}
	
}