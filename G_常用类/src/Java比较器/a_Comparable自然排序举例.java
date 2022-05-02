package Java比较器;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *  Comparable接口的使用
 *      1、像String、包装类等实现了Comparable接口，重写了compareTo()方法，给出了比较两个对象大小的方式
 *      2、重写compareTo()的规则：
 *          如果当前对象this大于形参对象obj，则返回正整数；
 *          如果当前对象this小于形参对象obj，则返回负整数；
 *          如果当前对象this等于形参对象obj，则返回零。
 *      3、对于自定义类来说，如果需要排序，我们可以让自定义类实现Comparable接口，重写compareTo()方法，在方法中指明如何排序。
 */
public class a_Comparable自然排序举例 {
    @Test
    public void test1(){
        String[] arr = new String[]{"aa","bb","mm","gg","zz","kk"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));   // [aa, bb, gg, kk, mm, zz] 为什么sort()方法就能给无序的字符串排序呢？
        // 因为：根据其元素的自然顺序，将指定的对象数组按升序排序。 数组中的所有元素都必须实现Comparable接口。

    }
}
