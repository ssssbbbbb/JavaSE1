package 集合.D_Set接口的使用;

import java.util.TreeSet;

/**
 *  TreeSet添加 Person类对象
 *  其中，Person实现了Comparable接口
 *  TreeSet接口中，添加的元素必须实现Comparable接口；如果CompareTo()方法返回值为0，则认为是重复元素。
 *
 *  TreeSet：
 *      基于排列顺序实现元素不重复。
 *      实现了SortedSet接口，对集合元素自动排序。
 *      元素对象的类型必须实现Comparable接口，指定排序规则。
 *      通过CompareTo方法确定是否为重复元素
 */
public class c2_TreeSet案例 {
    public static void main(String[] args) {
        // 1、元素对象的类型必须实现Comparable接口，指定排序规则。
        // 所以，TreeSet集合添加的元素必须实现Comparable接口。
        TreeSet<Person> treeSet = new TreeSet<>();

        Person p1 = new Person("tom", 12);
        Person p2 = new Person("black", 14);
        Person p3 = new Person("mack", 16);

        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        System.out.println("元素个数："+treeSet.size());
        // 2、在Person类中重写了 compareTo()，用以制定比较各个元素的顺序的方法
        System.out.println(treeSet);
        // [name: black  age:14, name: mack  age:16, name: tom  age:12]


    }
}
