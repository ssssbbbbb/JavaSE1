# 泛型与File
<br/>

## 1.1 为什么要有泛型
泛型就是标签。  
犹如垃圾分类，把垃圾分为：可回收垃圾、不可回收垃圾、其它垃圾，这三类。  
当人们去丢垃圾的时候就 <u>**必须**</u> 根据垃圾桶上的分类标签，把相同类型的垃圾扔进相同类型标签的垃圾桶内。
---
<h3>泛型的设计背景</h3>
<p>集合容器类在设计阶段/声明阶段不能确定这个容器到底实际储存的是什么类型的对象，所以在JDK1.5之前只能把元素类型
设计为Object,而JDK1.5之后使用泛型来解决这个问题。</p>
因此泛型是用来限制集合储存对象类型的

---
### 例子
在下面这个例子可以看出，没有设置泛型的集合是可以储存任何对象的，如果这个集合是想储存班级名字的，但却失误存入了整型
的包装类对象，这样势必会对后面的程序产生影响，因此泛型的作用就尤为重要。
```java
public class test1 {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("漩涡鸣人");
        arrayList1.add("木大木大木大");
        arrayList1.add(250);

        for (Object o : arrayList1){
            System.out.println(o);
        }
    }
}
```
<br/>
<br/>

当给集合设置了泛型为String，这就指定了次集合只能储存String类型的对象，如果储存其它类型的对象就会报错；  
并且，设置了泛型的集合可以储存 继承了泛型类型的 对象。（也就是集合的泛型类型是AAA，但是BBB继承了AAA，那么集合也就可以储存BBB的对象）
```java
public class test1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("小明");
        arrayList2.add("小红");
        arrayList2.add(380);

        // 集合可以储存 继承了泛型类型的 对象 
        ArrayList<AAA> arrayList3 = new ArrayList<>();
        BBB bbb = new BBB();
        arrayList3.add(bbb);
        arrayList3.add(new BBB());
    }
}
```

## 泛型型的概念
所谓泛型，就是允许在定义**类**跟**接口**时，通过一个标识表示类中某个属性的类型或是某个方法的返回值及参数类型。这个类型参数在使用时（例如，
继承或实现这个接口，用这个类型什么变量、创建对象时）确定（即传入实际的类型参数，也称为类型实参）。