package Day_07.homework.homework05;

/**
 * @Author: Song-zy
 * @Date: 2021/9/27 14:32
 * @Description:
 * 设计父类一员工类。子类:工人类、农民类、教师类、科学家类、服务生类。
 * (1)其中工人、农民、服务生只有基本工资
 * (2)教师除基本工资外还有课酬(元/天)
 * (3)科学家除基本工资外还有年终奖
 * (4)编写一个测试类将各种类型的员工的全年工资打印出来
 */
public class Homework05 {
    public static void main(String[] args) {
        Employee employee = new Worker("工人",2000);
        employee.showSalary();
        employee = new Farmers("农民",1500);
        employee.showSalary();
        employee = new Teacher("教师",4000,100,204);
        employee.showSalary();
        employee = new Scientists("科学家",10000,300000);
        employee.showSalary();
        employee = new Waiter("服务员",1900);
        employee.showSalary();
    }
}
