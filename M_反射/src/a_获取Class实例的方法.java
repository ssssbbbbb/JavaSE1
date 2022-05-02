import org.testng.annotations.Test;

public class a_获取Class实例的方法 {
    @Test
    public void test1() throws ClassNotFoundException {
        // 方法一：调用运行时类的属性 .class
        Class class1 = Person.class;
        System.out.println(class1);

        // 方法二：通过运行时类的对象，调用 getClass()
        Person person1 = new Person("tom", 11);
        Class class2= person1.getClass();
        System.out.println(class2);

        // 方法三：调用Class的静态方法 forName()
        Class class3 = Class.forName("Person"); // 得要写全是哪个Java包下的Person，因为本程序的相对路径是src下，所以直接填Person即可，
                                                // 如果是在一个名为JavaClass的包下，则这里就得填 "JavaClass.Person"
        System.out.println(class3);

        // 方法四：使用类的加载器：ClassLoader  (了解)
        ClassLoader classLoader = a_获取Class实例的方法.class.getClassLoader();
        Class class4 = classLoader.loadClass("Person");
        System.out.println(class4);

        System.out.println(class1 == class2);   //true
        System.out.println(class1 == class3);   //true
        System.out.println(class1 == class4);   //true
    }
}
