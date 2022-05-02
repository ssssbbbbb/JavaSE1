/**
 *  泛型类
 *  语法：类名<T,...>    ;T是类型占位符，表示一种引用类型，如果编写多个使用逗号隔开
 */
public class a_泛型类的创建<T> {
    //使用泛型T
//  1、创建变量
    T t;

//  2、作为方法的参数
    public void show(T t){
        //T作为参数时不能new，因为无法保证传递过来的类的构造方法一定能用等等问题
        System.out.println(t);
    }

//  3、泛型作为方法的返回值
    public T getT() {
        return t;
    }
}
