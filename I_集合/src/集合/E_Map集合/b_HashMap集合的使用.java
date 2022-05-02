package 集合.E_Map集合;

import java.util.HashMap;
import java.util.Map;

/**
 *  HashMap集合的使用
 *  存储结构：哈希表（数组+链表+红黑树）
 */
public class b_HashMap集合的使用 {
    public static void main(String[] args) {
        // 创建集合
        HashMap<Students, String> hashMap = new HashMap<>();
//      1、添加元素
        Students s1 = new Students("大娃",101);
        Students s2 = new Students("二娃",102);
        Students s3 = new Students("三娃",103);
        Students s4 = new Students("四娃",104);

        hashMap.put(s1,"红色");
        hashMap.put(s2,"橙色");
        hashMap.put(s3,"黄色");
        hashMap.put(s4,"绿色");

        hashMap.put(new Students("大娃",101),"红色");    // 为什么这里成功添加了一个重复的元素？

        // 因为HashMap集合是使用 key的hashcode和equals作为重复的依据的
        // 由于这里添加的匿名函数对象，所以与第一次添加的元素地址不同而且equals也不同，从而导致Java以为这两个是不同的元素
        // 因此，如果需要解决这一问题，我们就需要重写key的hashcode()和equals()。（这里的key就是Students类）
        // 重写了key的hashcode()，令相同name和id的对象返回的哈希值相同，再重写了equals()，使其在比较时只比较哈希值是否相同，这样就可以避免添加属性相同的匿名元素了

        System.out.println("添加元素个数："+hashMap.size());
        System.out.println(hashMap);    // 在Students类中已经重写toString()方法了，因为原来的toString()返回的是对象的地址，这样可读性不高

//      2、删除
        hashMap.remove(s4);     // 删除不了匿名对象元素，因此添加元素时尽量不要添加匿名函数
        System.out.println("删除之后元素还剩："+hashMap.size());

//      3、遍历
        //使用ketSet();
        for (Students s : hashMap.keySet()){
            System.out.println(s.toString()+"-----"+hashMap.get(s));
        }
        System.out.println("\n\n\n");
        //使用entrySet();
        for (Map.Entry<Students,String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey()+"-----"+entry.getValue()+"  hashcode:"+entry.hashCode());
        }

//      4、判断
        System.out.println(hashMap.containsKey(new Students("大娃",101)));    // 如果此映射包含指定键的映射，则返回true
        System.out.println(hashMap.containsValue("黄色"));
    }
}
















