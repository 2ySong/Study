package Day_07.homework;


/**
 * @Author: Song-zy
 * @Date: 2021/9/27 15:14
 * @Description:
 * 设计一个 Point类，其x和y坐标可以通过构造器提供。
 * 提供一个子类 LabeledPoint，其构造器接受一个标签值和x、y坐标，
 * 比如 new LabeledPoint(" BlackThursday"，1929，230.07)，写出对应的构造器即可
 */
public class Homework09 {
    public static void main(String[] args) {
        Point labeledPoint = new LabeledPoint(" BlackThursday",1929, 230.07);
        System.out.println(labeledPoint.toString());
    }
}
class Point{
    private double x;
    private double y;
    //构造器，提供x，y坐标值
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return
                "x=" + x +
                        ", y=" + y;
    }
}
class LabeledPoint extends Point{
    private String label;

    public LabeledPoint( String label,double x, double y) {
        super(x, y);
        this.label = label;
    }

    @Override
    public String toString() {
        return "LabeledPoint{" +
                "label='" + label + '\''+"," +super.toString()+
                '}';
    }
}