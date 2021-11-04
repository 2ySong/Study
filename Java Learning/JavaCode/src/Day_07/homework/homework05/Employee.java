package Day_07.homework.homework05;

/**
 * @Author: Song-zy
 * @Date: 2021/9/27 14:34
 * @Description:
 */
public class Employee {
    private String name;
    private double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    //打印工资的方法
    public void showSalary(){

        System.out.println("| name="+getName()+" | BasicSalary="+getBasicSalary()+" | yearSalary="+getBasicSalary()*12+" |");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
}
