package day_18.outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: Song-zy
 * @Date: 2021/11/6 17:04
 * @Description: 复制图片
 */
@SuppressWarnings("all")
public class FileCopy {
    public static void main(String[] args) {
        String srcPath = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\头像.jpg";
        String destPath = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\头像副本.jpg";
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;

        try {
            fileIn = new FileInputStream(srcPath);
            fileOut = new FileOutputStream(destPath);
            //定义一个字节数组，提高读取xiaol
            byte[] bs = new byte[1024];
            int readLen = 0;
            while ((readLen = fileIn.read(bs)) != -1) {
                fileOut.write(bs, 0, readLen);//输出流
            }
            System.out.println("拷贝完成");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileIn != null){
                    fileIn.close();
                }
                if(fileOut!=null){
                    fileOut.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
