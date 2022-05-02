/**
 *  使用enum关键字定义枚举类
 */
public class b_枚举类入门enum关键字定义枚举类 {
    public static void main(String[] args) {
        Season3 夏天 = Season3.SUMMER;
        System.out.println(夏天.toString()); // SUMMER        打印当前对象的名字

        // 问题：这里没有重写toString，而枚举类也没有显示的继承其它类，那么这里的 夏天 就应该是继承Object，夏天.toString就应该是调用Object.toString()方法，输出地址才对？
        // 解：    打印Season1类的父类，发现枚举类是默认继承于Enum类的，因此这里的toString()方法使用的是Enum.toString()
        System.out.println(Season3.class.getSuperclass());  // class java.lang.Enum

    }
}

enum Season1 {
    //1、提供当前枚举类的多个对象：不 ！要！ 用！ public static final关键字修饰
     SPRING ("春天", "春暖"),
     SUMMER ("夏天", "夏炎"),
     AUTUMN ("秋天", "秋凉"),
     WINTER ("冬天", "冬寒");

    //2、声明Season对象的属性:使用private final 关键字修饰
    private final String seasonName;    //季节名字
    private final String seasonDesc;    //季节描述

    //3、私有化类的构造器,并给对象属性初始化赋值
    // （在构造器里初始化，可以比在声明属性处直接字面量初始化灵活，因为一旦字面量赋值后属性值就不能更改了，而构造器能够在你想要使用时再赋你需要的值）
    private Season1(String seasonName, String seasonDesc) {
        this.seasonDesc=seasonDesc;
        this.seasonName=seasonName;
    }

    //4、其它述求1：获取枚举类对象的属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

}
