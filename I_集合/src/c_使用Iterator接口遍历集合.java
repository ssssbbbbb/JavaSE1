import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *  使用Iterator接口遍历集合元素
 *
 * Iterator对象称为迭代器(设计模式的一种)，主要用于遍历Collection集合中的元素。
 *
 * GOF给迭代器模式的定义为：提供一种方法访问一个容器(container)对象中各个元素，而又不需暴露该对象的内部细节。
 * 迭代器模式， 就是为容器而生。类似于“公交车上的售票员”、 “火车上的乘务员”、 “空姐”
 *
 * Collection接口继承了java.lang.Iterable接口，该接口有 个iterator()方法，
 * 那么所有实现了Collection接口的集合类都有一个iterator()方法，用以返回一个实现了Iterator接口的对象。
 *
 * Iterator仅用于遍历集合，Iterator木身并不提供承装对象的能力。如果需要创建Iterator对象，则必须有一个被迭代的集合。
 *
 * 集合对象每次调用iterator()方法都得到一个全新的迭代器对象，默认游标都在集合的第一个元素之前
 */
public class c_使用Iterator接口遍历集合 {

    /*  Iterator接口中的方法

        1、next() : 返回迭代中的下一个元素。
            返回值: 迭代中的下一个元素
            异常抛出: java.util.NoSuchElementException —— 如果迭代没有更多的元素

            刚开始指针是没有指向任何元素的
            在第一次调用next()时，指针指向第一个元素了，而如果再调用一次next()则指针就会指向下一个元素
            不管在哪里调用next()，就算是在判断语句里调用，它都算进行一次迭代，慎用。

        2、hasNext() : 如果迭代有更多的元素，返回true。(换句话说，如果next返回一个元素而不是抛出异常，则返回true。)
            返回值: 如果迭代有更多元素，则为True

        3、remove() : 如果指定元素的单个实例存在，则从该集合中移除该实例(可选操作)。
     */
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new PersonTest("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);

        //方式一   不推荐
//        Iterator iterator = coll.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

        //方式二    不推荐
//        Iterator iterator = coll.iterator();
//        for (int i=0;i<coll.size();i++){
//            System.out.println(iterator.next());
//        }

        // 方式三  hasNext():如果迭代有更多的元素，返回true。(换句话说，如果next返回一个元素而不是抛出异常，则返回true。)
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new PersonTest("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);

        // 加载一次集合的迭代器，然后遍历查询是否有"Tom"这个元素，如果有就移除这个元素
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if ("Tom".equals(obj)){
                coll.remove("Tom");
            }
        }

        // 重新加载一次集合的迭代器，因为上次遍历迭代器指针已经指向最后了
        // 然后遍历集合迭代器里的所有元素
        Iterator iterator1 = coll.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
            // 123
            // 456
            // PersonTest@2de8284b
            // false
        }

    }

}

