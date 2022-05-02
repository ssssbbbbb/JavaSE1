package 注解;

/**
 *  JDK的元注解用于修饰其它注解定义
 *      元注解：对现有的注解进行解释说明的注解
 *
 *  JDK5.0提供了4个标准的meta-annotation类型，分别是：
 *      1、Retention
 *          指定所修饰的Annotation的生命周期：SOURCE（源）    CLASS（类。默认行为）   RUNTIME（运行时）
 *          只有声明为RUNTIME生命周期的注解，才能通过反射获取
 *      2、Target
 *          用于指定被修饰的Annotation能用于修饰哪些程序元素
 *      3、Documented
 *      4、Inherited
 *
 *  元数据的理解：
 *  String name = "atguigu";
 */
public class c_JDK中的元注解的使用 {
}
