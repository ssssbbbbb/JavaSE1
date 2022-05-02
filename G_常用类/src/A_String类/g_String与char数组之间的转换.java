package A_String类;

/**
 *  String 与 char[] 之间的转换
 *
 *      1、String --> char[]:调用String的toCharArray()方法
 *
 *      2、char[] --> String;调用String的构造器
 */
public class g_String与char数组之间的转换 {
    public static void main(String[] args) {
        String str1 = "abc123";

        // 1、String --> char[]:调用String的toCharArray()方法
        char[] charArray = str1.toCharArray();
        for (int i = 0; i < charArray.length; i++){
            System.out.println(charArray[i]);
        }

        // 2、char[] --> String;调用String的构造器
        String str2 = new String(charArray);
        System.out.println(str2);
    }
}
