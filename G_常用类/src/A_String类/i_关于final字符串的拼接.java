package A_String类;

/*
    1、常量与常量的拼接结果在常量池。并且常量池中不会存在相同内容的常量。
    2、只要妻子有一个是变量，结果就在堆中。
    3、如果凭借的结果第哦啊有intern()方法，返回值就在常量池中。
 */
public class i_关于final字符串的拼接 {
    public static void main(String[] args) {
        String s1 = "javaEEjavaSE";
        String s2 = "javaEE";
        String s3 = s2 + "javaSE";
        System.out.println(s1 == s3);   //false

        // 经过final修饰的变量就成为了常量   而常量与常量的拼接结果在常量池。并且常量池中不会存在相同内容的常量
        final String s4 = "javaEE";     //"javaEE"是常量，它不会变，但String s4 是变量，它的值可以随意变，因此被final修饰后s4就成为了常量
        String s5 = s4 + "javaSE";
        System.out.println(s1 == s5);   //true
    }
}
