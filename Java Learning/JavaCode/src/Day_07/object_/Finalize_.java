package Day_07.object_;

/**
 * @Author: Song-zy
 * @Date: 2021/9/26 21:31
 * @Description: fnalize已经被弃用，以后别写这玩意
 */
public class Finalize_ {
    public static void main(String[] args) {
        Car car = new Car("宝马");
//        这时car对象就是一个垃圾,垃圾回收器就会回收(销毁)对象,在销毁对象前,会调用该对象的fina1ize方法
//        程序员就可以在 nalize中,写自己的业务逻辑代码(比如释放资源:数据库连接,或者打开文件)
//        如果程序员不重写 finalize,那么就会调用Object类的 finalize,即默认处理
        //如果程序员重写了 finalize,就可以实现自己的逻辑
        car = null;//这时对象空间就是一个垃圾


    }
}
class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }
    //重写finalize方法

    @Override
    //已经被弃用，以后别写这玩意
    protected void finalize() throws Throwable {
//        super.finalize();
        System.out.println("销毁汽车对象空间");
    }
}
