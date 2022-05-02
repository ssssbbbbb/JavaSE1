package A_String类;

/**
 *    1、String声明为final的，不可被继承
 *
 *    2、String  实现了Serializable接口：表示字符串是支持序列化的
 *               实现了Comparable接口：表示String可以比较大小
 *
 *    3、String内部定义了final char[] value 用于存储字符串数据
 *
 *    4、String：代表不可变的字符序列，简称不可变性
 *            体现： ① 当对字符串重新赋值时，需要重写指定内存区域赋值，不能使用原有的value进行赋值。
 *                  ② 当于现有的字符串进行连接操作时，也需要重新指定内存区域赋值，不能使用原有的value进行赋值。
 *                  ③ 当调用String的replace()方法修改指定的字符或字符串时，也需要重写指定内存区赋值，不能使用原有的value进行赋值。
 *
 *    5、通过字面量的方式（区别于new）给一个字符串赋值，此时的字符串值声明在字符串常量池中。
 *
 *    6、字符串常量池中是不会储存相同内容的字符串的
 *
 */
public class a_理解String的不可变性 {
    public static void main(String[] args) {
        a_Test at = new a_Test();

    }
}

class a_Test {
    //用代码块的方式，在创建对象时进行程序测试
    {
// --------------- 字面量的定义方式
        String s1 = "abc";
        String s2 = "abc";
        //在栈中声明了s1和s2，但它们指向的都是方法区的常量池里的字面量 -- "abc"
        System.out.println("比较 "+s1+" 和 "+s2+" 的地址值:" + (s1 == s2));    //true

// --------------- 当s1更改值后，地址值就指向了新的地方
        s1 = "hello";
        System.out.println(s1); //hello
        System.out.println(s2); //abc
        System.out.println("比较 "+s1+" 和 "+s2+" 的地址值:" + (s1 == s2));    //false

// --------------- 在现有的字符串上拼接一个新的内容出来，其地址值也是会被改变的
        String s3 = s2 + "ZXC";
        System.out.println(s3 == s2);   // false
    }
}