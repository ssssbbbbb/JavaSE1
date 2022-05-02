package 集合.C_List接口的实现类;

import java.util.Enumeration;
import java.util.Vector;

/**
 *  Vector集合的使用
 *  储存结构：数组
 *
 */
public class Vector类使用 {
    public static void main(String[] args) {
        // 创建集合
        Vector vector = new Vector();

        // 1、添加元素
        vector.add("草莓");
        vector.add("西瓜");
        vector.add("苹果");
        vector.add("黄瓜");
        System.out.println(vector+"\n元素个数："+vector.size());

        // 2、删除元素 （① 根据下标量删除  ② 根据元素对象删除）
        vector.remove("黄瓜");

        // 3、遍历 （①使用枚举器     ② 使用迭代器）
        Enumeration en = vector.elements();
        while (en.hasMoreElements()){
            String s = (String) en.nextElement();
            System.out.println(s);
        }

        // 4、判断 （contains()、isEmpty()）

        // 5、其它方法
        
    }
}
