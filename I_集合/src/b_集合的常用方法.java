import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class b_集合的常用方法 {
    /*  1、contains(Object obj) : 判断当前集合是否包含obj。
        2、containsAll(Collection coll) : 判断当前集合中是否包含另外一个集合coll。
        3、remove(Object obj) : 移除集合中的指定元素。
        4、removeAll(Collection coll) : （差集）从当前集合中移除coll包含的所有元素。
        5、retainAll(Collection coll) : （交集）获取当前集合和coll的相同的元素，并把当前集合的内容更改为以上相同的元素。
        6、equals(Object obj) : 判断当前集合和形参，如果当前集合和形参集合的元素顺序与值都相同，便返回true。
        7、hashCode() : 返回当前对象的哈希值。
        8、将 集合 转化为 数组 : toArray()
        9、iterator() : 返回Iterator迭代器接口的实例，用于遍历集合元素。
     */
    @Test
    public void test1(){
        Collection coll = new ArrayList();

        coll.add(new String("啊啊啊啊"));   // new String("啊啊啊啊") == "啊啊啊啊"
        coll.add(true);
        coll.add(new b_集合的常用方法());

        // 1、contains(Object obj) : 判断当前集合是否包含obj -------------------------------------------------------------
        System.out.println(coll.contains(true));    // true
        System.out.println(coll.contains(new String("啊啊啊啊")));  // true
        // 因为重新初始化的String匿名对象也包含，所以，此方法判断的是内容是否包含。
        System.out.println((new String("啊啊")) == (new String("啊啊")));   // false

        // containsAll(Collection coll) : 判断当前集合中是否包含另外一个集合coll ------------------------------------------
        Collection coll2 = new ArrayList();
        coll2.add("wwwwww");
        coll2.add(123);
        coll2.add(false);

        System.out.println(coll.containsAll(coll2));    // false
    }

    @Test
    public void test2(){
        b_集合的常用方法 bbb = new b_集合的常用方法();
        Collection coll = new ArrayList();

        coll.add(new String("啊啊啊啊"));
        coll.add(true);
        coll.add(bbb);
        coll.add(123);
        coll.add("sb");

        // 3、remove(Object obj) : 移除集合中的指定元素。-----------------------------------------------------------------
        coll.remove(bbb);
        System.out.println(coll);   // [啊啊啊啊, true, 123, sb]

        // 4、removeAll(Collection coll) : （差集）从当前集合中移除coll包含的所有元素。--------------------------------------
        Collection coll2 = new ArrayList();
        coll2.add("啊啊啊啊");
        coll2.add(123);
        coll2.add(false);

        coll.removeAll(coll2);
        System.out.println(coll);   // [true, sb]

        // 5、retainAll(Collection coll) : （交集）获取当前集合和coll的相同的元素，并把当前集合的内容更改为以上相同的元素。-------
        Collection coll3 = new ArrayList();
        coll3.add("890");
        coll3.add("abc");
        coll3.add(false);
        coll3.add("sb");

        coll.retainAll(coll3);
        System.out.println(coll);   // [sb]

        // 6、equals(Object obj) : 判断当前集合和形参，如果当前集合和形参集合的元素顺序与值都相同，便返回true。
        Collection coll4 = new ArrayList();
        coll4.add("yyds");
        coll4.add("sb");

        coll.add("yyds");
        System.out.println("coll--"+coll+"   coll4--"+coll4);   // coll--[sb, yyds]   coll4--[yyds, sb]

        System.out.println(coll.equals(coll4));     // false
    }

    @Test
    public void test3(){
        Collection coll = new ArrayList();

        coll.add(new String("啊啊啊啊"));
        coll.add(true);
        coll.add(123);
        coll.add("sb");

        // 8、将 集合 转化为 数组 : toArray()
        Object[] objArr = coll.toArray();   // 将集合coll转化为Object类型数组
        System.out.println(objArr); // [Ljava.lang.Object;@78ac1102

        // 将 数组 转化为 集合 : 调用Arrays类的静态方法 asList()
        List<String> list = Arrays.asList(new String[]{"aa","bb","cc"});
        System.out.println(list);   // [aa, bb, cc]

        // 9、iterator() : 返回Iterator接口的实例，用于遍历集合元素。
    }
}
