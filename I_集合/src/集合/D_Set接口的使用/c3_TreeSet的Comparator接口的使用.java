package 集合.D_Set接口的使用;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *  Comparator：实现定制比较（比较器）
 *  Comparable：可比较的
 */
public class c3_TreeSet的Comparator接口的使用 {
    public static void main(String[] args) {
        // 创建集合
        TreeSet<Person> t1 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {

                // 先比较age，如果年龄相同再比较 name
                int i1 = o1.age - o2.age;
                int i2 = o1.name.compareTo(o2.name);

                return i1==0 ? i2:i1;
            }
        });

        Person p1 = new Person("aaa", 99);
        Person p2 = new Person("zzz", 11);
        Person p3 = new Person("bbb", 22);

        t1.add(p1);
        t1.add(p2);
        t1.add(p3);

        System.out.println(t1);
        // [name: zzz  age:11, name: bbb  age:22, name: aaa  age:99]
    }
}
