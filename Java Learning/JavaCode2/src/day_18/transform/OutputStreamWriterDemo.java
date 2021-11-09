package day_18.transform;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @Author: Song-zy
 * @Date: 2021/11/9 15:05
 * @Description:
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\b.txt";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath),"utf-8");
        osw.write("琪琪子，你说hello,world");
        osw.close();
    }
}
