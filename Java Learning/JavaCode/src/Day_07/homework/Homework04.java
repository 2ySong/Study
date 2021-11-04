package Day_07.homework;



/**
 * @Author: Song-zy
 * @Date: 2021/9/27 14:03
 * @Description:
 * 通过继承实现员工工资核算打印功能Homework04.java
 * 父类：员工类
 * 子类：部门经理类、普通员工类
 * (1)部经理工资=1000+单日工资*天数*等级(1.2)。
 * (2)普通员工工资=单日工资*天数*等级(1.0)
 * (3)员工属性：姓名，单日工资，工作天数
 * (4)员工方法(打印工资)
 * (5)普遍员工及部门经理都是员工子类，需要重写打印工资方法。
 * (6)定义并初始化普通员工对象，调用打印工资方法输入工资，定义并初始化部门经理对象调用打印工资方法输入工资。
 */
public class Homework04 {
    public static void main(String[] args) {
        Employee em1 = new Staff("jack",200,25);
        em1.totalSalary();
        Employee em2 = new Manager("Tom",500,22);
        em2.totalSalary();
    }
}
class Employee{
    private String name;
    private double daySalary;
    private int workDays;
    public double level = 1.0;

    public Employee(String name, double daySalary, int workDays) {
        this.name = name;
        this.daySalary = daySalary;
        this.workDays = workDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }



    public void totalSalary() {
        System.out.println("| name="+name+" | daySalary="+daySalary+" | workDays="+workDays+
                " | level="+level+" | totalSalary="+daySalary*workDays*level+" |");
    }
}

class Staff extends Employee{
    public Staff(String name, double daySalary, int workDays) {
        super(name, daySalary, workDays);
        level = 1.0;
    }
//    public void totalSalary() {
//        System.out.println("| name="+getName()+" | daySalary="+getDaySalary()+" | workDays="+getWorkDays()+
//                " | level="+level+" | totalSalary="+getDaySalary()*getWorkDays()*level+" |");
//    }
    public void totalSalary() {
        super.totalSalary();
    }
}
class Manager extends Employee{

    public Manager(String name, double daySalary, int workDays) {
        super(name, daySalary, workDays);
        level = 1.2;
    }
    public void totalSalary() {
        System.out.println("| name="+getName()+" | daySalary="+getDaySalary()+" | workDays="+getWorkDays()+
                " | level="+level+" | totalSalary="+(1000+getDaySalary()*getWorkDays()*level)+" |");
    }
}