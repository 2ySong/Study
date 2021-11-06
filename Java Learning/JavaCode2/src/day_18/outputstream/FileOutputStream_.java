package day_18.outputstream;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: Song-zy
 * @Date: 2021/11/6 16:33
 * @Description:
 */
public class FileOutputStream_ {
    /*
    演示使用FiLeOutputStream将数据写到文件中
    如果该文件不存在,则创建该文件
     */
    @Test
    public void writeFile(){
        String filePath = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\output01.txt";
        FileOutputStream outF = null;
        try {
//            outF = new FileOutputStream(filePath);//1. 会覆盖原来的内容
            outF = new FileOutputStream(filePath,true);//2. 不会覆盖原来的内容，追加
            //写入一个字节
            outF.write('a');
            //写入一个字符串
            String str = ",hello,world";
            outF.write(str.getBytes());//getBytes()将字符串转为字符数组
            outF.write(str.getBytes(),3,7);//指定str中具体的字符,表示从索引3开始，共7个->llo,wor
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭
            try {
                outF.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
