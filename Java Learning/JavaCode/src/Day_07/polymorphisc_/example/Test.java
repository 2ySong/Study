package Day_07.polymorphisc_.example;

/**
 * @Author: Song-zy
 * @Date: 2021/9/26 1:07
 * @Description: 体验多态带来的代码复用性，便利的维护性
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog("大黄狗");
        Food food = new Bone("超级大骨头");
        Master master = new Master("Tom");
        master.feed(animal,food);

        animal = new Cat("加菲猫");
        food = new Fish("罗非鱼");
        master.feed(animal,food);

        animal = new Pig("小猪佩奇");
        food = new Rice("杂交水稻");
        master.feed(animal,food);
    }
}
