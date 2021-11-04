package Day_06;

public class PropertyDetail {
    //编写一个main方法
    public static void main(String[] args) {
        //创建一个person对象
//        per是对象名，new Person()创建的对象空间才是真正的对象
        Person per = new Person();
        per.gender = '男';
        System.out.println(per.name+" "+per.age+" "+per.gender);
//        定义属性后后,如果没有赋值,有默认值
//        int 0. short 0, byte 0，long 0；float 0.0,
//        double 0.0， char \u0000. Boolean false. String null
    }
}
//创建一个Person类，定义三个成员变量
class Person {
    String name;
    int age;
    char gender;
}
