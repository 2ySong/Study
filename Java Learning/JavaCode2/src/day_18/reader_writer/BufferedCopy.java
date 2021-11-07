package day_18.reader_writer;

import java.io.*;

/**
 * @Author: Song-zy
 * @Date: 2021/11/7 19:30
 * @Description: 拷贝文本文件
 */
public class BufferedCopy {
    public static void main(String[] args) throws IOException {
        String srcPath = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\copySrc.txt";
        String destPath = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\copyDest.txt";
        BufferedReader srcTxt = new BufferedReader(new FileReader(srcPath));
        BufferedWriter destTxt = new BufferedWriter(new FileWriter(destPath));
        String line;
        while ((line = srcTxt.readLine()) != null){
            destTxt.write(line);
            destTxt.newLine();
        }
        System.out.println("文本复制完毕！");
        srcTxt.close();
        destTxt.close();
    }
}
