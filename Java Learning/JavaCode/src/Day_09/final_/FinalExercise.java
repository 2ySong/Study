package Day_09.final_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/1 18:16
 * @Description:
 * 请编写一个程序, 能够计算圆形的面积。要求圆周率为3.14.
 * 赋值的位置3个,,方式都写一下
 */
public class FinalExercise {
    public static void main(String[] args) {
//        System.out.println(new Circle(2).area());
        System.out.println(Circle.getInstance().area()) ;
    }
}
class Circle{
    private final static double PAI=3.14;//圆周率用final修饰，用户不能更改
    private double radius;

    private Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return PAI*radius*radius;
    }
    //单例设计模式，饿汉式
    private static Circle circle = new Circle(2);
    public static Circle getInstance(){
        return circle;
    }
}