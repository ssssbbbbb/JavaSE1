/**
 * 	һ��toString()������ʹ��
 * 		������toString() ��������ָ��������ַ�����ʽ��
 * 		
 * 		1�����������һ�����������ʱ��ʵ���Ǿ��ǵ��õ�ǰ�����toString()
 * 			System.out.println(����);   ����   System.out.println(����.toString);
 * 
 * 		2��Object���У�toString()�Ķ���
 * 
 * 			   public String toString() {
        			return getClass().getName() + "@" + Integer.toHexString(hashCode());
    		   }
 * 		
 * 		3����String�ࡢData�ࡢFile�ࡢ��װ��ȶ���д��Object���е�toString������
 * 			ʹ���ڵ��ö����toString����ʱ�����ء�ʵ�����ݡ���Ϣ(�Լ���Ҫ������)��
 * 
 * 		4���Զ�����Ҳ������дtoString�����������ô˷���ʱ�����ض���ġ�ʵ�����ݡ���
 * 
 * @author hjj
 * @time 2021��11��11�� ����6:10:58 
 *
 */
public class e_toString���� {
	public static void main(String[] args) {
		Atest a1 = new Atest();
		
		System.out.println(a1);	 //Atest@123a439b
		System.out.println(a1.toString());	//Atest@123a439b
		
		e_test test1 = new e_test();
		
		System.out.println(test1.toString());
		
	}
}
 class Atest {
	 String name = "aa";
	 int age = 1;
	 
	 public void AA() {
		 System.out.println("AAAAAAA");
	 }
 }
 
//��дObject�ڵ�toString������ʹ������Լ���Ҫ����ֵ��
class getStringTest {
	
	@Override
	public String toString() {		
		return getClass().getName() +"  " + getClass(); 
	}
}
 
 class e_test extends getStringTest {
	 String name = "SB";
	 int age = 20;
 }
 
 
 
 
 
 
 
 