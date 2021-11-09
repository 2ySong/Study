package day_18.homework;

import java.io.*;
import java.util.Properties;

/**
 * @Author: Song-zy
 * @Date: 2021/11/9 16:42
 * @Description:
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Dog dog;
        String filePath = "src/day_18/homework/dog.properties";
        Properties pps = new Properties();
        try {
            pps.load(new FileReader(filePath));
            dog = new Dog(pps.getProperty("name"), Integer.parseInt(pps.getProperty("age")), pps.getProperty("color"));
            System.out.println(dog);
            String str = "src/day_18/homework/dog.dat";
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(str));
            oos.writeObject(dog);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
