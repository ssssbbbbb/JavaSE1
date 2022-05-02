package A_String类;

/**
 *  1. String replace(char oldChar, char newChar):返回一个新的字符串，它是通过用newChar替换此字符串中出现的所有oldChar得到的。
 *  2. String replace(CharSequence target, CharSequence replacement):使用指定的字面值替换序列替换比字符串所有匹配字面值目标序列的子字符串。
 *  3. String replaceAll(String regex, String replacement):使用给定的replacement替换此字符串所有匹配给定的正则表达式的子字符串。
 *  4. String replaceFirst(String regex, String replacement):使用给定的replacement替换此字符串匹配给定的正则表达式的第一个子字符串。
 *  5. boolean matches(String regex):告知此字符串是否匹配给定的正则表达式。
 *  6. String split(String regex)：根据给定正则表达式的匹配拆分此字符串。
 *  7. String split(String regex,int limit):根据匹配给定的正则表达式来拆分此字符串，最多不超过limit个，如果超过了，剩下的全部都放到最后一个元素中。
 */
public class f_String中的常用方法3 {
    public static void main(String[] args) {
        String s1 = "If you intend using humor in your talk to make people smile...";

        // 1. String replace(char oldChar, char newChar):返回一个新的字符串，它是通过用newChar替换此字符串中出现的所有oldChar得到的。
        System.out.println(s1.replace(' ', '|'));   // If|you|intend|using|humor|in|your|talk|to|make|people|smile...

        // 2. String replace(CharSequence target, CharSequence replacement):使用指定的字面值替换序列替换比字符串所有匹配字面值目标序列的子字符串。
        System.out.println(s1.replace(" ", "|"));   // If|you|intend|using|humor|in|your|talk|to|make|people|smile...

        // 3. String replaceAll(String regex, String replacement):使用给定的replacement替换此字符串所有匹配给定的正则表达式的子字符串。
        System.out.println(s1.replaceAll(" ", "__"));   // If__you__intend__using__humor__in__your__talk__to__make__people__smile...

        //  4. String replaceFirst(String regex, String replacement):使用给定的replacement替换此字符串匹配给定的正则表达式的第一个子字符串。

        //  5. boolean matches(String regex):告知此字符串是否匹配给定的正则表达式。
        System.out.println(s1.matches("you"));      // false

        //  6. String split(String regex)：根据给定正则表达式的匹配拆分此字符串。

        //  7. String split(String regex,int limit):根据匹配给定的正则表达式来拆分此字符串，最多不超过limit个，如果超过了，剩下的全部都放到最后一个元素中。

    }
}
