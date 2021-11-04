package Day_13.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Song-zy
 * @Date: 2021/10/23 10:03
 * @Description:
 */
public class CollectionExercise {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("大黄",2));
        list.add(new Dog("小白",3));
        list.add(new Dog("大虎",6));
        list.add("jjjj");

        System.out.println("====使用迭代器遍历====");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object next =  it.next();
            System.out.println(next);
        }
        System.out.println("====使用增强for遍历====");
        for (Object d : list) {
            System.out.println(d);
        }

    }
}
@SuppressWarnings("all")
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}