package Day_06;

//使用面向对象OOP来解决养猫问题
//定义一个猫类--自定义数据类型
class Cat{
    //属性或者叫成员变量
    String name;
    int age;
    String color;
}
public class ObjectCat {
    public static void main(String[] args) {
        //实例化一只猫--创建一个猫对象
        //new Cat();创建一只猫
        //Cat cat1 = new Cat();把创建的猫赋给cat1
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";
        //创建第二只猫对象
        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.color = "花色";
        //访问对象的属性
        System.out.println("第一只猫的信息："+cat1.name+"的年龄是"+cat1.age+"岁，颜色是"+cat1.color);//第一只猫对象的信息
        System.out.println("第二只猫的信息："+cat2.name+"的年龄是"+cat2.age+"岁，颜色是"+cat2.color);//第一只猫对象的信息
    }

}
