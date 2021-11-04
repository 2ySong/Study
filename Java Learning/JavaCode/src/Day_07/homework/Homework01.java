package Day_07.homework;


/**
 * @Author: Song-zy
 * @Date: 2021/9/27 9:33
 * @Description:
 * 1. 定义一个 Person类{name,age,job}，初始化 Person对象数组，有3个 person对象，
 * 并按照age从大到小进行排序提示，使用冒泡排序
 */
public class Homework01 {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("jack",45,"医生");
        person[1] = new Person("Tom",14,"学生");
        person[2] = new Person("kobe",678,"工人");

        //输出未排序的对象数组
        System.out.println("=====对象未排序====");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);//默认调对象的toString()方法1
        }

        //使用冒泡排序
        Person pp;
        for (int i = 0; i < person.length-1; i++) {
            for (int j = 0; j < person.length-1-i; j++) {
                if(person[j].getAge()<person[j+1].getAge()){
                     pp = person[j+1];
                     person[j+1] = person[j];
                     person[j] = pp;
                }
            }
        }
        System.out.println("====对象数组以从大到小排列====");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
    }
}
class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}