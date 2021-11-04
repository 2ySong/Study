package Day_06;
public class MethodCopy {
    public static void main(String[] args) {
        Person2 p1 = new Person2();
        p1.name = "Tom";
        p1.age = 18;
        //创建tool对象
        MyTool02 myTool = new MyTool02();
        Person2 p2 = myTool.copy(p1);
        p2.age = 28;
        //p1\p2有独立的内存空间 八皇后
        System.out.println("p1的属性：name="+p1.name+" age="+p1.age);
        System.out.println("p2的属性：name="+p2.name+" age="+p2.age);
    }
}
class Person2{
    String name;
    int age;
}
class MyTool02{
    //
    public Person2 copy(Person2 p1) {
        Person2 p2 = new Person2();
        p2.name = p1.name;
        p2.age = p1.age;
        return p2;
    }
}