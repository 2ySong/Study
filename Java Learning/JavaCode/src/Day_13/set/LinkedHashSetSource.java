package Day_13.set;

import java.util.LinkedHashSet;

/**
 * @Author: Song-zy
 * @Date: 2021/10/24 22:09
 * @Description:
 */
public class LinkedHashSetSource {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        //元素是有序的
        linkedHashSet.add(new String("AA"));
        linkedHashSet.add(456);
        linkedHashSet.add(456);//true
        linkedHashSet.add(new Cat("小白", 1001));
        linkedHashSet.add(123);
        linkedHashSet.add("SZY");
        System.out.println(linkedHashSet);//[AA, 456, Cat{name='小白', age=1001}, 123, SZY]

    }
}

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}