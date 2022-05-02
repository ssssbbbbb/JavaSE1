/**
 * 	递归（recursion）方法
 * 		1、定义
 * 			递归方法：一个方法体内调用它自身
 * @author hjj
 * @time 2021年11月6日 下午3:10:04 
 *
 */
public class g_递归方法 {
	public static void main(String[] args) {
		//定义一个方法，方法里只有一个整型参数，打印从该参数到100的所有自然1数之和
		test1 t1 = new test1();
		
		int shu = t1.recursion(99);
		System.out.print(shu);
	}
}
class test1{
	public int recursion(int i) {
		if (i<=100) {
			return i+recursion(i+1);	//这里把参数（int i）变为了上一个i+1的值
		}else{
			return 0;
		}
	}
}