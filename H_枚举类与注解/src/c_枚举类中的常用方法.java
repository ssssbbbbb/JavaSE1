/**
 *  1、values():返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值。
 *  2、valueOf(String name):返回枚举类中对象名是name的枚举对象。要求字符串必须是枚举对象的“名字”。如果不是，则运行时异常：IllegalArgumentException
 *  3、toString:返回当前枚举类对象常量的名称
 */
public class c_枚举类中的常用方法 {
    public static void main(String[] args) {

        // 1、values():返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值。
        for (Season3 s : Season3.values()){
            System.out.println(s);
            //SPRING
            //SUMMER
            //AUTUMN
            //WINTER
        }

        // 2、valueOf(String name):返回枚举类中对象名是name的枚举对象
        Season3 s = Season3.valueOf("WINTER");
        System.out.println(s);  // WINTER
    }
}

enum Season2 {
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
    private Season2(String seasonName, String seasonDesc) {
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