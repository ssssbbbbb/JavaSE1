package A_String类;

/**
 *  <h3>String str1 = "abc";</h3>
 *  <p>以上面的代码为例：</p>
 *  <ol>
 *      <li>
 *          <strong>String str1</strong> 的str1是变量
 *      </li>
 *      <li>
 *          <strong>= "abc";</strong> 中的"abc"是常量
 *      </li>
 *  </ol>
 *
 */
public class c_String不同拼接操作的对比 {
    public static void main(String[] args) {
        String s1 = "javaSE";
        String s2 = "python3";

        String s3 = "javaSEpython3";
        String s4 = "javaSE" + "python3";
        String s5 = s1 + s2;
        String s6 = s1 + "python3";
        String s7 = "javaE" + s2;

        // s3是字面量赋值，而s4是两个字面量连接后再赋值，因为字面量"javaSEpython3" 等于 "javaSE" + "python3"，所以s4是跟s3一样的字面量赋值
        System.out.println(s3 == s4);   //true
        // 而以下都是变量名参与的拼接赋值，只要是有变量参与就都相当于new，在堆中创建新对象
        System.out.println(s3 == s5);   //false
        System.out.println(s3 == s6);   //false
        System.out.println(s3 == s7);   //false
        System.out.println(s5 == s6);   //false
        System.out.println(s5 == s7);   //false

        String s8 = s3 + s4;
        String s9 = s3 + s4;
        System.out.println(s8 == s9);   //false

        // 如果拼接的结构调用intern()方法，返回常量池中与调用者（这里是s5）值相同的常量值
        String s10 = s5.intern();
        System.out.println(s3 == s10);  //true
        /*  总结
                常量与常量的拼接结构在常量池，且常量池中不会存在另一个相同内容的常量。
                只要拼接的值其中有一个是变量，结果就在堆中。
                如果拼接的结构调用intern()方法，返回值就在常量池中。
         */
    }
}
