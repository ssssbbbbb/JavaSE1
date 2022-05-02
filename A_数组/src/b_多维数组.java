/**
 * 	一、理解
 * 		多维数组，相当于数组里面储存的元素是一群数组。
 * 		外层元素是数组，内层元素是外层元素数组里的元素。
 *	二、二维数组的使用
 *		① 二维数组的初始化
 *			int[][] array1 = new int[][]{{1,2,3},{1},{1,2,3,4,5}}
 *			静态初始化的好处是可以随意定义外层与内层数组元素的个数
 *		② 如何调用数组的指定位置和元素
 *		③ 二维数组的长度
 *			只能得到最外面的数组长度，或者得到里面各个数组的长度
 *		④ 如何遍历二维数组
 *		⑤ 数组元素的默认初始化值
 *			拿int数组为例：数组名内储存的是地址值；外层元素数组内如果没有内存元素的地址值，那么默认初始化值就是null；内层元素内的默认初始化值是0
 *		⑥ 数组内存分析
 * 			声明的二位数组名内的值储存在栈 是指向 堆里外层元素数组位置的地址值，外层元素数组里存储的值是 储存在堆中 指向内层元素的地址值，内层元素的值就是存在与堆中的值
 *
 */
public class b_多维数组 {
	public static void main(String[] args) {
		System.out.println("① 二位数组的初始化 ===========================================================================");
		//静态初始化
		int[][] array1 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};		// array1[3][3]
		//动态初始化1
		int[][] array2 = new int[3][3];		//这个初始化，在栈里储存的是array2的地址值；栈指向的堆里的元素是数组，因此堆里的这些数组他们储存的却是堆里另外的元素的地址值
		System.out.println(array2);			//[[I@156643d4
		System.out.println(array2[0]);		//[I@156643d4
		System.out.println(array2[1]);		//[I@123a439b
		System.out.println(array2[2]);		//[I@7de26db8
		System.out.println(array2[2][0]);	//0
		//动态初始化2
		int[][] array3 = new int[3][];		//这个初始化，在栈里储存的是array3的地址值；栈指向的堆里的元素是数组，而堆里的这些数组则就没有值
		System.out.println(array3);			//[[I@36aa7bc2
		System.out.println(array3[0]);		//null
		//System.out.println(array3[0][0]);	错误！不能从 Int数组加载， 因为 array3[0] 是空的。
		//array3[0][0] = 00;
		//System.out.println(array3[0].length);	Cannot store to int array because "array3[0]" is null
		//多维数组的多种写法
		int[] arr1[] = {{1,2,3},{1,2,3}};
		int[] arr2[] = new int[][] {{1,2,3},{1,2},{1,2,3,4}};
		
		System.out.println("② 如何调用数组的指定位置和元素 ===================================================================");
		//跟一维数组差不多，靠下标量调用
		System.out.println(array1[0][1]);	//2
		
		// ③ 二维数组的长度 ==============================================================================================
		System.out.println(array1.length);	//3
		System.out.println(array1[0].length);	//3
		
		System.out.println("④ 如何遍历二维数组 ===========================================================================");
		for (int i = 0; i < array1.length; i++) {
			for (int n = 0; n < array1[i].length; n++) {
				System.out.println(array1[i][n]);	//依次输入1——9
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
