package Day_09.single_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/1 0:41
 * @Description: 单例模式--懒汉式
1. 将构造器私有化
2. 定义一个static静态对象
3. 定义一个public的static方法，可以返回一个Cat对象
 */
public class SingleTon02 {
    public static void main(String[] args) {
        System.out.println(Cat.n1);
    }
}
//一个人只能养一只猫，即只能创建一个Cat对象
class Cat{
    private String name;
    public static int n1 = 999;
    //2.定义一个static静态对象
    private static Cat cat;//相对于饿汉式，此处没有new
    //1.将构造器私有化
    private Cat(String name) {
        this.name = name;
    }
    //3.定义一个public的static方法，可以返回一个Cat对象
    public static Cat getInstance(){
        //如果没有cat对象，就创建一个，如果已经有了一个cat对象，就不会再创建，用于只有一个
        if(cat==null) {
            cat = new Cat("小猫咪");
        }
        return cat;
    }
}