package Day_06;

public class ThisDetail {
    public static void main(String[] args) {
        System.out.println("通过无参构造器访问有参构造器\n");
        T t = new T();
        t.method01();
        t.method02();
        System.out.println("\n直接访问有参构造器");
        T t2 = new T("琪琪",28);
        t2.method01();
        t2.method02();
    }
}
class T{
    String name;
    int age;
    //无参构造器
    public T(){
        //访问下面那个有参构造器,要放在第一条语句
        this("jack",19);
        System.out.println("无参构造器");
    }
    //this在构造器中的用法。不用再向以前一样String pName;int pAge;
    public T(String name,int age){
        System.out.println("有参构造器");
        this.name = name;
        this.age = age;
    }
    //成员方法中不可以调用构造器
    public void method01(){
        System.out.println("方法1");
    }
    public void method02(){
        //调用method01方法
        method01();
        //也可以通过this关键字调用本类中的方法
        this.method01();
        System.out.println("方法2");
    }
}