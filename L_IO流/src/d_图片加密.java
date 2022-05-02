import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  图片加密，就是用字符流从图片中读入字节到程序中，然后再在程序中对得到的字节进行处理然后再写出到另一个图片文件中，而这个写出后的图片就是加密后的图片。
 */
public class d_图片加密 {
    @Test
    public void test() throws IOException {
        //创建读入图片的字节流
        FileInputStream fis = new FileInputStream("src//lol.jpg");
        //创建写出图片的字节流
        FileOutputStream fos = new FileOutputStream("src//加密.jpg");

        byte[] buffer = new byte[20];
        int len;
        while ((len = fis.read(buffer)) != -1){
            //字节数组进行修改
            for (int i = 0; i < len; i++){
                buffer[i] = (byte) (buffer[i] ^ 5);
            }

            fos.write(buffer,0,len);
        }

        fos.close();
        fis.close();
        System.out.println("加密完成！");
    }

    @Test
    public void 解密() throws IOException {
        FileInputStream fis = new FileInputStream("src//加密.jpg");
        FileOutputStream fos = new FileOutputStream("src//解密.jpg");

        byte[] buffer = new byte[20];
        int len;
        while ((len = fis.read(buffer)) != -1){
            for (int i=0; i<len; i++){
                buffer[i] = (byte) (buffer[i] ^ 5);     // m^n^n = m    按位异或
            }                                           // 因为加密时已经 ^5 了，因此只需要再执行一次 ^5 就能变回原的数

            fos.write(buffer);
        }

        fis.close();
        fos.close();
        System.out.println("解密完成！");
    }
    @Test
    public void test1(){
        // java中的数学计算，需要使用 Math 类
        System.out.println(5^2);    // 7
        System.out.println();
    }
}















