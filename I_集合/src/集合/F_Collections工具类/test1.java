package 集合.F_Collections工具类;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *  public static <T extends Comparable<? super T>> void sort(List<T> list)
 *  将指定的列表按照其元素的自然顺序进行升序排序。列表中的所有元素都必须实现Comparable接口。此外，列表中的所有元素必须是可以相互比较的
 *  (也就是说，e1.compareTo(e2)不能为列表中的任何元素e1和e2抛出ClassCastException:类型转换异常)。
 *  这个排序保证是稳定的:相等的元素不会作为排序的结果被重新排序。
 *  指定的列表必须是可修改的，但不需要调整大小。
 *
 *
 *  public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key)
 *  使用二分搜索算法在指定列表中搜索指定对象。 在进行此调用之前，列表必须根据其元素的自然顺序（如 sort(List) 方法）按升序排序。 如果未
 *  排序，则结果未定义。 如果列表包含多个等于指定对象的元素，则无法保证会找到哪一个。
 *
 *
 *  public static <T> void copy(List<? super T> dest, List<? extends T> src)
 *  将一个列表中的所有元素复制到另一个列表中。 操作后，目标列表中每个复制元素的索引将与其在源列表中的索引相同。 目标列表的大小必须大于或
 *  等于源列表的大小。 如果它更大，则目标列表中的其余元素不受影响。
 *
 *
 *  public static void reverse(List<?> list)  : 反转指定列表中元素的顺序
 *
 *
 *  public static void shuffle() : 使用默认随机源随机排列指定列表。所有排列都以大致相等的可能性发生。
 */
public class test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(15);
        list.add(50);
        list.add(32);
        list.add(12);

        //1、public static void sort() :   将指定的列表按照其元素的自然顺序进行升序排序
        System.out.println("比较排序前："+list);
        Collections.sort(list);
        System.out.println("比较排序后："+list);
        /*
        比较排序前：[20, 15, 50, 32, 12]
        比较排序后：[12, 15, 20, 32, 50]
         */

        //2、public static int binarySearch()  :   查找指定列表内指定的元素的位置（下标量）
        System.out.println("在集合list中，元素20的下标量为:"+Collections.binarySearch(list,20));

        //3、public static void copy() :   将一个列表中的所有元素复制到另一个列表中
        List<Integer> list2 = new ArrayList<>();
        // 在使用这个方法时，必须保证两个列表的大小一致，因此需要先在复制前给list2里添加与list一样多的元素
        for (int i = 0; i < list.size(); i++){
            list2.add(0);
        }
        Collections.copy(list2, list);
        System.out.println("复制后的list2："+list2);

        //4、public static void reverse() : 反转指定列表中元素的顺序
        Collections.reverse(list2);
        System.out.println("反转之后的list2："+list2);

        //5、public static void shuffle() : 使用默认随机源随机排列指定列表。所有排列都以大致相等的可能性发生
        Collections.shuffle(list);
        System.out.println("随机之后的list："+list);

        //补充（不属于工具类）：list转为数组
        Integer[] integer = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integer));
        //数组转为集合
        String[] strings = {"aaa","bbb","ccc"};
        List<String> list3 = Arrays.asList(strings);
        //list3.add("ddd"); 异常！因为将数组转换为的集合是一个受限集合，不能添加和删除
        System.out.println(list3);

    }
}










