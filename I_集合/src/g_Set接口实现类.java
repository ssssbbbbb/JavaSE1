import org.junit.Test;

import java.util.*;

/**
 *          Set接口：元素无序、不可重复的集合    --> 高中数学中的集合
 *          实现类
 *              ① HashSet
 *                  作为Set接口的主要实现类，线程不安全，可以存储null值。
 *
 *              ② LinkedHashSet
 *                  作为HashSet的子类；遍历其内部数据时，可以按照添加的顺序遍历。
 *
 *              ③ TreeSet
 *                  可以按照添加对象的指定属性，进行排序。
 *
 *      1、Set接口中没有额外定义的新方法，使用的都是Collection中声明过的方法。
 */
public class g_Set接口实现类 {
    /*
        Set:存储无序的、不可重复的数据

        以HashSet为例说明：
        1、无序性：不等于随机性。存储的数据在底层数组中并非按照数组索引的顺序添加，而是根据数据的哈希值决定的。

        2、不可重复性：保证添加的元素按照equals()判断时，不能返回true。即：相同的元素只能添加一个

     */
    @Test
    public void test1(){
        Set set = new HashSet();
        set.add(123);
        set.add(456);
        set.add(new PersonTest("Jerry", 20));
        set.add(new String("Tom"));
        set.add(false);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //PersonTest@2de8284b
            //Tom
            //false
            //456
            //123
        }

    }
}
