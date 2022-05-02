package 集合.D_Set接口的使用;

import java.util.HashSet;

/**
 *  HashSet集合的使用
 *  存储结构：哈希表（数组+链表）
 *  存储过程：   ① 根据hashcode计算保存的位置，如果此位置为空，则直接保存，如果不为空则执行第二步；
 *              ② 当传入的元素的哈希码与当前数组位置的元素的哈希码相同时，就（equals）比较二者是否是相同的元素，
 *              如果是就拒绝存入，否则就存入该数组内的列表里。
 *
 *
 *  无序的，不允许重复
 */
public class b1_HashSet集合使用 {
    public static void main(String[] args) {
        // 1、创建集合
        HashSet<String> hashSet = new HashSet<>();
        // 2、添加元素
        hashSet.add("大王");
        hashSet.add("小王");
        hashSet.add("尖子");
        hashSet.add("老K");
        hashSet.add("皮蛋");
        hashSet.add("勾");
        System.out.println("元素个数："+hashSet.size());
        System.out.println(hashSet);
        // 3、删除
        hashSet.remove("勾");
        System.out.println("删除后："+hashSet);
        // 4、遍历     增强for、迭代器
        // 5、判断
    }
}
