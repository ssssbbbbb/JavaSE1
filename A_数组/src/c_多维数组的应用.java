/**
 *	使用二位数组打印一个10行的杨辉三角
 *	提示：
 *		1、第一行有一个元素，第n行有n个元素
 *		2、每一行的第一个元素和最后一个元素都是1
 *		3、从第三行开始，对于非第一个元素和最后一个元素的元素，其值为 arr1[i][j] = arr1[i-1][j-1] + arr1[i-1][j] 这种形式
 * 
 *
 */
public class c_多维数组的应用 {
	public static void main(String[] args) {
		int[][] arr1 = new int[10][];
		
		for (int i=0; i<arr1.length; i++) {
			//把arr1所对应的下标量的位置，存入新的地址，而这个地址值指向的就是内层元素数组的所在堆的地址。这时，就帮外层元素数组初始化成功了
			arr1[i] = new int[i + 1];	//arr1[i]这个元素，被定义为一个int数组，这个数组的长度为i+1
			
			//给首末尾赋值
			arr1[i][0] = arr1[i][i] = 1;
			
			if (i > 1) {
				for (int j = 1; j < arr1[i].length - 1; j++) {	// (j = 1) 和 (arr1[i].length - 1)这两个条件就排除了首和尾的调用                                                                                    
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
