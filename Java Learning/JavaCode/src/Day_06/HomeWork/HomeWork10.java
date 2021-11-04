package Day_06.HomeWork;

/**
 * 创建一个 Employee类，属性有(名字,性别,年龄,职位,薪水)，提供3个构造方法，
 *
 * - 可以初始化
 *   1. (名字,性别,年龄,职位,薪水)
 *   2. (名字,性别,年龄)
 *   3. (职位,薪水)要求充分复用构造器 …
 */
public class HomeWork10 {
    public static void main(String[] args) {
        Employee em1 = new Employee("张三","男",28,"总经理",30000);
        Employee em2 = new Employee("李四","男",34);
        Employee em3 = new Employee("主管",20000);
        System.out.println(em1.name+" "+em1.gender+" "+em1.age+" "+em1.position+" "+em1.salary);
        System.out.println(em2.name+" "+em2.gender+" "+em2.age+" "+em2.position+" "+em2.salary);
        System.out.println(em3.name+" "+em3.gender+" "+em3.age+" "+em3.position+" "+em3.salary);
    }
}
class Employee{
    String name;
    String gender;
    int age;
    String position;
    int salary;
    //构造器

    public Employee(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public Employee(String position,int salary){
        this.position = position;
        this.salary = salary;
    }
    public Employee(String name, String gender, int age, String position,int salary){
        this(name,gender,age);
        this.position = position;
        this.salary = salary;
    }
}