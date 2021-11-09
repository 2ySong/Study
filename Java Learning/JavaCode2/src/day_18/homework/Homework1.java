package day_18.homework;

import org.junit.platform.commons.function.Try;

import java.io.*;

/**
 * @Author: Song-zy
 * @Date: 2021/11/9 16:16
 * @Description:
 */
public class Homework1 {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\my_temp\\";
        File file = new File(filePath);
        if(file.exists()) {
            System.out.println(file.getName()+"已经存在");
        }else{
            file.mkdirs();
            System.out.println("目录创建成功");
        }
        File temp = new File(filePath,"hello.txt");
        if(temp.exists()) {
            System.out.println(temp.getName()+"文件已存在");
        }else{
            try {
                temp.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(temp,true));
        writer.write("hello,world");
        writer.newLine();
        System.out.println("写入成功！");
        writer.close();
    }
}
