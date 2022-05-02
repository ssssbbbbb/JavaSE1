public class PersonTest {
    String name;
    int age;

    public PersonTest(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void show(){
        System.out.println(name+"今年"+age+"岁了");
    }
}
