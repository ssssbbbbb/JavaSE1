package 集合.D_Set接口的使用;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *  Set接口的使用
 *  Set子接口的实现类：① HashSet    ② TreeSet
 *
 *
 */
public class a_Set接口的使用 {
    public static void main(String[] args) {
        // 1、创建集合
        Set<String> set = new HashSet<>();
        // 2、添加数据
        set.add("苹果");
        set.add("草莓");
        set.add("西瓜");
        System.out.println("数据个数："+set.size());
        System.out.println(set.toString());     // 此段相当于：System.out.println(set);
        // 3、删除数据
        set.remove("西瓜");
        // 4、遍历     强制for循环、迭代器
        System.out.println("-----使用迭代器-----");
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        // 5、判断
        System.out.println(set.isEmpty());  //是否为空
        System.out.println(set.contains("西瓜")); //是否拥有此元素
    }
}
