package 集合.A_Collection接口的使用;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/**
 *  Collection的使用：保存学生信息
 *
 */
public class Demo2 {
    public static void main(String[] args) {
//      1、创建Collection对象
        Collection collection = new ArrayList();
        Scanner scanner = new Scanner(System.in);

//      2、传入元素
        for (int i = 0; i<5 ;i++){
            System.out.println("输入参数name和age");
            String name = scanner.next();
            int age = scanner.nextInt();
            collection.add(new Students(name, age));
        }
        System.out.println(collection);

//      3、遍历集合
        Iterator iterator = collection.iterator();
        System.out.println("输入需要删除的对象的参数name和age");
        String name = scanner.next();
        int age = scanner.nextInt();

        while (iterator.hasNext()){
            Students s = (Students)iterator.next();
            // e()方法，在Students中重写的方法，用以比较两个类的toString()是否相等，这里用以判断，集合元素里的属性是否相等。
            if (s.e(new Students(name, age))){
                iterator.remove();
                continue;
            }
            System.out.println(s);
        }

        System.out.println(collection.size());

    }
}

// 创建学生类
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

    public boolean e(Object o){
        return this.toString().equals(o.toString());
    }
}