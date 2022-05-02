package A_String类;

import java.util.Locale;

/**
 *  1. int length():返回字符串的长度 -- return value.length
 *  2. char charAt(int index):返回某索引处的字符 -- return value[index]
 *  3. boolean isEmpty():判断是否是空字符串:return value.length == 0
 *  4. String toLowercase():使用默认语言环境，将String 中的所有字符转换为小写
 *  5. String toUpperCase():使用默认语言环境，将String 中的所有字符转换为大写
 *  6. String trim():返回字符串的副本，忽略前导空白和尾部空白
 *  7. boolean equals(Object obj):比较字符串是否相同
 *  8. boolean equalsIgnoreCase(String anotherString):与equals方法类似，但是它忽略大小写
 *  9. String concat(String str):将指定字符串连接到此字符串的结尾。等价于用 ”+“ 拼接字符串。
 *  10. int compareTo(String anotherString):比较两个字符串的大小。如果输出正数，则就是当前调用方法的对象大；如果输出负数，则就是调用方法的当前对象小。
 *  11. String substring(int beginIndex): 返回一个新的字符串，它是此字符串的从beginIndex开始截取的新字符串。注意，这是包括该参数的下标量的字符到末尾。
 *  12. String substring(int beginIndex, int endIndex):返回一个新字符串，它是此字符串从beginIndex开始到endIndex结束的新字符串
 *
 *  注意，这些方法里，不能跟python一样，使用-1代表到数第一个下标量。
 */
public class d_String中的常用方法 {
    public static void main(String[] args) {
        // 1. int length():返回字符串的长度
        String s1 = "asdfghjkl";
        System.out.println(s1.length());    // 9

        // 2. char charAt(int index):返回某索引处的字符
        String s2 = "hello,world";
        System.out.println(s2.charAt(5));   // ，

        // 3. boolean isEmpty():判断是否是空字符串
        String s3 = "          ";
        System.out.println(s3.isEmpty());   // false    空格也是字符

        // 4. String toLowercase():使用默认语言环境，将String 中的所有字符转换为小写
        String s4 = "Hello Java";
        System.out.println(s4.toLowerCase());   // hello java

        // 5. String toLowercase():使用默认语言环境，将String 中的所有字符转换为大写
        String s5 = "Hello Java";
        System.out.println(s5.toUpperCase());   // HELLO JAVA

        // 6. String trim():返回字符串的副本，忽略前导空白和尾部空白
        String s6 = " aaaa ";
        System.out.println(s6.trim());

        // 7. boolean equals(Object obj):比较字符串是否相同
        String s7_1 = "hello";
        String s7_2 = "Hello";
        System.out.println(s7_1.equals(s7_2));  // false

        // 8. boolean equalsIgnoreCase(String anotherString):与equals方法类似，但是它忽略大小写
        String s8_1 = "hello";
        String s8_2 = "Hello";
        System.out.println(s8_1.equalsIgnoreCase(s8_2));    // true

        // 9. String concat(String str):将指定字符串连接到此字符串的结尾
        String s9 = "Hello";
        System.out.println(s9.concat(" Java"));     // Hello Java

        // 10. int compareTo(String anotherString):比较两个字符串的大小
        String s10_1 = "abc";
        String s10_2 = "ABC";
        String s10_3 = "zXc";
        System.out.println(s10_1.compareTo(s10_2));     // 32
        System.out.println(s10_1.compareTo(s10_3));     // -25

        // 11. String substring(int beginIndex): 返回一个新的字符串，它是此字符串的从beginIndex开始截取的新字符串
        String s11 = "This 撒币";
        System.out.println(s11.substring(2));   // is 撒币

        // 12. String substring(int beginIndex, int endIndex):返回一个新字符串，它是此字符串从beginIndex开始到endIndex结束的新字符串
        String s12 = "构建在1秒中成功完成";
        System.out.println(s12.substring(6, s12.length()-1)); // 成功完
    }
}
