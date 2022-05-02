import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *      List接口方法
 *      List除了从Collection集合继承的方法外，List集合里添加了一些根据索引来操作集合元素的方法。
 *        1、void add(int index, Object ele):在index位置插入ele元素
 *        2、boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
 *        3、Object get(int index)：获取指定index位置的元素
 *        4、int indexOf(Object obj)：返回obj在集合中首次出现的位置
 *        5、int lastIndexOf(Object obj)：返回obj在当前集合中末次出现的位置
 *        6、Object remove(int index)：移除指定index位置的元素，并返回此元素
 *        7、Object set(int index,Object ele):设置指定index位置的元素为ele
 *        8、List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合
 *
 *      总结：常用方法
 *      增：add(Object obj)
 *      删：remove(int index) /   remover(Object obj)
 *      改：set(int index, Object ele)
 *      查：get(int index)
 *      插：add(int index, Object ele)
 *      长度：size()
 *      遍历：① Iterator迭代器方式
 *           ② 增强for循环
 *           ③ 普通循环
 */
public class f_List接口中的常用方法 {
    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        list.add(new String("wdnmd"));
        System.out.println(list);   // [wdnmd]

        //  1、void add(int index, Object ele):在index位置插入ele元素
        list.add(0, "插队到第一个");
        System.out.println(list);   // [插队到第一个, wdnmd]

        //  2、boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
        List list1 = Arrays.asList(1, 2, 3);
        list.addAll(list1);
        System.out.println(list);   // [插队到第一个, wdnmd, 1, 2, 3]


    }
}
