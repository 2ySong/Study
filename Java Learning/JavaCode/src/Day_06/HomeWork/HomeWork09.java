package Day_06.HomeWork;

/**
 * 在测试方法中，调用 method方法,代码如下,编译正确，试写出 method方法的定义形式,
 */
public class HomeWork09 {
    public static void main(String[] args) {
        A09 a = new A09();
        a.test();
    }
}
class A09{
    public double method(double n1,double n2){
        return n1>n2?n1:n2;
    }
    public void test(){
        System.out.println( method( method(10.0,20.0),100));
    }
}