import org.testng.annotations.Test;

import java.util.ArrayList;

/*
1. 泛型类可能有多个参数，此时应将多个参数一起放在尖括号内。比如：
<E1,E2,E3>

2.泛型类的构造器如下：public GenericClass()。
而下面是错误的：public GenericClass<E＞()

3.实例化后，操作原来泛型位置的结构必须与指定的泛型类型一致。

4.泛型不同的引用不能相互赋值。
> 尽管在编译时ArrayList<String>和ArrayList<Integer>是两种类型，但是，在运行时只有一个ArrayList被加载到JVM中。

5.泛型如果不指定，将被擦除，泛型对应的类型均按照Object处理，但不等价于Object。经验：泛型要使用 就一路都用。要不用，一路都不要用。

6.如果泛型结构是一个接口或抽象类，则不可创建泛型类的对象。

7.jdk1.7，泛型的简化操作：ArrayList<Fruit> list =new ArrayList<>();

8.泛型的指定中不能使用基本数据类型，可以使用包装类替换。

9.静态方法不能使用泛型对象参数，因为Java静态资源（静态代码块，静态方法，静态属性）在类加载的时候进行加载，是早于对象加载的。而泛型的指定是
在创建对象时创建的，如：test<String,Integer,Double> t = new test<>("啊啊啊",120,1.001); ---- 而静态资源是在class test<T1,T2,T3>时加载的。
所以静态方法无法调用比自己还晚加载出来的泛型

10.异常不能使用泛型
 */
public class b_注意点 {
    @Test
    public void test1(){
        // 1. 泛型类可能有多个参数，此时应将多个参数一起放在尖括号内。比如：<E1,E2,E3>
        class test<T1,T2,T3>{
            T1 t1;
            T2 t2;
            T3 t3;

            // 2. 泛型的构造器不需要加 "<...>"
            public test(T1 t1,T2 t2,T3 t3){
                this.t1=t1;
                this.t2=t2;
                this.t3=t3;
            }

            public void getT(){
                System.out.println(t1.toString()+t2.toString()+t3.toString());
            }
        }
        // 3. 实例化后，操作原来泛型位置的结构必须与指定的泛型类型一致。
        test<String,Integer,Double> t = new test<>("啊啊啊",120,1.001);
        t.getT();   //输出：啊啊啊1201.001
    }

    @Test
    public void test2(){
        // 4.泛型不同的引用不能相互赋值。
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1 = null;
        list2 = null;

        // list1 = list2;   报错！
    }
}
