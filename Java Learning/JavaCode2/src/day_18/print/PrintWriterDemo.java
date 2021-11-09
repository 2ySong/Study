package day_18.print;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: Song-zy
 * @Date: 2021/11/9 15:24
 * @Description:
 */
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
//        PrintWriter pw = new PrintWriter(System.out);

        PrintWriter pw = new PrintWriter(new FileWriter("E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\a.txt"));
        pw.println("你好，北京");//在文件a.txt中
        pw.write("你好，中国");
        pw.close();

    }
}
