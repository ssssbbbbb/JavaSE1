package A_String类;

import org.junit.Test;

public class j_常见算法题 {
    public static void main(String[] args) {
        String str = "abcdefg";
        String str2 = FZ.fz(str,0,6);
        System.out.println(str2);

        String strs = "jwuujwuuyghjwuugjwuhgyjw";
        System.out.println(HQ.hq("jw", strs));
    }

}

// 将一个字符进行反转，将字符串中指定部分进行反转。比如“abcdefg”反转为“abfedcg”
class FZ {
    public static String fz(String str, int index1, int index2){
        // 将一个字符进行反转
        // char charAt(int index):返回某索引处的字符
        char[] chars = str.toCharArray();

        chars[index1] = str.charAt(index2);
        chars[index2] = str.charAt(index1);

        return new String(chars);
    }

}

// 获取一个字符串再另一个字符串中出现的次数，比如“ac”在“acacacacaca”里出现过几次
// int indexOf(String str,int fromlndex)：返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始,如果没有就返回 -1
class HQ {
    public static int hq(String str1, String str2){
        int i = 0;  // 计算字符串出现的次数
        int n = 0;  // 存储上次字符串出现的位置，然后从此位置再查找一次，从0开始
        while (n < str2.length()){
            if (str2.indexOf(str1, n) != -1){
                n = str2.indexOf(str1, n) + str1.length();
                ++i;
                ++n;
            }
        }
        return i;
    }
}

