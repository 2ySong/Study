package Day_07.override_;

/**
 * @Author: Song-zy
 * @Date: 2021/9/25 21:04
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();
    }
}

class Animal {
    //父类属性
    String name;
    //写一个动物会叫的方法
    public void speak(){
        System.out.println("动物都会叫");
    }

    void run(){
        System.out.println("动物会跑");
    }

    public Object eat(){
        System.out.println("动物要吃事物");
        return null;
    }

}
//动物的子类狗
class Dog extends Animal{
    //    因为Dog是 AnimaL子类
//    Dog的speak方法和 AnimaL的speak定义形式一样(名称、返回类型、参数)
    //所以称Dog子类中的方法speak是对父类Animal中speak方法重写
    //1.访问权限不变，返回类型一样，方法名一样，形参一样--方法重写
    public void speak(){
        System.out.println("狗会汪汪叫");
    }
    //2.访问权限提升，返回类型一样，方法名一样，形参一样--方法重写
    protected void run(){
        System.out.println("狗会跑");
    }
    //3.访问权限不变，返回类型(Object->String,String是Object的子类)，方法名一样，形参一样--方法重写
    public String eat(){
        System.out.println("狗咬吃屎");
        return null;
    }
    //4.只要在上述集中条件内，各种组合，也同样是方法重写
}

