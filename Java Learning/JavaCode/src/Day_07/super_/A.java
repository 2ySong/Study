package Day_07.super_;

public class A {
    //四个访问权限不同的属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public A() {
        // 无参构造器
        System.out.println("父类Base()构造器被调用...");
    }

    public A(int n1) {
        System.out.println("我是父类中的有参构造器Base(int n1)，调用我时，你一定用super指定我");
    }

    //定义一个公共的方法，让子类可以访问父类中被private修饰的n4
    public int getN4() {
        return n4;
    }

    //四个访问权限不同的成员方法
    public void test100() {
        System.out.println("test100");
    }

    protected void test200() {
        System.out.println("test200");
    }

    void test300() {
        System.out.println("test300");
    }

    private void test400() {
        System.out.println("test400");
    }
}
