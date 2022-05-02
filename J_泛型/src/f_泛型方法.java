/**
 *  泛型方法
 *  语法：<T> 返回值类型
 */
public class f_泛型方法 {
    //泛型方法
    public <T> T show(T t){
        System.out.println("泛型方法！"+ t);
        return t;
    }

    public static void main(String[] args) {
        f_泛型方法 f = new f_泛型方法();
        System.out.println("返回值：" + f.show(123));

    }
}
