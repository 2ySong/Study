package Day_06.HomeWork;

/**
 * 设计一个Dog类,  有名字、颜色和年龄属性，定义输出方法show()显示其信息。并创建对象,进行测试
 */
public class HomeWork07 {
    public static void main(String[] args) {
        Dog a = new Dog("大黄", "黄色", 2);
        Dog b = new Dog("小白", "白色", 3);
        a.show();
        b.show();
    }
}

class Dog {
    String name;
    String color;
    int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void show() {
        System.out.println(this.name + "的颜色为：" + this.color + ",年龄为：" + this.age);
    }
}