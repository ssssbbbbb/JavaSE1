/**
 * 	一、数组的概述
 * 		1、数组是什么
 * 			在Java中，数组（Array）是多个相同类型数据按一定顺序排列的集合，并使用一个名字命名，并通过编号的方式对这些数据进行统一管理。
 * 
 * 		2、数组的常见概念
 * 			① 数组名
 * 			② 下标量（索引值）
 * 			③ 元素
 * 			④ 数组的长度
 * 
 * 		3、数组的特点
 * 			① 数组是有序排列的
 * 			② 数组属于引用数据类型
 * 			③ 数组内的元素既可以是引用数据量类型，也可以是基本数据类型。
 * 			④ 创建数组对象会在内存中开辟一整块连续的空间
 * 			⑤ 数组的长度一旦确定就不能更改
 * 
 * 		4、数组的分类
 * 			① 按照维数：一维数组、二维数组……
 * 			② 按照数组元素的类型：基本数据类型元素数组、引用数据类型元素数组
 * 		
 * 		5、一维数组的使用
 * 			① 一维数组的声明和初始化
 * 				数组的初始化分为：静态初始化和动态初始化
 * 			② 如何调用数组的指定位置的元素
 * 				通过元素所处的下表量进行调用
 * 			③ 如何获取数组的长度
 * 				使用属性“length”
 * 			④ 如何遍历数组
 * 				使用for循环
 * 			⑤ 数组元素的默认初始化值
 * 				数组元素是整型默认初始化值为0
 *				数组元素是浮点型默认初始化值为0.0
 *				数组元素是char型默认初始化值为0或’\u0000’，而非字符型’0’
 *				数组元素是boolean型默认初始化值为false
 *				数组元素是引用数据类型默认初始化值为null
 * 			⑥ 数组的内存解析
 *
 */
public class a_数组的概述 {

	public static void main(String[] args) {
	//① 一维数组的声明和初始化 =========================================================
		//Ⅰ先看看普通变量是怎样初始化的 ------------
		int i1;	//声明
		i1 = 10; //初始化
		int i2 = 10; //声明并初始化
		
		//Ⅱ数组初始化 ------------------------
			
		int[] array1;	
		array1 = new int[] {1,2,3,4,5,6};
		
		//静态初始化:数组和数组元素一同初始化
		int[] array2 = new int[] {1,2,3,4,5,6};	
		//动态初始化:数组先初始化，但元素还未初始化
		int[] array3 = new int[6];
		
		//总结：数组一旦初始化完成，其长度就确定了
		
	//② 如何调用数组的指定位置的元素 =====================================================
		//数组array3的元素还未初始化，因此可以根据元素所对应的数组下标量进行调用赋值
		array3[0] = 1001;
		array3[1] = 1002;
		array3[2] = 1003;
		array3[3] = 1004;
		array3[4] = 1005;
		array3[5] = 1006;
		//array3[6] = 1007;	错误！超出数组最大下标量！因为数组第一个元素下标量为0，所以它最后一个下标量应该是（总长度-1）
		
		//需要调用哪个元素就用那个元素所在的下标量进行调用
		System.out.println(array3[3]);
		
	//③ 如何获取数组的长度 ============================================================
		//通过属性:length 来获取数组长度
		System.out.println(array3.length);
	
	//④ 如何遍历数组
		//for循环等都可以
		for (int i = 0; i < array3.length ; i++) {
			System.out.println(array3[i]);
		}
		
	//⑥ 数组的内存解析
		System.out.println(array1);
		System.out.println(array2);
		System.out.println(array3);
		//输出 地址值，也就是栈里面储存的值，而这个值指向的是堆空间里的元素值。
		//[I@156643d4
		//[I@123a439b
		//[I@7de26db8

		 
	}

}