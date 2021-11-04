package Day_10.homework;

/**
 * @Author: Song-zy
 * @Date: 2021/10/4 20:22
 * @Description:
 */
public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
    }
}
class A {
    private final String NAME = "Tom";
    public void f1() {
        class B {
            private final String NAME = "jack";

            public void show() {
                System.out.println("内部类的name="+NAME+"\n外部类的name="+A.this.NAME);
            }
        }
        B b = new B();
        b.show();
    }
}