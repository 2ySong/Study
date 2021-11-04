package Day_06;

public class Scope {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();
        dog.run();
    }
}
class Dog{
    //全局变量：name\age,即dog的属性
    String name = "狗大";
    int age = 5;
    int weight ;//属性可以不用赋值。int的默认值为0；
    //成员方法：speak,狗会叫。
    public void speak(){
        System.out.println("狗会叫");
        //局部变量：color\length.作用域只在本方法中
        String color = "白色";
//        int length9;//局部变量必须赋值。因为没有默认值；全局变量可以不用赋初始值，因为有默认值
        int length = 89;
//        属性和局部变量可以重名，访问时时遵循就近原则
        String name = "狗二";
        System.out.println("name="+name + " weight="+weight+" age=" + age + " color=" +color+" length="+length);
    }
    public void run(){
        System.out.println("狗会跑");
        int speed = 100;
        System.out.println(name+"的速度为："+speed+"m/s");
//        System.out.println(length);//是speak方法的局部变量，不能再run方法使用
    }
}