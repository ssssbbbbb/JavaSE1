import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  以下都是JDK8之前的日期时间的API
 *  Date类的API不易于国际化，大部分被废弃了，所以日期时间有了新的类
 *      java.text.SimpleDateFormat类是一个不与语言环境有关的方式来格式化和解析日期的具体类。
 *      它允许进行格式化：日期-->文本、解析：文件-->日期
 *
 *      - 格式化：
 *          SimpleDateFormat() : 默认的模式和语言环境创建对象。
 *          public SimpleDateFormat(String pattern) : 该构造方法可以用参数pattern指定的格式创建一个对象，该对象调用。
 *          public String format(Date date) : 方法格式化时间对象date。
 *
 *      - 解析：
 *          public Date parse(String source) : 从给定字符串的开始解析文本，以生成一个日期；注意构造器的格式，如果是默认格式就按照
 *                                          默认格式的字符串解析，若是自定义格式，去javaAPI查看其它相应的格式。
 *
 */
public class c_SimpleDataFormat类的使用 {
    /*
    SimpleDateFormat的使用：SimpleDateFormat 对日期Date类的格式化和解析

        1、两个操作
            格式化：日期 ----> 字符串
            解析： 格式化逆过程，字符串 ----> 日期

        2、SimpleDateFormat的实例化

     */
    // 使用默认的构造器
    @Test
    public void test1(){
        // 实例化SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat();

        // 格式化：日期 ---> 字符串
        String format = sdf.format(new Date());
        System.out.println(format); // 2021/11/28 下午3:46

        // 解析：格式化逆过程，字符串 ----> 日期
        String str = "2077/12/12 上午00:00";

        try {
            Date date = sdf.parse(str);
            System.out.println(date);   // Sun Dec 12 00:00:00 CST 2077
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
