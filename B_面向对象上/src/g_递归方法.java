/**
 * 	�ݹ飨recursion������
 * 		1������
 * 			�ݹ鷽����һ���������ڵ���������
 * @author hjj
 * @time 2021��11��6�� ����3:10:04 
 *
 */
public class g_�ݹ鷽�� {
	public static void main(String[] args) {
		//����һ��������������ֻ��һ�����Ͳ�������ӡ�Ӹò�����100��������Ȼ1��֮��
		test1 t1 = new test1();
		
		int shu = t1.recursion(99);
		System.out.print(shu);
	}
}
class test1{
	public int recursion(int i) {
		if (i<=100) {
			return i+recursion(i+1);	//����Ѳ�����int i����Ϊ����һ��i+1��ֵ
		}else{
			return 0;
		}
	}
}