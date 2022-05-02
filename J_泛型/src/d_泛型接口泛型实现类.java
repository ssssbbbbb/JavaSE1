/**
 *  这里的实现类是一个泛型类，而这个接口与 ‘d_泛型类接口实现类.java’ 实现的 ‘c_泛型接口<String>’ 不同；
 *  此实现类是还未定义 占位符 “T” 的引用类型，而 ’d_泛型类接口实现类.java’ 实现的接口已经定义为String了，因此占位符参数则就一定要是String对象；
 *  而此泛型实现类则是看创建的泛型对象的参数是什么类型的，则此接口才是什么类型的。
 * @param <T>
 */
public class d_泛型接口泛型实现类<T> implements c_泛型接口<T> {

    @Override
    public T server(T t) {
        System.out.println(t);
        return t;
    }

    public static void main(String[] args) {
        d_泛型接口泛型实现类<Boolean> d = new d_泛型接口泛型实现类<>();
        d.server(true);
    }
}
