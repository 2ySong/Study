package day_18.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @Author: Song-zy
 * @Date: 2021/11/6 14:46
 * @Description:
 */
@SuppressWarnings("all")
public class FileInformation {
    public static void main(String[] args) {

    }
    @Test
    public void info(){
        //创建文件
        File file = new File("E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\test1.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("文件名："+file.getName());
        System.out.println("绝对路径："+file.getAbsolutePath());
        System.out.println("文件父目录："+file.getParent());
        System.out.println("文件大小(字节)："+file.length());
        System.out.println("文件是否存在："+file.exists());
        System.out.println("是不是一个文件："+file.isFile());
        System.out.println("是不是一个目录："+file.isDirectory());

    }
}
