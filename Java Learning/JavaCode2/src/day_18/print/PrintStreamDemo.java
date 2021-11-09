package day_18.print;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @Author: Song-zy
 * @Date: 2021/11/9 15:13
 * @Description: 打印流
 */
public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        PrintStream ps = System.out;
        ps.println("hello,world");//默认打印到显示器
        ps.write("hhh".getBytes()); //println方法底层也是调用的write
        //改变打印的位置
        System.setOut(new PrintStream("E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\a.txt"));
        System.out.println("hello，琪琪子，你说猪");//在文件a.txt中
        ps.close();
    }
}
