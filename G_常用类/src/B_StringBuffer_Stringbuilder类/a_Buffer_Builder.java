package B_StringBuffer_Stringbuilder类;

import org.junit.Test;

/**
 *  <h2>关于StringBuffer 和 StringBuilder的使用</h2>
 *  <br/>
 *  <h3>一、String、StringBuffer、StringBuilder三者的异同</h3>
 *  <ul>
 *      <ol>String:不可变字符序列; 底层使用char[]存储 </ol>
 *      <ol>StringBuffer:可变的字符序列; 底层使用char[]存储; 线程安全的，但效率低 </ol>
 *      <ol>StringBuilder:可变的字符序列; 底层使用char[]存储; jdk5.0新增的，线程不安全的，但效率高 </ol>
 *  </ul>
 *  <p><strong>因此，如果要考虑线程安全，则使用StringBuffer，否则使用StringBuilder</strong></p>
 *  <hr/>
 *  <h3>二、源码分析</h3>
 *  <pre>
 *
 *  </pre>
 *  <hr/>
 *  <h3>String、StringBuffer、StringBuilder三者的效率</h3>
 *  <p>StringBuilder > StringBuffer > String</p>
 */
public class a_Buffer_Builder {

    @Test
    public void Test2() {
        /*
            StringBuffer的常用方法
            1. StringBuffer append(XXX) : 提供了多种类型的append()方法，可以使不同的类型参数转换为String类型再进行字符串拼接。
            2. StringBuffer delete(int start, int end) : 删除指定范围的内容，start开始，end结束，不包括end。
            3. StringBuffer replace(int start, int end, String str) : 把[start,end]范围的值替换为str。
            4. StringBuffer insert(int offset, xxx) : 在指定位置插入xxx。
            5. StringBuffer reverse() : 把当前字符序列逆转。
            6. public int indexOf(String str) : 返回此字符串中第一次出现指定子字符串的索引。
            7. public String substring(int start, int end) : 返回一个从start开始到end结束的子字符串。
            8. public int length() : 返回序列元素的长度
            9. public char charAt(int n) :  返回该索引值上的字符
            10. public void setCharAt(int n, char ch) : 将所在位置的字符改为新的ch

            方法链：super
         */
        StringBuffer sbu1 = new StringBuffer("abcdefg");
        // 1. StringBuffer append(XXX)
        sbu1.append(1);
        sbu1.append('o');
        sbu1.append(true);
        System.out.println(sbu1);   // abcdefg1otrue

        // 2. StringBuffer delete(int start, int end)
        sbu1.delete(7, 8);
        System.out.println(sbu1);   // abcdefgotrue

        // 3. StringBuffer replace(int start, int end, String str)
        sbu1.replace(0, 7, "ABC");
        System.out.println(sbu1);   // ABCotrue

        // 4. StringBuffer insert(int offset, xxx)
        sbu1.insert(3, '-');    //当插入了 - 后，此字符串的位置和内容就发生了变化
        sbu1.insert(5, '-');
        System.out.println(sbu1);   // ABC-o-true

        // 5. StringBuffer reverse()
        sbu1.reverse();
        System.out.println(sbu1);   // eurt-o-CBA

        // 9. public char charAt(int n) :  返回该索引值上的字符
        System.out.println(sbu1.charAt(5)); // o
    }


    @Test
    public void Test1() {
        StringBuffer sbu1 = new StringBuffer("abcd");
        // setCharAt(int index, char ch)-----指定索引处的字符设置为ch
        sbu1.setCharAt(0, 'M');
        System.out.println(sbu1);   // Mbcd
        System.out.println(sbu1.length());  // 4
        /*
                在 StringBuffer 的对象 sbu1 调用 setCharAt()方法 后，是直接把底层存储的char[]里的元素
            给改变了因为在下方是直接输出 sbu1 的值，并没有对其进行二次操作，如果是String的对象想要改变值，
            就需要再次赋值才行。
         */
    }


}
