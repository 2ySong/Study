package Day_07.extendsLearn;

public class ExtendsDetail {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.sayOK();
        System.out.println("====通过第二个构造器初始化的对象s2========");
        Sub s2 = new Sub("jack");
    }
}

//父类
class Base {
    //四个访问权限不同的属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base() {
        // 无参构造器
        System.out.println("父类Base()构造器被调用...");
    }

    public Base(int n1) {
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

    //可以定义一个公共的方法，让子类可以访问父类中被private修饰的test400()
    public void callTest400() {
        test400();
    }
}

//子类
class Sub extends Base {
    public Sub() {
        //默认调用父类中的构造器
//        super();//这个代码写不写系统中都存在。

        System.out.println("子类Sub()构造器被调用....");
    }

    public Sub(String name) {
        //通过super关键字，指定父类中的有参构造器Base(int n1)
        super(100);
        System.out.println("子类Sub(String name)构造器被调用....");
    }

    public void sayOK() {
        System.out.println(n1 + "  " + n2 + " " + n3 + " ");//被private修饰的n4不能被子类调用
        //通过父类中公共的方法getN4()，让子类可以访问父类中被private修饰的n4
        System.out.println("我是通过父类中公共的方法返回的n4=" + getN4());
        test100();
        test200();
        test300();        //父类中被private修饰的test400()不能被子类调用


        //通过父类中公共的方法，让子类可以访问父类中被private修饰的test400()
        callTest400();
    }

}