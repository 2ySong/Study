package day_18.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @Author: Song-zy
 * @Date: 2021/11/6 14:23
 * @Description: 创建文件的几种方法
 */
@SuppressWarnings("all")
public class CreatFile {
    public static void main(String[] args) {

    }
    //01
    @Test
    public void creat01() {
        String filePath = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\creat01.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("文件1创建成功");
    }
    //方式2
    @Test
    public void creat02(){
        File parent = new File("E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\");
        String child  = "creat02.txt";
        File file = new File(parent,child);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("文件2创建成功");
    }
    //方式3
    @Test
    public void creat03(){
        String parent = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\";
        String child  = "creat03.txt";
        File file = new File(parent,child);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("文件3创建成功");
    }
}
