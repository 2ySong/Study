package Day_06.HomeWork;

/**
 * 定义一个圆类 Circle,定义属性:半径。提供显示圆周长功能的方法，提供显示圆面积的方法
 */
public class HomeWork05 {
    public static void main(String[] args) {
        Circle a = new Circle(6);
        System.out.println("圆的周长="+a.perimeter()+"\n圆的面积为="+a.area());
    }
}
class Circle {
    double radius;
    //构造器
    public Circle(double radius){
        this.radius = radius;
    }
    //返回圆的周长
    public double perimeter(){
        return 2*radius*(double)Math.PI;
    }
    public double area(){
        return radius*radius*(double)Math.PI;
    }
}