package Day_06;

/**
 * @构造器（构造方法）
 */
public class Constructor {
    public static void main(String[] args) {
        //当我们创建一个对象时，可以通过构造器直接指定对象的属性
        Person01 person1 = new Person01("小宋",20);
        System.out.println("name="+person1.name+" age="+person1.age);
        //第二个构造器
        Person01 person2 = new Person01("小琪琪");
        System.out.println("name="+person2.name+" age="+person2.age);
    }
}
class Person01{
    String name;
    int age;
    //构造器
    //    构造器没有返回值,也不能写void
    //    构造器的名称和类 Person01一样
    //    ( String pName, int pAge)是构造器形参列表,规则和成员方法一样
    public Person01(String pName,int pAge){
        System.out.println("构造器完成对向属性的初始化");
        name = pName;
        age = pAge;
    }
    //构造器可以重载
    public Person01(String pName){//age为默认值0
        System.out.println("我是第二个构造器，我们之间可以重载");
        name = pName;
    }
}
