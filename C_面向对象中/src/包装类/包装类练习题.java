package 包装类;

import java.util.Scanner;
import java.util.Vector;

/*	题目：利用Vector类代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级。
 * 
 * 	API - java.util.Vector<E>
 * 	Vector类实现了可增长的对象数组。 像数组一样，它包含可以使用整数索引访问的组件。 但是， Vector的大小可以根据需要增大或缩小，以便在创建Vector后添加和删除项目。
 * 
 * 	Vector() 											构造一个空向量，使其内部数据数组的大小为 10 ，其标准容量增量为零。
	Vector​(int initialCapacity) 						构造一个具有指定初始容量且容量增量等于零的空向量。
	Vector​(int initialCapacity, int capacityIncrement) 	构造具有指定初始容量和容量增量的空向量。
	Vector​(Collection<? extends E> c) 					按照集合的迭代器返回的顺序构造一个包含指定集合元素的向量。 
 */
public class 包装类练习题 {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		System.out.println("请输入学生成绩\n");
		
		for(;;) {
			Scanner s = new Scanner(System.in);
			int i = s.nextInt();
			if (i < 0) {
				break;
			}else if (i > 100){
				System.out.println("非法输入");
				break;
			}
			Integer in = new Integer(i);
			v1.addElement(in);
			
			//获取最大值
			int maxValue = 0;
			if(maxValue < i) {
				maxValue = i;
			}
		}
			//遍历并输出最高成绩
			for(int int1=0;int1 <v1.size();int1++) {
				Object obj = v1.elementAt(int1);
				Integer inScore = (Integer)obj;
				int scor = inScore.intValue();
				
				String dj;//等级
				if(scor < 60) {
					dj = "D";
				}else if(scor >= 60 && scor < 80) {
					dj = "C";
				}else if(scor >= 80 && scor < 90) {
					dj = "B";
				}else {
					dj = "A";
				}
				System.out.println("成绩"+scor+"   等级"+dj);
			}
		
		
		
	}
}
