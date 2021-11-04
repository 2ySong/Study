package Day_06.HomeWork;

import java.util.Scanner;

/**
 * 编程创建一个Cale计算类，在其中定义2个变量表示两个操作数，
 * 定义四个方法实现求和、差、乘、商(要求除数为0的话,要提示)并创建两个对象，分别测试
 */
public class HomeWork06 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Cale a1 = new Cale(12,6);
                a1.sum();
        a1.poor();
        a1.take();
        a1.shang();
        System.out.println("第二个对象");
        Cale a2 = new Cale(34,90);
        a2.sum();
        a2.poor();
        a2.take();
        a2.shang();
    }
}
class Cale{
    double n1;
    double n2;
    public Cale(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    //和
    public void sum(){
        System.out.println("n1+n2="+(n1+n2));
    }
    //差
    public void poor(){
        System.out.println("n1-n2="+(n1-n2));
    }
    //乘
    public void take(){
        System.out.println("n1*n2="+n1*n2);
    }
    //商
    public void shang(){
        if(n2==0){
            System.out.println("分母不能为0");
        }else {
            System.out.println("n1/n2=" + n1 / n2);
        }
    }
}