package 集合.E_Map集合;

import java.util.TreeMap;

/**
 *  TreeMap的使用
 *  存储结构：红黑树
 *
 */
public class c_TreeMap的使用 {
    public static void main(String[] args) {
        TreeMap<Students, String> treeMap = new TreeMap<Students, String>();

//      1、添加元素
        Students s1 = new Students("大娃",101);
        Students s2 = new Students("二娃",102);
        Students s3 = new Students("三娃",103);
        Students s4 = new Students("四娃",104);
        treeMap.put(s1,"红色");
        treeMap.put(s2,"橙色");
        treeMap.put(s3,"黄色");
        treeMap.put(s4,"绿色");

        System.out.println("元素个数："+treeMap.size());
        System.out.println(treeMap);
        // 出现异常，因为红黑树，Students实现Comparable<Students>，然后重写compareTo，让其比较学号大小排序，最后异常解决
//      2、
    }
}
