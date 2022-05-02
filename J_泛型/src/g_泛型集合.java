import java.util.ArrayList;

/**
 *  泛型集合
 *  1、概念：参数化类型、类型安全的集合，强制集合元素的类型必须一致
 *                  例如:
 *                  ArrayList<String> arrayList = new ArrayList();  //创建List接口的实现类ArrayList，限制该集合只能储存String对象
 *                  arrayList.add("value");     //此集合里就只能添加String对象了
 *  2、特点： ① 编译时即可检查，而非运行时抛出异常。
 *           ② 访问时，不必类型转换（拆箱）
 *           ③ 不同泛型之间引用不能相互赋值，泛型不存在多态。
 *
 *
 *
 */
public class g_泛型集合 {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList<>();

        arrayList1.add(100);
        arrayList1.add(1000);
        arrayList1.add(10000);
        // arrayList1.add("啊啊啊啊");  运行时报错！String无法转换为int,不运行编译器也不会提示这个异常！
        // 因此，在一个集合中，有不同类的对象，有可能出现以上异常，而这种异常只是千万中的一个.

        for (Object o : arrayList1) {
            int i = (int)o;
            System.out.println(i);
        }

        System.out.println("------------------------------------------------------------------");
//      解决方法：设置泛型类 ----------------------------------------------------------------------

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(10);
        arrayList2.add(100);
        // arrayList2.add("aaaaa");     编辑时报错！对集合设置集合后，就只能添加该泛型类的元素，否则在编辑时就会报错了。

        for (Object o: arrayList2){
            int i = (int)o;
            System.out.println(i);
        }


    }
}
