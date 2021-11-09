package day_18.properties;

import java.io.*;

/**
 * @Author: Song-zy
 * @Date: 2021/11/9 15:37
 * @Description:
 */
public class Properties1 {
    public static void main(String[] args) throws IOException {
        //读取mysql.properties文件，得到ip,user,pwd
        BufferedReader buf = new BufferedReader(new FileReader("E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\properties\\mysql.properties"));
        String line = "";
        while ((line = buf.readLine()) != null) {
            String[] str = line.split("=");
            System.out.println(str[0]+"的值："+str[1]);
        }
        buf.close();
    }
}
