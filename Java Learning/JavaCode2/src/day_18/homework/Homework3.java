package day_18.homework;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author: Song-zy
 * @Date: 2021/11/9 16:35
 * @Description:
 */
public class Homework3 {
    public static void main(String[] args) throws IOException {
        String filePath = "src/day_18/homework/dog.properties";
        Properties pps = new Properties();
        pps.setProperty("name","tom");
        pps.setProperty("age","5");
        pps.setProperty("color","red");
        pps.store(new FileWriter(filePath),null);


    }
}
