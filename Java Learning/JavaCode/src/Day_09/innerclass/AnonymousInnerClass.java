package Day_09.innerclass;

/**
 * @Author: Song-zy
 * @Date: 2021/10/3 21:56
 * @Description: 匿名内部类详解
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}
class Outer04{
    private int n1=10;
    public void method(){
        //基于接口的匿名内部类
        //tiger的编译类型：IA接口
        //tiger的运行类型：这个匿名内部类Outer04$1
        /*
        底层
        class XX implements IA{
        //XX:Outer04$1,也就是匿名内部类真正的名字,系统分配的，用完一次就没有了
            @Override
            public void cry() {
                System.out.println("老虎机…………");
            }
        }
         */
        //创建匿名内部类之后，jdk马上又创建了一个对象实例tiger
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎机…………");
            }
        };
        System.out.println("tiger的运行类型："+tiger.getClass());
        tiger.cry();

        //基于类的匿名内部类
        //father编译类型：Father
        //father运行类型：这个匿名内部类Outer04$2
        //也直接返回了这个匿名内部类的对象father
        /*
        底层
        class Outer04$2 extends Father{}
         */
        Father father = new Father("jack"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写了Father的test方法");
            }
        };
        father.test();
        System.out.println("father的运行类型："+father.getClass());
        //两种方式调用方法
        new Father("jack"){
            @Override
            public void xx() {
                System.out.println("匿名内部类重写了Father的xx方法");
            }
        }.xx();
    }
}

interface IA {
    public void cry();
}
class Father {
    public Father(String name){}
    public void test(){}
    public void xx(){}
}