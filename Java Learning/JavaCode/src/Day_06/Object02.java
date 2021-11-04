package Day_06;

public class Object02 {
    public static void main(String[] args) {
        Person a = new Person();
        a.age = 10;
        a.name = "小明";
        Person b = a;
        System.out.println(b.name);
        b.age = 200;
        b = null;//将对象b置空
        System.out.println(a.age);//200
        System.out.println(b.age);//不存在，抛出异常
    }
}

