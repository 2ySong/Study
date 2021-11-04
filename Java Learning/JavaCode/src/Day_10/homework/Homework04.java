package Day_10.homework;

/**
 * @Author: Song-zy
 * @Date: 2021/10/4 20:22
 * @Description:
 */
public class Homework04 {
    public static void main(String[] args) {

        CellPhone.testWork(new Calculator(){
            @Override
            public double work(double n1,double n2) {
                return n1+n2;
            }
        },3,4);
        CellPhone.testWork(new Calculator(){
            @Override
            public double work(double n1,double n2) {
                return n1*n2;
            }
        },3,100);

    }
}

//计算器接口
interface Calculator {
    double work(double n1,double n2);//运算功能
}

class CellPhone {

    public static void testWork(Calculator calculator,double n1,double n2) {
        System.out.println(calculator.work(n1,n2));
    }
}