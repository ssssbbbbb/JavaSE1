/**
 *  使用enum创建的枚举类实现接口抽象方法
 *      场景一：直接在类中找块位置实现方法。（局限性：每个枚举对象的实现方法都只能用同一个）
 *      场景二：在每个枚举对象初始化处，实现抽象方法。（好处是，调用不同的枚举对象，得到的枚举方法也不同）
 */
public class d_在枚举类中实现接口 {
    public static void main(String[] args) {

    }
}
interface Season3Test {
    // 接口中的方法默认为 public abstract
    void show();
}

enum Season3 implements Season3Test{

    SPRING ("春天", "春暖"){
        @Override
        public void show() {
            System.out.println("春天在哪里");
        }
    },
    SUMMER ("夏天", "夏炎"){
        @Override
        public void show() {
            System.out.println("夏天在哪里");
        }
    },
    AUTUMN ("秋天", "秋凉"){
        @Override
        public void show() {
            System.out.println("秋天在哪里");
        }
    },
    WINTER ("冬天", "冬寒"){
        @Override
        public void show() {
            System.out.println("冬天在哪里");
        }
    };


    private final String seasonName;    //季节名字
    private final String seasonDesc;    //季节描述


    private Season3(String seasonName, String seasonDesc) {
        this.seasonDesc=seasonDesc;
        this.seasonName=seasonName;
    }


    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

}