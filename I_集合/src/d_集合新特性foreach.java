import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 *  使用 foreach 循环遍历集合元素
 *  foreach增强for循环
 *  
 *  1、Java 5.0 提供了 foreach 循环迭代访问 Collection 和数组。
 *  2、遍历操作不需获取Collection或数组的长度，无需使用索引访问元素。
 *  3、遍历集合的底层调用Iterator完成操作。
 *  4、foreach 还可以用来遍历数组。
 */
public class d_集合新特性foreach {
    @Test
    public void test(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new PersonTest("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);

        for(Object obj : coll){
            System.out.println(obj);
            // 123
            // 456
            // PersonTest@51c8530f
            // Tom
            // false
        }

    }
}
