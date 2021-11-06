package day_18.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @Author: Song-zy
 * @Date: 2021/11/6 15:03
 * @Description:
 */
@SuppressWarnings("all")
public class DirectoryDel {
    public static void main(String[] args) {

    }
    @Test
    public void m1(){
        String filePath = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\test1.txt";
        File file = new File(filePath);
        if(file.exists()) {
            if(file.delete()) {
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }
        }else{
            System.out.println("该文件不存在");
        }
    }
    @Test
    public void m2(){
        String filePath = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\test";
        File file = new File(filePath);
        if(file.exists()) {
            if(file.delete()) {
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }
        }else{
            System.out.println("该文件目录不存在");
        }
    }
    @Test
    public void m3(){
        String filePath = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\test";
        File file = new File(filePath);
        if(file.exists()) {
            System.out.println("目录存在");
        }else{
            file.mkdirs();
            System.out.println("目录创建成功");
        }
    }
}
