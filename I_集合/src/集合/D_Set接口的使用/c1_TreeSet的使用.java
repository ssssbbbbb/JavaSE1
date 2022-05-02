package 集合.D_Set接口的使用;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *  TreeSet的使用
 *  存储结构：红黑树
 *
 *  TreeSet：
 *      基于排列顺序实现元素不重复。
 *      实现了SortedSet接口，对集合元素自动排序。
 *      元素对象的类型必须实现Comparable接口，指定排序规则。
 *      通过CompareTo方法确定是否为重复元素。
 */
public class c1_TreeSet的使用 {
    public static void main(String[] args) {
        //1、创建集合
        TreeSet<String> treeSet = new TreeSet<>();
        //2、添加元素
        treeSet.add("aaa");
        treeSet.add("ccc");
        treeSet.add("EEE");
        treeSet.add("Bbb");
        System.out.println("元素个数："+treeSet.size());
        System.out.println(treeSet);
        //3、删除
        treeSet.remove("Bbb");
        //4、遍历 （增强for循环，迭代器）
        for (String s : treeSet){
            System.out.println(s);
        }

        Iterator<String> it = treeSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //5、判断
        System.out.println("是否有对象”abc“："+treeSet.contains("abc"));
        System.out.println("是否为空："+treeSet.isEmpty());


    }
}
