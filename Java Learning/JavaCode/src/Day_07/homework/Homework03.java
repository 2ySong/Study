package Day_07.homework;

/**
 * @Author: Song-zy
 * @Date: 2021/9/27 12:08
 * @Description:
 * 编写老师类 Homework03.java
 *
 * (1)要求有属性“姓名name”，“年龄age”，“职称post”，“基本工资 salary”
 * (2)编写业务方法， introduce()，实现输出一个教师的信息。
 * (3)编写教师类的三个子类:  教授类、副教授类、讲师类。工资级别分别为:教授为1.3、副教授为1.2、讲师1.1。在三个子类里面都重写父类的 introduce()方法。
 * (4)定义并初始化一个老师对象，调用业务方法，实现对象基本信息的后台打印
 */
public class Homework03 {
    public static void main(String[] args) {
        Teacher teacher = new Professor("jack",34,"教授",20000);
        teacher.introduce();
    }
}
class Teacher{
    private String name;
    private int age;
    private String post;//职称
    private double salary;
//    private double level = 1;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
//        this.level = level;
    }

    //编写业务方法
    public void introduce(){
        System.out.println("| name="+name+" | age="+age+" | post="+post+" | salary="+salary+" |");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}

//教授类
class Professor extends Teacher{
    private double level = 1.3;
    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }



    public void introduce(){
        System.out.println("| name="+getName()+" | age="+getAge()+" | post="+getPost()+" | salary="+getSalary()*level+" |");
    }
}
//副教授
class AssociateProfessor extends Teacher{
    private double level = 1.2;

    public AssociateProfessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    public void introduce(){
        System.out.println("| name="+getName()+" | age="+getAge()+" | post="+getPost()+" | salary="+getSalary()*level+" |");
    }
}
//讲师
class Lecturer extends Teacher{
    private double level = 1.1;
    public Lecturer(String name, int age, String post, double salary, double level) {
        super(name, age, post, salary);
    }

    public void introduce(){
        System.out.println("| name="+getName()+" | age="+getAge()+" | post="+getPost()+" | salary="+getSalary()*level+" |");
    }
}