/**
 *	ʹ�ö�λ�����ӡһ��10�е��������
 *	��ʾ��
 *		1����һ����һ��Ԫ�أ���n����n��Ԫ��
 *		2��ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض���1
 *		3���ӵ����п�ʼ�����ڷǵ�һ��Ԫ�غ����һ��Ԫ�ص�Ԫ�أ���ֵΪ arr1[i][j] = arr1[i-1][j-1] + arr1[i-1][j] ������ʽ
 * 
 *
 */
public class c_��ά�����Ӧ�� {
	public static void main(String[] args) {
		int[][] arr1 = new int[10][];
		
		for (int i=0; i<arr1.length; i++) {
			//��arr1����Ӧ���±�����λ�ã������µĵ�ַ���������ֵַָ��ľ����ڲ�Ԫ����������ڶѵĵ�ַ����ʱ���Ͱ����Ԫ�������ʼ���ɹ���
			arr1[i] = new int[i + 1];	//arr1[i]���Ԫ�أ�������Ϊһ��int���飬�������ĳ���Ϊi+1
			
			//����ĩβ��ֵ
			arr1[i][0] = arr1[i][i] = 1;
			
			if (i > 1) {
				for (int j = 1; j < arr1[i].length - 1; j++) {	// (j = 1) �� (arr1[i].length - 1)�������������ų����׺�β�ĵ���                                                                                    
					arr1[i][j] = arr1[i-1][j-1] + arr1[i-1][j];
				}
			}
			
			
		}
		
		for (int i=0; i < arr1.length; i++) {
			for (int j=0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
