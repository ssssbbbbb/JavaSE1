import org.junit.Test;

/**
 *  1、java.lang.System类
 *      System类提供的 public static long currentTimeMillis() 用来返回当前时间与1970年1月1日0时0分0秒之间以毫秒位单位的时间差。
 *      此方法适用于计算时间差
 *
 */
public class a_Sysetm类中获取时间戳的方法 {
    @Test
    public void test1(){
        long time = System.currentTimeMillis();
        System.out.println(time);
        // 1638073840924        毫秒
        // 我们称之为 时间戳
    }
}
