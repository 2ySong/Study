package Day_14.generic;

import java.util.ArrayList;

/**
 * @Author: Song-zy
 * @Date: 2021/10/27 15:40
 * @Description: 泛型学习
 */
public class Generic {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog("狗大", 12));
        dogs.add(new Dog("狗二", 13));
//        dogs.add(new Cat());//不能加入其他类型
        for (Dog dog : dogs) {
            System.out.println(dog);
        }//增强for循环遍历

    }
}

class Dog {
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Cat {
    public Cat() {
    }
}
