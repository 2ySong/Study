package day_18.reader_writer;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: Song-zy
 * @Date: 2021/11/7 14:27
 * @Description: FileReader相关方法测试
 */

public class FileReaderDemo {
    //方式1： `read()`：每次读取单个字符，返回该字符，如果到文件未尾返回-1。读取文件
    @Test
    public void m1() {
        String fileName = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\input01.txt";
        FileReader fileReader = null;//`new FileReader(File/String)`
        int data = 0;
        try {
            fileReader = new FileReader(fileName);
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //方式2：`read(char[])`：批量读取多个字符到数组，返回读取到的字符数，如果到文件未尾返回-1
    @Test
    public void m2() {
        String fileName = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\input01.txt";
        FileReader fileReader = null;//`new FileReader(File/String)`
        int readLen = 0;
        char[] buf = new char[8];
        try {
            fileReader = new FileReader(fileName);
            while ((readLen = fileReader.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
