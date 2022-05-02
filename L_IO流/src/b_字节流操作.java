import org.testng.annotations.Test;

import java.io.*;

/**   FileInputStream字节输入流     FileOutpuStream字节输出流
 *
 *  对于文本文件使用字符流操作
 *  对于非文本文件使用字节流操作
 *
 *  使用字节流处理文本文件可能会出现问题（乱码等。。。）
 */
public class b_字节流操作 {
    /*
        用字节流复制图片，操作与用字符流复制文件一致
     */
    @Test
    public void Test1(){
        File file1 = new File("src//test.jfif");
        File file2 = new File("src//test2.jfif");

        // FileInputStream从文件系统中的文件中获取输入字节。
        FileInputStream fis = null;
        // FileOutputStream是用于将数据写入File或FileDescriptor的输出流。
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);
            int len;
            while ((len = fis.read()) != -1){
                fos.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (fis != null){

                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null){

                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
