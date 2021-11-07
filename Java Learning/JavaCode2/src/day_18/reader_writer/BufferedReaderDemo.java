package day_18.reader_writer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: Song-zy
 * @Date: 2021/11/7 19:09
 * @Description:
 */
@SuppressWarnings("all")
public class BufferedReaderDemo {
    public static void main(String[] args) {
        String filePath = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\input01.txt";
        BufferedReader buf = null;

        try {
            buf = new BufferedReader(new FileReader(filePath));
            //按行读取
            String line;
            while ((line = buf.readLine()) != null) {//当读取完毕时，返回null
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                buf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
