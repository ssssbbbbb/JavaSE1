package A_String类;

/**
 *  1. boolean endsWith(String suffix)：测试此字符串是否以指定的后缀结束
 *  2. boolean startsWith(String prefix)：测试此字符串是否以指定的前缀开始
 *  3. boolean startsWith(String prefixint, int toffset)：测试此字符串从指定索引开始的子字符串是否以指定前缀开始
 *  4. boolean contains(CharSequence s)：当且仅当此字符串包含指定的char值序列时，返回true
 *  5. int indexOf(String str)：返回指定子字符串在此字符串中第一次出现处的索引
 *  6. int indexOf(String str,int fromlndex)：返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始
 *  7. int lastIndexOf(String str)：返回指定子字符串在此字符串中最右边出现处的索引
 *  8. int lastIndexOf(String str, int fromlndex)：返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索
 *  注：indexOf和lastlndexOf方法如果未找到都是返回-1
 */
public class e_String中的常用方法2 {
    public static void main(String[] args) {
        String s1 = "If you intend using humor in your talk to make people smile...";

        // 1. boolean endsWith(String suffix)：测试此字符串是否以指定的后缀结束
        System.out.println(s1.endsWith("..."));     // true

        // 2. boolean startsWith(String prefix)：测试此字符串是否以指定的前缀开始
        System.out.println(s1.startsWith("qbc"));   // false

        // 3. boolean startsWith(String prefixint,int toffset)：测试此字符串从指定索引开始的子字符串是否以指定前缀开始
        System.out.println(s1.startsWith("you", 3));    // true

        // 4. boolean contains(CharSequence s)：当且仅当此字符串包含指定的char值序列时，返回true
        System.out.println(s1.contains("to"));      // true

        // 5. int indexOf(String str)：返回指定子字符串在此字符串中第一次出现处的索引
        System.out.println(s1.indexOf("you"));      // 3

        // 6. int indexOf(String str,int fromlndex)：返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始
        System.out.println(s1.indexOf("your", 10)); // 29

        // 7. int lastIndexOf(String str)：返回指定子字符串在此字符串中最右边出现处的索引
        System.out.println(s1.lastIndexOf("..."));  // 59

        // 8. int lastIndexOf(String str, int fromlndex)：返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索,也就是从指定的地方从右往左
        System.out.println(s1.lastIndexOf("in", 5));    // -1

    }
}
