package 集合.A_Collection接口的使用;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *  Collection接口的使用
 *  1、添加元素
 *
 *  2、删除元素
 *
 *  3、遍历元素
 *      Iterator迭代器的方法
 *          ① hasNext()：如果仍有元素可以迭代，则返回true
 *          ② next()：返回迭代的下一个元素
 *          ③ remove()：删除当前元素
 *          迭代器刚开始指针会指向第一个元素
 *
 *      当前例子遍历集合元素的方法步骤是：
 *          先创建Iterator 对象 iterator，再把集合的元素传递给它；
 *          再利用while循环遍历，循环的条件是（用hasNext()方法判断有没有下一个元素，如果没有就不再循环）；
 *          然后获取当前指针指向的元素，最后输出该元素。
 *
 *      从以下例子中的遍历删除中可以看出，迭代器可以控制集合最底层的元素，当迭代器对象执行删除方法时，collection对象的元素个数便少了一个
 *
 *  4、判断元素是否为空
 */
public class Demo1 {
    public static void main(String[] args) {
//      创建接口
        Collection collection = new ArrayList();

//      1、添加元素
        collection.add("苹果");
        collection.add("西瓜");
        collection.add("草莓");
        collection.add("西红柿");
        System.out.println("元素个数："+collection.size());
//      打印集合里的元素
        System.out.println(collection);

//      2、删除元素
        collection.remove("西红柿");
        System.out.println(collection);

//      3、遍历元素  (可以使用增强for循环用来遍历；也可以使用迭代器Iterator，迭代器是一种专门用来遍历结合的方式)
        Iterator iterator = collection.iterator();
        // 如果直接输出iterator对象的话，则只有地址 java.util.ArrayList$Itr@21bcffb5
        System.out.println(iterator);

        while (iterator.hasNext()){
            String s = (String) iterator.next();
            // collection.remove("西瓜");  错误！迭代的过程中不能删除
            // 删除西瓜
            if (s.equals("西瓜")){
                iterator.remove();
                continue;
            }
            System.out.println(s);
        }
        System.out.println("元素个数"+collection.size());  // 2
    }
}
