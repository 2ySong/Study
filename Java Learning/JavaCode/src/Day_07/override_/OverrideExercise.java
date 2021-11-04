package Day_07.override_;

/**
 * @Author: Song-zy
 * @Date: 2021/9/25 21:54
 * @Description:
 */
public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("jack",16);
        Student student = new Student("Tom",25,20190436,77);

        System.out.println(person.say());
        System.out.println("==========");
        System.out.println(student.say());
    }
}


class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public String say() {
        return "name="+name+", age="+age;
    }
}

class Student extends Person{
    private int id;
    private double score;

    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say() {
        //体现super的好处
        return super.say()+", id="+id+", score="+score;
    }
}