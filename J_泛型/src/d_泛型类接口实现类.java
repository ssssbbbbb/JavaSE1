/**
 *  实现泛型接口的实现类，此处的泛型接口的占位符参数以为 String ，因此创建对象调用server()方法则就必须使用String。
 */
public class d_泛型类接口实现类 implements c_泛型接口<String>{

    @Override
    public String server(String s) {
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        d_泛型类接口实现类 d = new d_泛型类接口实现类();
        d.server("hello");
    }
}

