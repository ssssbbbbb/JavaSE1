package 集合.D_Set接口的使用;

import java.util.HashSet;

public class b2_HashSet案例 {
    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<>();

        Person p1 = new Person("aaa", 10);
        Person p2 = new Person("bbb", 11);
        Person p3 = new Person("ccc", 12);
        Person p4 = new Person("ddd", 13);
        Person p5 = new Person("eee", 14);

        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        hashSet.add(p4);
        hashSet.add(p5);
        System.out.println("添加的元素个数："+hashSet.size());

        for (Person p : hashSet){
            System.out.println(p.toString());   //这里的Person类重写过toString方法，如果不重写就只会打印地址出来
        }

        // HashSet元素不重复，如果重复就不保存，但不会报错
        // 如果想要按照自己的方法判断是否保存，则就要重写 hashCode()， 在被添加的类里
        Person p6 = new Person("aaa", 10);
        System.out.println("元素个数："+hashSet.size());

    }
}
