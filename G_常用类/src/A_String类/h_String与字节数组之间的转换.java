package A_String类;

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 *  String 与 byte[] 之间的转换
 *
 *      1、String --> byte[]:调用String的getBytes()
 *      2、byte[] --> String:调用String的构造器
 *
 *      编码：字符串 --> 字节 （看得懂 --- 看不懂的二进制数据）   就好像是1
 *      解码：编码的逆过程，字节 --> 字符串（看不懂的二进制数据 --- 看得懂的字符串）     就好像是2
 */
public class h_String与字节数组之间的转换 {
    public static void main(String[] args) {

        String str1 = "abc123";
        // 1、String --> byte[]:调用String的getBytes()
        byte[] b1 = str1.getBytes();
        System.out.println(Arrays.toString(b1));

        // 2、byte[] --> String:调用String的构造器
        String str2 = new String(b1);
        System.out.println(str2);
    }
}
