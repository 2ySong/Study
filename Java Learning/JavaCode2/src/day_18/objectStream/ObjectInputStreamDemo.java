package day_18.objectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Author: Song-zy
 * @Date: 2021/11/9 14:03
 * @Description:
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws Exception {
        String filePath = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\data.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        //注意：读取(反序列化)的顺序要和存放(序列化)的顺序保持一致
        System.out.println(ois.readInt());
        System.out.println(ois.readChar());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Object o = ois.readObject();
        System.out.println(o.getClass().getName());
        System.out.println(o);
        //我们要调用Dog类的方法，需要向下转型
        Dog dog = (Dog)o;
        System.out.println(dog.getName());
        dog.run();
        ois.close();
    }
}
