import org.junit.Test;

import java.util.Date;

/**
 *  java.util.Date类
 *      表示特定的瞬间，精确到毫秒
 *
 *      1、构造器：
 *          Date(): 使用无参构造器创建的对象可以获取本地当前时间
 *          Date(long date)
 *
 *      2、常用方法：
 *          getTime(): 返回自1970年1月1日 00：00：00 GMT以来的时间此Date对象表示的毫秒数
 *          toString(): 把此Date对象转换为以下形式的String：dow mon dd hh：mm：ss zzz yyy
 *                      其中：dow是一周中的某一天就是星期几，zzz是时间标准。
 *
 *      3、java.sql.Date 对应着数据库中的日期类型的变量
 *          > 如何实例化
 *          > 如何将 util.Date 对象转换为 sql.Date 对象
 */
public class b_Date类的使用1 {
    @Test
    public void test1(){
        //  Date(): 使用无参构造器创建的对象可以获取本地当前时间
        Date date1 = new Date();
        System.out.println(date1.toString());
        // Sun Nov 28 12:40:57 CST 2021
        // 星期 月  日   时间         年

    }

    @Test
    public void test2(){
        Date date1 = new Date();
        Date date2 = new Date(date1.getTime());
        System.out.println(date2.toString());
        // Sun Nov 28 12:46:28 CST 2021
        // 相当于把对应的毫秒数，转化为 标准时间格式
    }

    @Test
    public void test3(){
        Date date = new Date();
        System.out.println(date.getTime()); // 1638075060071

        // 如何实例化
        java.sql.Date dateSQL = new java.sql.Date(date.getTime() * 2);
        System.out.println(dateSQL.toString()); // 2073-10-25

        // 如何将 util.Date 对象转换为 sql.Date 对象
        Date UtilDate = new java.sql.Date(date.getTime() * 2);
        System.out.println(UtilDate.toString());
    }
}
