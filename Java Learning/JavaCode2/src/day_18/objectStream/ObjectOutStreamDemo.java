package day_18.objectStream;

import java.io.*;

/**
 * @Author: Song-zy
 * @Date: 2021/11/9 13:37
 * @Description: 序列化
 */
public class ObjectOutStreamDemo {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\Study\\Java Learning\\JavaCode2\\src\\day_18\\test_file\\data.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        //序列化到文件data.dat.  包装类实现了Serializable接口
        oos.writeInt(100);
        oos.writeChar('a');
        oos.writeBoolean(true);
        oos.writeDouble(100.67);
        oos.writeUTF("宋章耀");//存放字符串
        //保存一个Dog对象
        oos.writeObject(new Dog("Jack",67));
        oos.close();
    }
}
//必须实现Serializable接口
class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void run(){
        System.out.println("我是一只狗，汪汪汪");
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}