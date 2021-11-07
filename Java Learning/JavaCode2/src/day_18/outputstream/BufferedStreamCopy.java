package day_18.outputstream;

import java.io.*;

/**
 * @Author: Song-zy
 * @Date: 2021/11/7 20:01
 * @Description:
 */
public class BufferedStreamCopy {
    public static void main(String[] args) {
        String srcPath = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\头像.jpg";
        String destPath = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\头像副本.jpg";
        BufferedInputStream srcJpg = null;
        BufferedOutputStream destJpg = null;

        try {
            srcJpg = new BufferedInputStream(new FileInputStream(srcPath));
            destJpg = new BufferedOutputStream(new FileOutputStream(destPath));
            int readLen;
            byte[] buf = new byte[1024];
            while ((readLen = srcJpg.read(buf)) != -1) {//读完，返回-1
                destJpg.write(buf, 0, readLen);
            }
            System.out.println("拷贝成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                srcJpg.close();//只需要关闭外层流
                destJpg.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
