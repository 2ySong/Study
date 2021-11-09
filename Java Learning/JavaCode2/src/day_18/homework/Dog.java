package day_18.homework;

import java.io.Serializable;

/**
 * @Author: Song-zy
 * @Date: 2021/11/9 16:40
 * @Description:
 */
public class Dog implements Serializable {
    String name;
    int age;
    String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}