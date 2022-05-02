package 集合.C_List接口的实现类;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *  ArrayList的使用
 *  储存结构：数组 --- 查找遍历速度快，增删慢
 */
public class ArrayList的使用 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
//      1、添加元素
        Students s1 = new Students("aaa", 123);
        Students s2 = new Students("bbb", 222);
        Students s3 = new Students("ccc", 321);
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s3);  // List接口是可重复的，因此它的实现类也是可重复的
        System.out.println(arrayList);
//      2、删除元素
        arrayList.remove(new Students("ccc", 321));
        System.out.println(arrayList);
//      3、遍历元素  （List接口可以使用的，此实现类都可以使用）
        // 使用迭代器
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Students s = (Students) iterator.next();
            System.out.println(s);
        }
//      4、判断
        System.out.println(arrayList.contains(new Students("aaa", 123)));   //判断是否存在
        System.out.println(arrayList.isEmpty());    //判断是否为空

//      5、查找
        System.out.println(arrayList.indexOf(new Students("ccc", 321)));


    }
}

class Students {
    private String name;
    private int age;

    public Students(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 直接打印此对象时，会返回以下格式的数据
    @Override
    public String toString(){
        return "Student [name= "+name+", age="+age+"]" ;
    }


    @Override
    public boolean equals(Object obj){
        //判断是不是同一个对象
        if (this==obj){
            return true;
        }
        //判断是否为空
        if (obj==null){
            return false;
        }
        //判断是否是Students类型
        if (obj instanceof Students){
            Students s = (Students) obj;
            if (this.name.equals(s.getName()) && this.age==s.age){
                return true;
            }
        }
        //以上都不满足就返回false
        return false;
    }
}
