package Day_09.abstract_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/3 14:13
 * @Description:
 */
public class AbstractExercise {
    public static void main(String[] args) {
        CommonEmployee c = new CommonEmployee("jack",1,2000);
        Manager manager = new Manager("Tom",2,30000,40000);
        c.work();
        System.out.println(c);
        manager.work();
        System.out.println(manager);
    }
}
abstract class Employee{
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}

class CommonEmployee extends Employee{
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工："+getName()+" 工作中……");
    }

}

class Manager extends Employee{
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理："+getName()+" 工作中……");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                ", salary=" + getSalary()  +
                ", bonus=" + bonus +
                '}';
    }
}