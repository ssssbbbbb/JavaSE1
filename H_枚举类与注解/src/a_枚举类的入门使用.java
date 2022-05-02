/**
 *  一、枚举类的理解
 *      1、类的对象是有限的，确定的。我们称此类为枚举类。
 *          例如： 星期类：只有星期一到星期日，七个对象
 *              性别类：只有男和女，两个对象
 *              季节类：只有春、夏、秋、冬，四个对象
 *              。。。。。。
 *
 *      2、当需要定义一组常量时，强烈建议使用枚举类
 *      3、若枚举类只有应该对象，则可以作为一种单例模式的实现方式
 *
 *  二、如何定义枚举类
 *
 *      方式一：jdk5.0之前，自定义枚举类
 *          自定义枚举类继承的是 Object
 *      方式二：jdk5.0时，可以使用enum关键字定义枚举类
 *          enum关键字创建的枚举类继承的是 class java.lang.Enum
 */
public class a_枚举类的入门使用 {
    public static void main(String[] args) {
        Season 春天 = Season.SPRING;
        System.out.println(春天); // Season{seasonName='春天', seasonDesc='春暖'}
    }
}

// 方式一：jdk5.0之前，自定义枚举类      季节类
class Season {
    //1、声明Season对象的属性:使用private final 关键字修饰
    private final String seasonName;    //季节名字
    private final String seasonDesc;    //季节描述

    //2、私有化类的构造器,并给对象属性初始化赋值
    // （在构造器里初始化，可以比在声明属性处直接字面量初始化灵活，因为一旦字面量赋值后属性值就不能更改了，而构造器能够在你想要使用时再赋你需要的值）
    private Season(String seasonName, String seasonDesc) {
        this.seasonDesc=seasonDesc;
        this.seasonName=seasonName;
    }

    //3、提供当前枚举类的多个对象：public static final关键字修饰
    public static final Season SPRING = new Season("春天", "春暖");
    public static final Season SUMMER = new Season("夏天", "夏炎");
    public static final Season AUTUMN = new Season("秋天", "秋凉");
    public static final Season WINTER = new Season("冬天", "冬寒");

    //4、其它述求1：获取枚举类对象的属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //4、其它述求2：提供toString()

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}