package Day_06;

/**
 * 判断两个人名字和年龄是否一样
 */
public class ThisExercise01 {
    public static void main(String[] args) {
        Person03 p1 = new Person03("小明",18);
        Person03 p2 = new Person03("小明",18);
        System.out.println("p1和p2是不是一样的？"+p1.compareTo(p2));
    }
}
class Person03{
    String name;
    int age;
    public Person03(String name,int age){
        this.name = name;
        this.age = age;
    }
    public boolean compareTo(Person03 p){
        return this.name.equals(p.name) && this.age==p.age;
    }
}