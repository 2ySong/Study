package day_18.properties;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author: Song-zy
 * @Date: 2021/11/9 16:06
 * @Description: 创建、修改配置文件
 */
public class PropertiesDemo2 {
    public static void main(String[] args) throws IOException {
        Properties pps = new Properties();
        pps.setProperty("charset", "utf-8");
        pps.setProperty("user", "宋");
        pps.setProperty("pwd", "8784szy");
        pps.store(new FileWriter("src/day_18/properties/mysql2.properties"), null);
    }
}
