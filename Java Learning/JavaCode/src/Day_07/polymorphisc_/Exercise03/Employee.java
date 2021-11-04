package Day_07.polymorphisc_.Exercise03;

/**
 * @Author: Song-zy
 * @Date: 2021/9/26 16:18
 * @Description:
 */
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //计算年薪
    public double getAnnual() {
        return 12*salary;
    }
}
