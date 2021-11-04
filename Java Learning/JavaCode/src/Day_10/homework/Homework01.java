package Day_10.homework;

/**
 * @Author: Song-zy
 * @Date: 2021/10/4 19:54
 * @Description:
 */
public class Homework01 {
    public static void main(String[] args) {
        Car c = new Car();
        Car c1= new Car(100);
        System.out.println(c);
        System.out.println(c1);
    }
}
class Car {
    double price = 10;
    static String color = "white";
    public String toString() {
        return price + "\t" + color;
    }

    public Car() {
        this.price = 9;
        Car.color = "red";
    }

    public Car(double price) {
        this.price = price;
    }
}
/*
输出结果
9 red
100 red
 */