package Day_07.super_;

public class B extends A {
    //访问父类的属性，但是不能访问被private修饰的属性n4
    public void hi() {
        System.out.println(super.n1 + " " + " " + super.n2 + " " + super.n3);//n4被private修饰，子类不能访问
    }
    String age;

    public B() {

    }
}
