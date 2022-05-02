import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 *  一、集合框架的概述
 *      1、集合、数组都是对多个数据进行存储操作的结构，简称Java容器
 *      说明：此时的存储，主要是内存层面的存储，不涉及到持久化的存储（.txt 数据库等就是持久化的存储容器）
 *
 *      2、数组在存储多个数据方面的特点：
 *          ① 一旦初始化以后，其长度就确定了。
 *          ② 一旦定义好后，其元素的类型也就确定了，不可存储其它类型的元素。
 *          ③ 一旦初始化以后，其长度就不可修改。
 *          ④ 数组中提供的方法非常有限，对于添加、删除、插入数据等操作非常不方便，同时效率不高。
 *          ⑤ 获取数组中实际元素的个数的需求，数组没有现成的属性或方法
 *          ⑥ 数组存储数据的特点：有序、可重复。对于无序、不可重复的需求不能满足
 *
 *   二、集合框架
 *   Java集合可以分为Collection 和 Map两种体系
 *      1、Collection接口：单例数据，定义了存取一组对象的方法的集合
 *         List接口和Set接口都实现了Collection接口
 *
 *          List接口：元素有序、可重复的集合    --> “动态”数组
 *          实现类
 *              ① ArrayList
 *              ② LinkedList
 *              ③ Vector
 *
 *          Set接口：元素无序、不可重复的集合    --> 高中数学中的集合
 *          实现类
 *              ① HashSet
 *              ② LinkedHashSet
 *              ③ TreeSet
 *
 *      2、Map接口：双列数据，保存具有映射关系 键值对 的集合
 *          实现类
 *              ① HashMap
 *              ② LinkedHashMap
 *              ③ TreeMap
 *              ④ HashTable
 *              ⑤ Properties
 *
 *   三、Collection接口中的方法使用
 */
public class a_集合框架的概述 {
    /*
        1、add(Object e) : 集合添加元素。
        2、size() : 返回此集合中的元素数。
        3、addAll() : 将指定集合中的所有元素添加到此集合(可选操作)。
        4、clear() : 清空集合元素
        5、isEmpty() : 判断当前集合是否为空
     */
    @Test
    public void test1(){
        Collection coll = new ArrayList();

        // add(Object e) : 集合添加元素。
        coll.add("qwq");
        coll.add(123);  // 自动装箱，将int数据自动装箱为包装类Integer
        coll.add(new Object());

        // size() : 返回此集合中的元素数。
        System.out.println(coll.size());    // 3

        Collection call2 = new ArrayList();
        call2.add(1+1);
        call2.add("sb");

        // addAll() : 将指定集合中的所有元素添加到此集合(可选操作)。
        coll.addAll(call2);
        System.out.println(coll.size());    // 5

        // clear() : 清空集合元素
        coll.clear();

        // isEmpty() : 判断当前集合是否为空
        if (coll.isEmpty()){
            System.out.println("元素为空");
        }else {
            System.out.println("不为空");
        }
    }

}



