package Day_09.abstract_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/1 19:10
 * @Description: 抽象类
 */
public class Abstract01 {
    public static void main(String[] args) {

    }
}
abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    //这里的eat方法其实没有什么意义-
    // --父类方法不确定性的问题
    //将该方法设计为抽象方法abstract
    //抽象方法就是没有实现的方法，即没有方法体
    //当一个类中存在抽象方法是=时，需要将该类声明为抽象类
//    public void eat(){
//        System.out.println("这是一个动物，但是不知道吃什么？");
//    }
    public abstract void eat();
}