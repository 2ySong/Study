package Day_07.polymorphisc_.Exercise02;

/**
 * @Author: Song-zy
 * @Date: 2021/9/26 15:18
 * @Description:
 */
public class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String say() {
        return super.say()+"salary="+salary+" |";
    }

    public void teach(){
        System.out.println(getName()+"在教学……");
    }
}
