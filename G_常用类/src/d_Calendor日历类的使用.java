import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class d_Calendor日历类的使用 {
    /*
        实例化
            方式1：创建其子类（GregorianCalendar）的对象
            方式2：调用其静态方法getInstance()

        常用方法
            get()
            set()
            add()
            getTime()
            setTime()
     */
    @Test
    public void test1(){
        //不管用哪个构造方式其所造的对象都是GregorianCalendar
        Calendar calendar = new GregorianCalendar();
        Calendar calendar1 = Calendar.getInstance();
        System.out.println(calendar.equals(calendar1)); // true
        System.out.println(calendar.getClass());    // class java.util.GregorianCalendar


    }
}
