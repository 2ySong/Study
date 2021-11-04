package Day_10.homework;

/**
 * @Author: Song-zy
 * @Date: 2021/10/4 20:17
 * @Description:
 */
public class Homework03 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.shout();
        Dog dog = new Dog();
        dog.shout();
    }
}

abstract class Animal {
    abstract void shout();
}
class Cat extends Animal {
    @Override
    void shout() {
        System.out.println("小猫喵喵叫……");
    }
}
class Dog extends Animal {
    @Override
    void shout() {
        System.out.println("小狗汪汪叫……");
    }
}