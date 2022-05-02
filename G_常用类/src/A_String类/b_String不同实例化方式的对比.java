package A_String类;

/**
 *  <h2>String对象的创建</h2>
 *  <p>String str = "hello";</p>
 *  <p>String s1 = new String();</p>
 *  <p>String s2 = new String(String original);</p>
 *  <p>String s3 = new String(char[] a);</p>
 *  <p>String s4 = new  String(char[] a,int starIndex,int count);</p>
 *  <p><a href="https://www.apiref.com/java11-zh/java.base/java/lang/String.html">java.lang.String</a></p>
 */
public class b_String不同实例化方式的对比 {
    public static void main(String[] args) {
        System.out.println("----------- 测试一 ------------"); //测试一主要代码在class b_Test 的代码块中
        b_Test bt = new b_Test();

        System.out.println("----------- 测试二 ------------");
        b_Test_2 test1 = new b_Test_2("tom", 19);
        b_Test_2 test2 = new b_Test_2("tom", 19);
        System.out.println(test1.name == test2.name);   //true  因为在对象中显式的赋值，值都是储存在常量池中的

        //在构造器中赋值，相当于：test.name = "black";     而不是 test name = new String("black");
        test1.name = "black";
        test2.name = "black";
        System.out.println(test1.name == test2.name);   //true

        test1.name = new String("lol");
        test2.name = new String("lol");
        System.out.println(test1.name == test2.name);   //false
    }

}
/*
    String的实例化方式
        方式一：通过字面量定义的方式
        方式二：通过new + 构造器的方式

    提问：String s = new String("abc"); 方式创建对象，在内存中创建了几个对象？
    答：两个！   一个是堆空间中的new结构，另一个是char[]队医的常量池中的数据”abc“
 */
class b_Test {

    //使用代码块，在创建对象时做测试用
    {
        // 通过字面量的方式定义：此时的s1hes2的数据 "javaEE" 声明在方法区中的字符串常量池中
        String s1 = "javaEE";
        String s2 = "javaEE";

        // 通过new + 构造器的方式：此时的s3和s4的地址值，是指向数据在堆空间中开辟空间以后对应的地址值
        String s3 = new String("javaEE");
        String s4 = new String("javaEE");

        System.out.println(s1 == s2);   //true      存在常量池中，不能有两个相同的值，共享数值
        System.out.println(s3 == s4);   //false     存在堆中，每个初始化的对象地址都不同
        System.out.println(s1 == s3);   //false     堆中的 不会等于 方法区的常量池中的
        System.out.println(s1.equals(s3));  //true  equals()方法比较的是对象，因为这里的都是String类的对象，因此为true
    }
}

class b_Test_2 {
    String name;
    int age;

    public b_Test_2(String name, int age){
        this.name=name;
        this.age=age;
    }

}