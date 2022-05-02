package 集合.C_List接口的实现类;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


/**
 *  LinkedList类的使用
 *  存储结构：双向链表
 */
public class LinkedList类使用 {
    public static void main(String[] args) {
        //创建集合
        LinkedList list = new LinkedList();
        Student s1 = new Student("AAA", 11);
        Student s2 = new Student("BBB", 22);
        Student s3 = new Student("CCC", 33);
        //添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list+"\n元素个数："+list.size());
        //删除元素
        list.remove(1);
        System.out.println(list);
        //遍历
        System.out.println("-----for-----");
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("-----增强for-----");
        for (Object o: list){
            Student s = (Student) o;
            System.out.println(s);
        }

        System.out.println("-----迭代器-----");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Student student = (Student) iterator.next();
            System.out.println(student);
        }

        System.out.println("----列表迭代器----");
        ListIterator lit = list.listIterator();
        while (lit.hasNext()){
            Student student = (Student) lit.next();
            System.out.println(student);
        }

        //判断，跟前面的一样

        //获取一样
        System.out.println(list.indexOf(s1));   // 返回此列表中指定元素第一次出现的索引
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age){
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
            if (this.name.equals(s.getName()) && this.age==s.getAge()){
                return true;
            }
        }
        //以上都不满足就返回false
        return false;
    }
}