import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

/*
通配符：就是 “ ? ”

类A是类B的父类，但G<A>和G<B>是没有任何关系的，但G<?>是它们两个的父类。（? 相当于数据库中的 *）

<? extends class>  可以理解为小于等于的
<? super class> 可以理解为大于等于class的
 */
public class d_通配符的使用 {
    public static void main(String[] args) {

    }
    @Test
    public void Test1(){
        List<Object> list1 = null;
        List<String> list2 = null;

        List<?> list = null;

        //list1=list2; 报错！
        list = list1;
        list = list2;

    }
    public void printt(List<?> list){
        Iterator<?> iterator= list.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }

}
