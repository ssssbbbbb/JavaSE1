package A_String类;

public class 复习String与包装类的转换 {
    public static void main(String[] args) {
        //1、String --->	基本数据类型、包装类：调用包装类的静态方法：parseXxx(str)
        //   比如把String的数据转换为int的类型、
        String str = "1900";
        int i1 = Integer.parseInt(str);
        System.out.println(i1);

	    // 2、基本数据类型、包装类 ---> String：调用String重载的valueOf(xxx)
		int i2 = 100;
		String str2 = String.valueOf(i2);
        System.out.println(str2);
    }
}
