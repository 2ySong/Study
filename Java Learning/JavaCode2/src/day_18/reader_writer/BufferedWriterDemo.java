package day_18.reader_writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: Song-zy
 * @Date: 2021/11/7 19:20
 * @Description:
 */
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\output.txt";
        BufferedWriter buf = null;
        buf = new BufferedWriter(new FileWriter(filePath,true));//true追加
        String str1 = "hello，琪琪子";//注意换行符
        buf.write(str1);
        buf.newLine();//插入一个和系统相关的换行符
        String str2 = "hello，Jack";
        buf.write(str2);
        buf.newLine();//插入一个和系统相关的换行符
        buf.flush();
    }
}
