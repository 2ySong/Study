package day_18.transform;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @Author: Song-zy
 * @Date: 2021/11/9 14:52
 * @Description:
 * 演示使用工 InputStreamReader转换流解决中文码问题
 * 将字芳流 FileInputStream转成字符流 InputStreamReader,指定编码gbk/utf-8
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\a.txt";
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "UTF-8");
        //传入BufferedReader
        BufferedReader br = new BufferedReader(isr);
        //读取
        String line = br.readLine();
        System.out.println(line);
        //关闭外层流
        br.close();

    }
}
