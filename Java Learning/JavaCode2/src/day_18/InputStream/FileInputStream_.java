package day_18.InputStream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: Song-zy
 * @Date: 2021/11/6 15:55
 * @Description: 单个字节读取
 */
@SuppressWarnings("all")
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    //用read()
    @Test
    public void readFile1() {
        String filePath = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\input01.txt";
        int readF = 0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            //返回-1.表示读取完毕
            while ((readF = fileInputStream.read()) != -1) {
                System.out.print((char) readF);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流。释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    //read(byte[] b)
    @Test
    public void readFile2() {
        String filePath = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\input01.txt";
        int readF = 0;
        //字节数组
        byte[] b = new byte[8];//一次读取8个字节
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            //返回-1.表示读取完毕
            while ((readF=(fileInputStream.read(b))) != -1) {
                System.out.print(new String(b, 0, readF));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流。释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
