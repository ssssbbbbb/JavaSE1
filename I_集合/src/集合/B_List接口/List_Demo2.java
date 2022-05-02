package 集合.B_List接口;

import java.util.ArrayList;
import java.util.List;

public class List_Demo2 {
    public static void main(String[] args) {
//      1、创建集合
        List list = new ArrayList();

//      2、添加元素，0~50 （集合是不能储存基本数据类型的，因此这里是进行了自动装箱，把int变为了integer包装类）
        for (int i=0; i<=50; i+=10){
            list.add(i);
        }
        System.out.println(list+"\n元素个数："+list.size());

//      3、删除操作  List集合删除元素的方法有两个
        // Object remove(int index) --- 删除指定下标位置的元素
        // boolean remove(Object o) --- 删除指定对象的元素
        // 如果想要使用第二个方法删除，则就不能直接填写int元素，因为那样Java会以为你是要使用下表删除，所以需要的参数是一个对象
        list.remove(new Integer(0));
        System.out.println(list+"\n操作后元素数量："+list.size());

//      4、subList(int fromIndex, int toIndex) --- 返回fromIndex和toIndex下标量之间的集合元素
        System.out.println("\n返回fromIndex和toIndex下标量之间的集合元素"+list.subList(0,4));


    }
}
