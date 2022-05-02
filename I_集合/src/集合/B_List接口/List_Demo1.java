package 集合.B_List接口;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *  List子接口的使用：
 *      特点：① 有序 ② 有下表 ③ 可以重复
 *
 *      1、创建集合对象
 *
 *      2、添加元素
 *
 *      3、
 */
public class List_Demo1 {
    public static void main(String[] args) {
//      1、创建集合对象
        List list = new ArrayList();

//      2、添加元素
        list.add("苹果");
        list.add("小米");
        list.add("vivo");
        // 在指定位置添加元素
        list.add(0,"华为");
        System.out.println(list+"\n元素添加完成："+list.size());


//      3、删除元素
        // list.remove("苹果");   指定元素删除或者指定位置删除都可以
        list.remove(1);
        System.out.println(list+"\n元素删除完成："+list.size());

//      4.1、遍历元素  （这里使用迭代器，for循环或者增强for循环都可以）
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//      4.2、遍历元素    （使用列表迭代器：ListIterator可以向前或向后遍历，可以添加、删除、修改元素）
        ListIterator li = list.listIterator();
        System.out.println("----------使用列表迭代器从前往后----------");
        while (li.hasNext()){
            System.out.println(li.nextIndex()+" : "+li.next());
        }
        // 如果想要让遍历方向从后往前，则就需要让指针指向最后一个元素才行
        // 而上方遍历过一次元素，指针已经指向最后一个元素了，因此，这里可以直接开始反向遍历
        System.out.println("----------使用列表迭代器从后往前----------");
        while (li.hasPrevious()){
            System.out.println(li.previousIndex()+" : "+li.previous());
        }

//      5、判断
        // 如果此列表包含指定元素，则返回 true
        System.out.println(list.contains("华为"));
        // 如果此列表不包含任何元素，则返回 true
        System.out.println(list.isEmpty());

//      6、获取位置
        System.out.println(list.indexOf("vivo"));
    }
}
