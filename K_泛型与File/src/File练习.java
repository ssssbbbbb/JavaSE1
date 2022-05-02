import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class File练习 {
    @Test
    public void Test1() throws IOException {
        File file = new File("hello.txt");
        File file1 = new File(file.getParent(),"haha.txt");
        boolean yn = file1.createNewFile();
        if (yn){
            System.out.println("创建成功！");
        }
    }
}
