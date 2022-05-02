package 注解;

/**
 *  1、定义新的Annotation类型使用@interface关键字
 *  2、自定义注解自动继承了java.lang.annotation.Annotation接口
 *  3、Annotation 的成员变量在Annotation 定义中以无参数方法的形式来声明。其方法名和返回值定义了该成员的名字和类型。我们称为配置参数。
 *      类型只能是八种基本数据类型、String类型、Class类型、enum类型、Annotation类型、以上所有类型的数组。
 *  4、可以在定义Annotation 的成员变量时为其指定初始值，指定成员变量的初始值可使用 default 关键字
 *  5、如果只有一个参数成员，建议使用参数名为value
 *  6、如果定义的注解含有配置参数，那么使用时必须指定参数值，除非它有默认值。格式是“参数名=参数值”，如果只有一个参数成员，
 *      且名称为value，可以省略“value=”
 *  7、没有成员定义的Annotation称为标记；包含成员变量的Annotation称为元数据 Annotation
 *  8、注意：自定义注解必须配上注解的信息处理流程才有意义。
 *
 *      自定义注解步骤：
 *          ① 注解声明为：@interface
 *          ② 内部定义成员，通常使用value表示
 *          ③ 可以指定成员的默认值，使用default关键字定义
 *          ④ 如果自定义注解没有成员，表面是应该标识作用
 *      自定义注解必须配上注解的信息处理流程（使用反射）才有意义
 */
public @interface b_自定义注解 {
    // 非默认的参数成员就必须要在使用时赋值
    String value1();

    // 默认的参数成员不必须在使用时赋值，如果不赋值则会以默认值 200 为参数
    int value2() default 200;
}

@b_自定义注解(value1 = "hello")
class Dog {
    String name;
    int age;

    public void show(){
        System.out.println("此狗名为"+name);
    }
}