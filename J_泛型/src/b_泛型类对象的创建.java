/**
 *  泛型类创建对象
 *  1、泛型只能使用引用类型
 *  2、不同泛型对象之间不能相互赋值
 */
public class b_泛型类对象的创建 {
    public static void main(String[] args) {
        //使用泛型类创建对象
        a_泛型类的创建<String> generics = new a_泛型类的创建<>();

        System.out.println(generics.t);     // null
        generics.t = "你好！";
        System.out.println(generics.getT());    // 你好！
        //  因为这里的参数是 泛型的占位符T，而T的类型是String类，因此这里的参数只能填入String的对象，其它类都不行。
        generics.show("aaaaa");     // aaaaa

        System.out.println("--------------------------------------------------------------------------------------");

        a_泛型类的创建<Integer> generics2 = new a_泛型类的创建<>();
        generics2.t = 100;
        generics2.show(200);
        Integer integer = generics2.getT();
        System.out.println(integer);

        // 不同泛型对象之间不能相互赋值
//      泛型类的创建<Double> d = generics2;   错误！
    }
}
