package day_18.reader_writer;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: Song-zy
 * @Date: 2021/11/7 14:46
 * @Description: FileWriter相关方法测试
 *      将 海内存知己，天涯若比邻 写入到output01.txt中
    * 1. `write(int)`：写入单个字符
     * 2. `write(char[])`：写入指定数组
     * 3. `write(char[], off, len)`：写入指定数组的指定部分
     * 4. `write(string)`：写入整个字符串
     * 5. `write(string, off, len)`：写入字符串的指定部分
 */
public class FileWriterDemo {

    @Test
    public void m1(){
        String fileName ="E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\output.txt";//如果没有文件，会自动创建

        FileWriter writerF = null;

        try {
            writerF = new FileWriter(fileName);
            // 1. `write(int)`：写入单个字符
            writerF.write(65);//A
            //2. `write(char[])`：写入指定数组
            char[] buf = {'a','b','c','d'};
            writerF.write(buf);//abcd
            //`write(char[], off, len)`：写入指定数组的指定部分
            writerF.write(buf,1,2);//bc
            //4. `write(string)`：写入整个字符串
            String str = "hello,world";
            writerF.write(str);
            //5. `write(string, off, len)`：写入字符串的指定部分
            String str1 = "天涯若比邻";
            writerF.write(str1,0,4);//天涯若比
            //
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writerF.close();//关闭
//                writerF.flush();//刷新..选一个
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
