import java.util.ArrayList;
import java.util.List;

/*
1、什么叫泛型方法？
    泛型方法：在方法中出现了泛型的结构，泛型参数与类的泛型参数没有任何关系。
            泛型方法所属的类是不是泛型类都没有关系。

2、泛型方法可以什么为静态的，原因：泛型参数是在调用方法时确定的，并非在实例化类时确定的。
 */
public class c_泛型方法<T> {
    public static void main(String[] args) {
        c_泛型方法<String> test = new c_泛型方法();
        Integer[] i = {1,2,3};

        List<Integer> list = test.toValue(i);
        System.out.println(list);
    }
    public <E> List<E> toValue(E[] array){
        ArrayList<E> list = new ArrayList<>();

        for (E e:array){
            list.add(e);
        }
        return list;
    }
}
