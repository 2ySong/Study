package day_18.homework;

import java.io.*;

/**
 * @Author: Song-zy
 * @Date: 2021/11/9 16:31
 * @Description:
 */
public class Homework2 {
    public static void main(String[] args) {
        String filePath = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\a.txt";
        BufferedReader reader = null;
        try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath),"gbk");
            reader = new BufferedReader(isr);
            String line = "";
            int lineCount = 0;
            while ((line = reader.readLine()) != null) {
                if (lineCount < 9) {
                    System.out.println(" " + (++lineCount) + ": " + line);
                } else {
                    System.out.println((++lineCount) + ": " + line);
                }
            }
            System.out.println("读取完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
