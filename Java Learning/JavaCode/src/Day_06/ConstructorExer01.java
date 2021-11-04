package Day_06;

public class ConstructorExer01 {
    public static void main(String[] args) {
        //创建一个对象p1使用无参构造器初始化
        Person02 p1 = new Person02();
        System.out.println("p1.name="+p1.name+"  p1.age="+p1.age);
//        创建一个对象p2使用第二个构造器初始化
        Person02 p2 = new Person02("琪琪",19);
        System.out.println("p2.name="+p2.name+"  p2.age="+p2.age);
    }
}
class Person02 {
    String name;
    int age;
    //添加一个无参构造器，利用该构造的初始化的人的年龄都为18
    public Person02(){
        age = 18;
    }
    public Person02(String pName,int pAge){
        name = pName;
        age = pAge;
    }
}