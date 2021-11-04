package Day_09.innerclass;

/**
 * @Author: Song-zy
 * @Date: 2021/10/3 19:45
 * @Description: 局部内部类的使用
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 out = new Outer02();
        out.m1();
    }
}
class Outer02 {
    private static int n1 = 100;
    private void m2(){
        System.out.println("Outer02 m2();");
    }
    public void m1(){
        //局部内部类是定义外部类的局部位置，通常在方法体中
        //不能添加访问修饰符，但是可以用final修饰
        class Inner02 {//本质上还是一个类，正常的类有的属性，它也有
            int n1=90;
            //可以直接访问外部类的成员，包括私有的
            public void f1(){
                System.out.println("n1="+Outer02.n1);
                m2();
            }
        }

        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
}