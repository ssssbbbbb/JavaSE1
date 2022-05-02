public class a_自定义泛型 {
    public static void main(String[] args) {
        People<String> people = new People<>("马大哈",30,"中国","是个大憨憨");
        System.out.println(people);

        // 由于子类在继承带泛型的父类时，指明了泛型类型。则实例化子类对象时，不再需要指明泛型。
        Chinese c1 = new Chinese();
        c1.name="马小哈";
        c1.age=10;
        c1.Country_of_Citizenship="中国";
        c1.introduce="顶呱呱";
        System.out.println(c1);

    }
}

class People <T> {
    String name;
    int age;
    String Country_of_Citizenship;  //国籍

    // 当类设置泛型后，类的内部结构就也能使用该泛型类
    T introduce;    //介绍    此类型的用途是用以简短的自我介绍，后面我会把其设置为String类型

    public People(){}

    public People(String name,int age, String Country_of_Citizenship, T introduce){
        this.name=name;
        this.age=age;
        this.Country_of_Citizenship=Country_of_Citizenship;
        this.introduce=introduce;
    }
    // 此方法并不是泛型方法，并不是说方法中使用了类的泛型就是泛型方法
    public T getIntroduce() {
        return introduce;
    }

    public void setIntroduce(T introduce) {
        this.introduce = introduce;
    }

    @Override
    public String toString(){
        return this.name+this.age+"岁,来自"+this.Country_of_Citizenship+","+"人如其名，"+this.introduce+"。";
    }
}

class Chinese extends People<String>{

    public void getC(){
        System.out.println("美国虽远，但必诛之！");
    }
}