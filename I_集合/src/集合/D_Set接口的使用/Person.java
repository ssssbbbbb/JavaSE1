package 集合.D_Set接口的使用;

/**
 *  用来测试的类：人类
 */
public class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃东西");
    }

    @Override
    public String toString(){
        return "name: "+this.name+"  age:"+this.age;
    }

    @Override
    public int compareTo(Person p) {
        // 先比较 name ，如果name为0， 就比较 age
        int i1 = this.name.compareTo(p.name);
        int i2 = this.age - p.age;

        return i1==0 ? i2:i1;
    }
}
