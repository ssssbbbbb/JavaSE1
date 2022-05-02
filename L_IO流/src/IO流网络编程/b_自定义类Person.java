package IO流网络编程;

import java.io.Serializable;

/**
 *  Person需要满足如下的需求，方可序列化
 *  1、需要实现接口：Serializable
 *  2、当前类提供一个全局常量：serialVersionUID，值随便
 *  3、除了当前Person需要实现Serializable接口之外，还必须保证其内部所有属性也必须是可序列化的。（默认情况下，基本数据类型可序列化）
 *
 *  补充：ObjectOutputStream和ObjectInputStream不能序列化static和transient修饰的成员结构。
 */
public class b_自定义类Person implements Serializable {
    public static final long serialVersionUID = 21183137189189L;

    private String name;
    private int age;

    public b_自定义类Person(){

    }

    public b_自定义类Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return this.name+"  "+this.age;
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
}
